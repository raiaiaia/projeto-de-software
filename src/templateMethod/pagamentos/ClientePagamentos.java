package templateMethod.pagamentos;

import templateMethod.pagamentos.estrategiaPagamento.CartaoDeCredito;
import templateMethod.pagamentos.estrategiaPagamento.EstrategiaPagamento;
import templateMethod.pagamentos.processadorPagamentos.PagamentoCartaoDeCredito;

public class ClientePagamentos {
    public static void main(String[] args) {

        EstrategiaPagamento cartaoDeCredito = new CartaoDeCredito();
        Pagamento pagamento = new PagamentoCartaoDeCredito(cartaoDeCredito);
        pagamento.pagar(200.00);
    }
}
