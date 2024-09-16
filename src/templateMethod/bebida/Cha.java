package templateMethod.bebida;

public class Cha extends Bebida{

    @Override
    public String misturar() {
        return "Adicionando o saquinho...";
    }

    @Override
    protected String adicionarCondimentos() {
        return "Adicionando rodelas de limão...";
    }
}
