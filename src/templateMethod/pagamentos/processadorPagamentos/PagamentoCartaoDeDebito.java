package templateMethod.pagamentos.processadorPagamentos;

import templateMethod.pagamentos.Pagamento;
import templateMethod.pagamentos.estrategiaPagamento.EstrategiaPagamento;

public class PagamentoCartaoDeDebito extends Pagamento {

    public PagamentoCartaoDeDebito(EstrategiaPagamento estrategiaPagamento) {
        super(estrategiaPagamento);
    }

    @Override
    protected void executarPagamento() {
        System.out.println("Executando pagamento com Cartão de débito...");
    }

    @Override
    protected void validarDetalhesPagamento() {
        System.out.println("Validando informações do cartão de débito...");
    }
}
