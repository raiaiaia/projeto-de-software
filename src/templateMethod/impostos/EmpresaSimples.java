package templateMethod.impostos;

public class EmpresaSimples extends EmpresaGenerica {

    @Override
    protected void calcularImpostos() {
        System.out.println("Calculando impostos: Regime Simples");
    }
}
