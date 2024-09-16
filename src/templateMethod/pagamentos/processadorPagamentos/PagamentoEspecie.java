package templateMethod.pagamentos.processadorPagamentos;

import templateMethod.pagamentos.Pagamento;
import templateMethod.pagamentos.estrategiaPagamento.EstrategiaPagamento;

public class PagamentoEspecie extends Pagamento  {

    public PagamentoEspecie(EstrategiaPagamento estrategiaPagamento) {
        super(estrategiaPagamento);
    }

    @Override
    protected void executarPagamento() {
        System.out.println("Executando pagamento em espécie...");
    }

}
