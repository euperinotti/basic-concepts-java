package br.com.fag.perinotti.classes;

public abstract class ProdutoBase {
  private String nome;
  private Float valor;

  public ProdutoBase(String nome, Float valor) {
    this.nome = nome;
    this.valor = valor;
  }
}
