package br.com.fag.perinotti.classes.produtos;

import br.com.fag.perinotti.interfaces.Vendavel;

public class Produto extends ProdutoBase implements Vendavel {
  private int codigo;
  private static  int proximoCodigo = 0;
  private boolean inflamavel;
  private boolean toxico;
  private boolean alcoolico;

  public Produto(String nome, Float preco, Integer estoque, boolean inflamavel, boolean toxico, boolean alcoolico) {
    super(nome, preco, estoque);
    this.inflamavel = inflamavel;
    this.toxico = toxico;
    this.alcoolico = alcoolico;
    this.codigo = ++proximoCodigo;
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
  
  public int getCodigo() {
    return this.codigo;
  }

  public boolean getInflamavel() {
    return this.inflamavel;
  }

  public void setInflamavel(boolean inflamavel) {
    this.inflamavel = inflamavel;
  }

  public boolean getToxico() {
    return this.toxico;
  }

  public void setToxico(boolean toxico) {
    this.toxico = toxico;
  }

  public boolean getAlcoolico() {
    return this.alcoolico;
  }

  public void setAlcoolico(boolean alcoolico) {
    this.alcoolico = alcoolico;
  }

}
