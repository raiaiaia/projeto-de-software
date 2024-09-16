package templateMethod.pagamentos.estrategiaPagamento;

public class Especie implements EstrategiaPagamento {

    @Override
    public String processaPagamento(double valor) {
        return "Pagando " + valor + " em espécie!";
    }

}
