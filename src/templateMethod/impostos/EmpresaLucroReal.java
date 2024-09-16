package templateMethod.impostos;

public class EmpresaLucroReal extends EmpresaGenerica {

    @Override
    protected void calcularImpostos() {
        System.out.println("Calculando impostos: Lucro real");
    }
}
