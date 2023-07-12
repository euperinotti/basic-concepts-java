package br.com.fag.perinotti.classes.produtos;

import java.time.LocalDate;

import br.com.fag.perinotti.interfaces.Vendavel;

public class Alimento extends ProdutoBase implements Vendavel{
  private int codigo;
  private static int proximoCodigo = 1;
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
    this.codigo = proximoCodigo++;
  }

  @Override
  public boolean checarEstado() {
    return possuiEstoque() && !estaVencido();
  }

  @Override
  public String toString() {
    return "{" + 
    super.toString() +
    "codigo: " + this.codigo + "\n" + 
    "dataDeValidade: " + this.dataDeValidade + "\n" + 
    "dataDeFabricacao: " + this.dataDeFabricacao + "\n" +
    "lote: " + this.lote + "," + 
    "pesoEmGramas: " + this.pesoEmGramas + "\n" +
    "gluten: " + this.gluten + "\n" +
    "lactose: " + this.lactose +
    "\n}\n";
  }

  public boolean estaVencido() {
    return LocalDate.now().isAfter(dataDeValidade);
  }

  public int getCodigo() {
    return this.codigo;
  }

  public LocalDate getDataDeValidade() {
    return this.dataDeValidade;
  }

  public void setDataDeValidade(LocalDate data) {
    this.dataDeValidade = data;
  }

  public LocalDate getDataDeFabricacao() {
    return this.dataDeFabricacao;
  }

  public void setDataDeFabricacao(LocalDate data) {
    this.dataDeFabricacao = data;
  }

  public void setLote(String lote) {
    this.lote = lote;
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

  @Override
  public boolean vender() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'vender'");
  }
  
}
