package main.psoft.exception;

public class LivroNaoExisteException extends Exception{
    public LivroNaoExisteException (String mensagem){
        super(mensagem);
    }
}
