package test.psoft;

import java.util.*;
import main.psoft.entidades.*;
import main.psoft.exception.*;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class BibliotecaTest {

    Biblioteca bibliotecaDeAlexandria;
    Livro livro1;
    Livro livro2;
    Livro livro3;
    Livro livro4;

    @BeforeEach
    public void setUp(){
        bibliotecaDeAlexandria = new Biblioteca();

        //Cadastra livro retorna o objeto para eu poder acessa-lo nos testes
        livro1 = bibliotecaDeAlexandria.cadastraLivro("A Cor Púrpura"); //ID 100
        livro2 = bibliotecaDeAlexandria.cadastraLivro("Torto Arado"); //ID 101
        livro3 = bibliotecaDeAlexandria.cadastraLivro("A Cor de Coraline"); //ID 102
        livro4 = bibliotecaDeAlexandria.cadastraLivro("A Cor na Arte"); //ID 103

        bibliotecaDeAlexandria.cadastraUsuario("Danielly"); //1
        bibliotecaDeAlexandria.cadastraUsuario("Rayanne"); //2

    }

    @Test
    public void testaBuscaLivros() throws LivroNaoExisteException {
        //Livro existe
        assertEquals(new ArrayList<Livro>(List.of(livro2)), bibliotecaDeAlexandria.buscaLivro("Torto Arado"));

        //Livro nao existe
        LivroNaoExisteException exception = assertThrows(
               LivroNaoExisteException.class,
                () -> bibliotecaDeAlexandria.buscaLivro("Cem anos de Solidão")
        );
        assertEquals("Livro nao existe!", exception.getMessage());
    }

    @Test
    public void testaBuscaLivrosParciais() throws LivroNaoExisteException {
        assertEquals(new ArrayList<Livro>(List.of(livro1, livro3, livro4)), bibliotecaDeAlexandria.buscaLivro("cor"));
    }

    @Test
    public void testaListaLivrosDisponiveis() throws LivroNaoExisteException, LivroIndisponivelException{

        //reservaLivro recebe ID do livro e ID do usuario
        //reservaLivro retorna um boolean
        bibliotecaDeAlexandria.reservaLivro(100, 1);

        assertEquals(new ArrayList<Livro>(List.of(livro2, livro3, livro4)), bibliotecaDeAlexandria.listaDisponiveis());

    }

    @Test
    public void testaListaLivrosCadastrados() {
        assertEquals(new ArrayList<Livro>(List.of(livro1, livro2, livro3, livro4)), bibliotecaDeAlexandria.listaCadastrados());
    }

    @Test
    public void testReservaLivroExistente() throws LivroNaoExisteException, LivroIndisponivelException{

        //Disponivel
        boolean livroDisponivel = bibliotecaDeAlexandria.reservaLivro(100, 1);
        assertTrue(livroDisponivel);

        //Indisponivel
        LivroIndisponivelException exception = assertThrows(
                LivroIndisponivelException.class,
                () -> bibliotecaDeAlexandria.reservaLivro(100, 1)
        );

        assertEquals("Livro indisponivel!", exception.getMessage());
    }

    @Test
    public void testaReservaLivroInexistente() throws LivroNaoExisteException, LivroIndisponivelException{

        LivroNaoExisteException exception = assertThrows(
                LivroNaoExisteException.class,
                () -> bibliotecaDeAlexandria.reservaLivro(104, 1)
        );

        assertEquals("Livro nao existe!", exception.getMessage());
    }
}