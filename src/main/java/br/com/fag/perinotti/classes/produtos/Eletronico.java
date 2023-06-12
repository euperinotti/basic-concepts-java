package br.com.fag.perinotti.classes.produtos;

import br.com.fag.perinotti.enums.EnumVoltagem;
import br.com.fag.perinotti.interfaces.Vendavel;

public class Eletronico extends ProdutoBase implements Vendavel{
  private String numeroDeSerie;
  private String marca;
  private EnumVoltagem voltagem;
  private boolean funcionaABateria;
  private boolean possuiSeguro;

  public Eletronico(String nome, Float preco, Integer estoque, String numeroDeSerie, String marca, EnumVoltagem voltagem, boolean funcionaABateria, boolean possuiSeguro) {
    super(nome, preco, estoque);
    this.numeroDeSerie = numeroDeSerie;
    this.marca = marca;
    this.voltagem = voltagem;
    this.funcionaABateria = funcionaABateria;
    this.possuiSeguro = possuiSeguro;
  }

  public void ligar(EnumVoltagem voltagem) {
    if (voltagem.equals(this.voltagem)) {
      System.out.println("Dispositivo ligado");
    } else {
      System.out.println("Voltagem incompatível");
    }
  }

  public void verificarBateria() {
    if(this.funcionaABateria) {
      System.out.println("O dispositivo tem bateria");
    } else {
      System.out.println("O dispositivo não tem bateria");
    }
  }

  @Override
  public boolean checarEstado() {
    return this.voltagem.equals("110v") || this.voltagem.equals("220v");
  }

  @Override
  public String toString() {
    return "{\n" + 
    super.toString() +
    "numeroDeSerie: " + this.numeroDeSerie + "\n" + 
    "marca: " + this.marca + "\n" +
    "voltagem: " + this.voltagem + "\n" + 
    "funcionaABateria: " + this.funcionaABateria + "\n" +
    "possuiSeguro: " + this.possuiSeguro +
    "\n}\n";
  }

  public String getNumeroDeSerie() {
    return this.numeroDeSerie;
  }

  public void setNumeroDeSerie(String numeroDeSerie) {
    this.numeroDeSerie = numeroDeSerie;
  }

  public String getMarca() {
    return this.marca;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  public EnumVoltagem getVoltagem() {
    return this.voltagem;
  }

  public void setVoltagem(EnumVoltagem voltagem) {
    this.voltagem = voltagem;
  }

  public boolean getFuncionaABateria() {
    return this.funcionaABateria;
  }

  public void setFuncionaABateria(boolean funcionaABateria) {
    this.funcionaABateria = funcionaABateria;
  }

  public boolean getPossuiSeguro() {
    return this.possuiSeguro;
  }

  public void setPossuiSeguro(boolean possuiSeguro) {
    this.possuiSeguro = possuiSeguro;
  }
  
}
