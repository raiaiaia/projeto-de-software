package templateMethod.pagamentos.processadorPagamentos;

import templateMethod.pagamentos.Pagamento;
import templateMethod.pagamentos.estrategiaPagamento.EstrategiaPagamento;

public class PagamentoCartaoDeCredito extends Pagamento {

    public PagamentoCartaoDeCredito(EstrategiaPagamento estrategiaPagamento) {
        super(estrategiaPagamento);
    }

    @Override
    protected void executarPagamento() {
        System.out.println("Executando pagamento com cartão de crédito...");
    }

    @Override
    protected void validarDetalhesPagamento() {
        System.out.println("Validando informações do cartão de crédito...");
    }
}
