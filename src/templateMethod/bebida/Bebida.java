package templateMethod.bebida;

public abstract class Bebida {

    //template method do tipo final para nao poder ser sobrescrito pelos clientes particulares do algoritmo
    public final String prepararBebida() {

        String saida = "Preparando bebida:\n"
                       + esquentarAgua() + "\n"
                       + misturar() + "\n"
                       + colocarEmCopo() + "\n"
                       + adicionarCondimentos() + "\n"
                       + "Bebida pronta!";
        return saida;
    }

    private String esquentarAgua() {
        return "Esquentando a água...";
    }

    protected abstract String misturar();

    private String colocarEmCopo() {
        return "Colocando no copo...";
    }

    protected String adicionarCondimentos() {
        //nao faz nada ou tem implementacao default, metodo gancho
        return "Sem condimentos";
    }
}
