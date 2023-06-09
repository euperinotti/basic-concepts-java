package br.com.fag.perinotti.classes;

import br.com.fag.perinotti.interfaces.Vendavel;

public class Eletronico extends ProdutoBase implements Vendavel{
  private String numeroDeSerie;
  private String marca;
  private String voltagem;
  private boolean funcionaABateria;
  private boolean possuiSeguro;

  public Eletronico(String nome, Float preco, Integer estoque, String numeroDeSerie, String marca, String voltagem, boolean funcionaABateria, boolean possuiSeguro) {
    super(nome, preco, estoque);
    this.numeroDeSerie = numeroDeSerie;
    this.marca = marca;
    this.voltagem = voltagem;
    this.funcionaABateria = funcionaABateria;
    this.possuiSeguro = possuiSeguro;
  }

  @Override
  public boolean checarEstado() {
    return this.voltagem.equals("110v") || this.voltagem.equals("220v");
  }

  @Override
  public String toString() {
    return "{" + 
    super.toString() +
    " numeroDeSerie= " + this.numeroDeSerie + "," + 
    " marca= " + this.marca + "," +
    " voltagem= " + this.voltagem + "," + 
    " funcionaABateria= " + this.funcionaABateria + "," +
    " possuiSeguro= " + this.possuiSeguro +
    "}";
  }
  
}
