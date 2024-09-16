package templateMethod.pagamentos.estrategiaPagamento;

public class CartaoDeCredito implements EstrategiaPagamento {

    @Override
    public String processaPagamento(double valor) {
        return "Pagando " + valor + " com cartão de crédito!";
    }

}
