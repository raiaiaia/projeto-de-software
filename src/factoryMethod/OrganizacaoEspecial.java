package factoryMethod;

public class OrganizacaoEspecial extends Organizacao{

    private int idCoordenacao = 0;

    @Override
    protected Departamento criarDepartamento(String nome){
        return new DepartamentoEspecial(nome);
    }

    public int cadastrarCoordenacao(int idDiretoria, int idDepartamento, String nome){
        Diretoria diretoria = diretorias.get(idDiretoria);
        DepartamentoEspecial departamentoEspecial = (DepartamentoEspecial) diretoria.getDepartamento(idDepartamento);
        Coordenacao coordenacao = new Coordenacao(nome);

        departamentoEspecial.adicionarCoordenacao(coordenacao);
        return ++idCoordenacao;
    }
}
