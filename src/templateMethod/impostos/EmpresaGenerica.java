package templateMethod.impostos;

public abstract class EmpresaGenerica {

    public final void vender() {
        cadastrarCliente();
        calcularOrcamento();
        definirFormaPagamento();
        calcularImpostos();
        emitirNotaFiscal();
    }

    private void cadastrarCliente() {
        System.out.println("Cadastrando cliente...");
    }

    private void calcularOrcamento() {
        System.out.println("Calculando orçamento...");
    }

    private void definirFormaPagamento() {
        System.out.println("Definindo forma de pagamento...");
    }

    protected abstract void calcularImpostos();

    private void emitirNotaFiscal() {
        System.out.println("Emitindo nota fiscal...");
    }
}
