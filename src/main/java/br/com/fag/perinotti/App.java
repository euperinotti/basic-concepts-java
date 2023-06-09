package br.com.fag.perinotti;

import br.com.fag.perinotti.classes.Livro;

public final class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Livro novoProduto = new Livro("Produto", 25.9f, 100, "eu", "romance", "saraiva", "3", "16+");

        System.out.println(novoProduto.getClass().getDeclaredFields()[0].getName());
    }
}
