package br.com.fag.perinotti.classes.catalogos;

import java.util.ArrayList;

import br.com.fag.perinotti.classes.Livro;

public class CatalogoLivro {
  public static ArrayList<Livro> catalago() {
    ArrayList<Livro> catalogoLivros = new ArrayList<Livro>();

    catalogoLivros.add(new Livro("O vendedor de Sonhos", 49f, 30, "Augusto Cury", "Drama", null, "3", "14"));
    catalogoLivros.add(new Livro("Mindhunter", 25.9f, 12, "John Douglas", "Drama", "Intrisica", "1", "16"));
    catalogoLivros.add(new Livro("Confissoes", 25.9f, 50, "Agostinho", "Memórias e autobiografia", "Principis", "6", "Livre"));

    return catalogoLivros;
  }
}
