package br.com.fag.perinotti.test;

import br.com.fag.perinotti.classes.Livro;

public class LivroTeste {
  public static void main(String[] args) {
    Livro livroTeste = new Livro("Livro", 25.9f, 100, "Autor", "Romance", "Editora", "1", "16");

    System.out.println(livroTeste);
    System.out.println(livroTeste.getAmassado());
    System.out.println(livroTeste.getCategoria());
    System.out.println(livroTeste.possuiEstoque());
    System.out.println("Vendavel...: " + livroTeste.checarEstado());

  }
}
