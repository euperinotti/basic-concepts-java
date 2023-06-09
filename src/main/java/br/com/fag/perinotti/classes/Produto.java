package br.com.fag.perinotti.classes;

import br.com.fag.perinotti.interfaces.Vendavel;

public class Produto extends ProdutoBase implements Vendavel {
  private boolean inflamavel;
  private boolean toxico;
  private boolean alcoolico;

  public Produto(String nome, Float preco, Integer estoque, boolean inflamavel, boolean toxico, boolean alcoolico) {
    super(nome, preco, estoque);
    this.inflamavel = inflamavel;
    this.toxico = toxico;
    this.alcoolico = alcoolico;
  }

  @Override
  public boolean checarEstado() {
    return !this.inflamavel;
  }

  @Override
  public String toString() {
    return "{" + 
    super.toString() +
    " inflamavel= " + this.inflamavel + "," + 
    " toxico= " + this.toxico + "," +
    " alcoolico= " + this.alcoolico + 
    "}";
  }
  
}
