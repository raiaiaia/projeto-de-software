package templateMethod.pagamentos.estrategiaPagamento;

public class Pix implements EstrategiaPagamento {

    @Override
    public String processaPagamento(double valor) {
        return "Pagando " + valor + " com pix!";
    }
}
