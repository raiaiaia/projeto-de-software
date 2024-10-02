package factoryMethod;

import java.util.HashMap;
import java.util.Map;

public abstract class Organizacao {

    protected Map<Integer, Diretoria> diretorias = new HashMap<>();
    private int idDiretoria = 0;
    private int idDepartamento = 0;

    //Factory Method
    protected Diretoria criarDiretoria(String nome) {
        return new Diretoria(nome);
    }

    //Factory Method
    protected Departamento criarDepartamento(String nome) {
        return new Departamento(nome);
    }

    public void cadastrarDiretoria(String nome){
        Diretoria diretoria = criarDiretoria(nome);
        diretorias.put(++idDiretoria, diretoria);
    }

    public int cadastrarDepartamento(int idDiretoria, String nome){
        Departamento departamento = criarDepartamento(nome);
        Diretoria diretoria = diretorias.get(idDiretoria);
        diretoria.adicionarDepartamento(++idDepartamento, departamento);

        return idDepartamento;
    }
}
