package templateMethod.pagamentos.processadorPagamentos;

import templateMethod.pagamentos.Pagamento;
import templateMethod.pagamentos.estrategiaPagamento.EstrategiaPagamento;

public class PagamentoPix extends Pagamento {

    public PagamentoPix(EstrategiaPagamento estrategiaPagamento) {
        super(estrategiaPagamento);
    }

    @Override
    protected void executarPagamento() {
        System.out.println("Executando pagamento por Pix...");
    }
}
