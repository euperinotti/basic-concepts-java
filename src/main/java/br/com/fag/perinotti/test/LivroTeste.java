package br.com.fag.perinotti.test;

import java.util.ArrayList;

import br.com.fag.perinotti.classes.catalogos.CatalogoLivro;
import br.com.fag.perinotti.classes.produtos.Livro;
import br.com.fag.perinotti.enums.EnumFormatoDoLivro;

public class LivroTeste {
  public static void main(String[] args) {
    Livro livroTeste = new Livro("Livro", 25.9f, 100, "Autor", "Romance", "Editora", "1", "16", EnumFormatoDoLivro.FISICO, 100);

    System.out.println(livroTeste);
    System.out.println(livroTeste.getAmassado());
    System.out.println(livroTeste.getCategoria());
    System.out.println(livroTeste.possuiEstoque());
    System.out.println("Vendavel...: " + livroTeste.checarEstado());

    ArrayList<Livro> catalogo = CatalogoLivro.catalago();

  }
}
