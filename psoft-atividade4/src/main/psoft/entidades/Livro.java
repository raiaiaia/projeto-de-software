package main.psoft.entidades;

public class Livro {

    private int id;
    private String titulo;
    private boolean statusDisponibilidade;

    public Livro(int id, String titulo){
        this.id = id;
        this.titulo = titulo;
        this.statusDisponibilidade = true;
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public boolean getStatus() {
        return this.statusDisponibilidade;
    }

    public void setStatus(boolean statusDisponibilidade) {
        this.statusDisponibilidade = statusDisponibilidade;
    }
}