package factoryMethod;

import java.util.ArrayList;
import java.util.List;

public class DepartamentoEspecial extends Departamento {

    private String nome;
    private List<Coordenacao> coordenacoes;

    public DepartamentoEspecial(String nome) {
        super(nome);
        this.coordenacoes = new ArrayList<>();
    }

    public void adicionarCoordenacao(Coordenacao coordenacao) {
        this.coordenacoes.add(coordenacao);
    }
}
