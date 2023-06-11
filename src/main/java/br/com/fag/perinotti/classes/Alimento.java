package br.com.fag.perinotti.classes;

import java.time.LocalDate;

import br.com.fag.perinotti.interfaces.Vendavel;

public class Alimento extends ProdutoBase implements Vendavel{
  private LocalDate dataDeValidade;
  private LocalDate dataDeFabricacao;
  private String lote;
  private Float pesoEmGramas;
  private boolean gluten;
  private boolean lactose;

  public Alimento(String nome, Float preco, Integer estoque, LocalDate dataDeValidade, LocalDate dataDeFabricacao, String lote, Float pesoEmGramas, boolean gluten, boolean lactose) {
    super(nome, preco, estoque);
    this.dataDeValidade = dataDeValidade;
    this.dataDeFabricacao = dataDeFabricacao;
    this.lote = lote;
    this.pesoEmGramas = pesoEmGramas;
    this.gluten = gluten;
    this.lactose = lactose;
  }

  @Override
  public boolean checarEstado() {
    return possuiEstoque() && estaVencido();
  }

  @Override
  public String toString() {
    return "{" + 
    super.toString() +
    " dataDeValidade= " + this.dataDeValidade + "\n" + 
    " dataDeFabricacao= " + this.dataDeFabricacao + "\n" +
    " lote= " + this.lote + "," + 
    " pesoEmGramas= " + this.pesoEmGramas + "\n" +
    " gluten= " + this.gluten + "\n" +
    " lactose= " + this.lactose + "\n" +
    "}";
  }

  public boolean estaVencido() {
    return LocalDate.now().isAfter(dataDeValidade);
  }

  public LocalDate getDataDeValidade() {
    return this.dataDeValidade;
  }

  public LocalDate getDataDeFabricacao() {
    return this.dataDeFabricacao;
  }

  public String getLote() {
    return this.lote;
  }

  public Float getPesoEmGramas() {
    return this.pesoEmGramas;
  }

  public void setPesoEmGramas(Float pesoEmGramas) {
    this.pesoEmGramas = pesoEmGramas;
  }

  public boolean isGluten() {
    return this.gluten;
  }

  public void setGluten(boolean gluten) {
    this.gluten = gluten;
  }

  public boolean isLactose() {
    return this.lactose;
  }

  public void setLactose(boolean lactose) {
    this.lactose = lactose;
  }
  
}
