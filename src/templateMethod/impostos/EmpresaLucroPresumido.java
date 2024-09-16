package templateMethod.impostos;

public class EmpresaLucroPresumido extends EmpresaGenerica {

    @Override
    protected void calcularImpostos() {
        System.out.println("Calculando impostos: Lucro Presumido");
    }
}
