package templateMethod.pagamentos;

import templateMethod.pagamentos.estrategiaPagamento.EstrategiaPagamento;

public abstract class Pagamento {

    protected EstrategiaPagamento estrategiaPagamento;

    public Pagamento(EstrategiaPagamento estrategiaPagamento) {
        setEstrategiaPagamento(estrategiaPagamento);
    }

    public void setEstrategiaPagamento(EstrategiaPagamento estrategiaPagamento) {
        this.estrategiaPagamento = estrategiaPagamento;
    }

    //template method
    public final void pagar(double valor) {
        validarDetalhesPagamento();
        processarPagamento(valor);
        executarPagamento();
        enviarConfirmacao();
    }

    protected void validarDetalhesPagamento() {
        System.out.println("Validando detalhes do pagamento...");
    }

    protected abstract void executarPagamento();

    protected void processarPagamento(double valor){
        System.out.println(estrategiaPagamento.processaPagamento(valor));
    }

    private void enviarConfirmacao(){
        System.out.println("Pagamento finalizado!");
    }

}
