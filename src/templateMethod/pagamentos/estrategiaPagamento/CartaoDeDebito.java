package templateMethod.pagamentos.estrategiaPagamento;

public class CartaoDeDebito implements EstrategiaPagamento {

    @Override
    public String processaPagamento(double valor) {
        return "Pagando " + valor + " com cartão de débito!";
    }

}
