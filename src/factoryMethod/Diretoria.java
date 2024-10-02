package factoryMethod;

import java.util.HashMap;
import java.util.Map;

public class Diretoria {

    private String nome;
    private Map<Integer, Departamento> departamentos;

    public Diretoria(String nome) {
        this.nome = nome;
        this.departamentos = new HashMap<>();
    }

    public void adicionarDepartamento(int id, Departamento departamento) {
        departamentos.put(id, departamento);
    }

    public Departamento getDepartamento(int id) {
        return departamentos.get(id);
    }
}
