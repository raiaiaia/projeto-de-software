package main.psoft.entidades;
import main.psoft.exception.LivroIndisponivelException;
import main.psoft.exception.LivroNaoExisteException;

import java.util.ArrayList;

public class Biblioteca {

    ArrayList<Livro> livros;
    ArrayList<Usuario> usuarios;
    ArrayList<Reserva> reservas;

    public Biblioteca(){
        livros = new ArrayList<>();
        usuarios = new ArrayList<>();
        reservas = new ArrayList<>();
    }

    public Livro cadastraLivro(String titulo){
        int idLivro = 100 + livros.size();
        Livro novoLivro = new Livro(idLivro, titulo);
        livros.add(novoLivro);
        return novoLivro;
    }

    public void cadastraUsuario(String nome){
        int idUsuario = 0 + usuarios.size();
        Usuario novoUsuario = new Usuario(idUsuario, nome);
        usuarios.add(novoUsuario);
    }

    public ArrayList<Livro> buscaLivro(String tituloLivro) throws LivroNaoExisteException {

        ArrayList<Livro> resultadoBusca = new ArrayList<>();

        for(Livro l: livros){
            if(l.getTitulo().toLowerCase().contains(tituloLivro.toLowerCase())){
                resultadoBusca.add(l);
            }
        }

        if(resultadoBusca.isEmpty()) throw new LivroNaoExisteException("Livro nao existe!");
        return resultadoBusca;
    }

    public ArrayList<Livro> listaDisponiveis(){
        ArrayList<Livro> livrosDisponiveis = new ArrayList<>();

        for(Livro l: livros){
            if(l.getStatus()){
                livrosDisponiveis.add(l);
            }
        }
        return livrosDisponiveis;
    }

    public ArrayList<Livro> listaCadastrados(){
        return this.livros;
    }

    public boolean reservaLivro(int idLivro, int idUsuario) throws LivroNaoExisteException, LivroIndisponivelException{
        boolean statusReserva = false;

        for(Livro l: livros){
            if(l.getId() == idLivro && l.getStatus()){
                Reserva novaReserva = new Reserva(idLivro, idUsuario);
                reservas.add(novaReserva);
                l.setStatus(false);
                statusReserva = true;
            } else if(l.getId() == idLivro && !l.getStatus()){
                throw new LivroIndisponivelException("Livro indisponivel!");
            }
        }

        if(!statusReserva) throw new LivroNaoExisteException("Livro nao existe!");
        return statusReserva;
    }



}


