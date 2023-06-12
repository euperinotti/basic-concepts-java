package br.com.fag.perinotti.test;

import java.time.LocalDate;

import br.com.fag.perinotti.classes.produtos.Alimento;

public class AlimentoTeste {
  public static void main(String[] args) {
    Alimento novoAlimento = new Alimento("Maça", 3.5f, 100, LocalDate.of(2023, 10, 5), null, "AAA", 250f, false, false);

    System.out.println(novoAlimento.getCategoria());
    System.out.println(novoAlimento.possuiEstoque());
    System.out.println(novoAlimento.estaVencido());

    novoAlimento.setDataDeValidade(LocalDate.of(2020, 2, 1));

    System.out.println(novoAlimento.estaVencido());
  }
}
