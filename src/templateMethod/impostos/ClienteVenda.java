package templateMethod.impostos;

public class ClienteVenda {
    public static void main(String[] args) {

        EmpresaLucroPresumido empresaLucroPresumido = new EmpresaLucroPresumido();
        EmpresaLucroReal empresaLucroReal = new EmpresaLucroReal();
        EmpresaSimples empresaSimples = new EmpresaSimples();

        empresaSimples.vender();
        System.out.println(" ");
        empresaLucroReal.vender();
        System.out.println(" ");
        empresaLucroPresumido.vender();
    }
}
