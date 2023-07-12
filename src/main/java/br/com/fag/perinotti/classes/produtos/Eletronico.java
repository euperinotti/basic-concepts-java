package br.com.fag.perinotti.classes.produtos;

import java.util.Scanner;

import br.com.fag.perinotti.enums.EnumVoltagem;
import br.com.fag.perinotti.interfaces.Vendavel;
import br.com.fag.perinotti.utils.Mensagem;
import br.com.fag.perinotti.utils.Terminal;

public class Eletronico extends ProdutoBase implements Vendavel {
  private int codigo;
  private static int proximoCodigo = 1;
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
    this.codigo = proximoCodigo++;
  }

  public void ligar(EnumVoltagem voltagem) {
    if (voltagem.getVoltagem().equals(this.voltagem.getVoltagem())) {
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
  public void vender() {
    if (this.possuiEstoque() && this.checarEstado()) {
      Mensagem.mensagemComInput("Deseja adicionar um desconto ao produto?\n[1] Sim\n[2] Não");

      Scanner scanner = new Scanner(System.in);
      int input = 0;
      input = Terminal.validarInteiro(scanner) - 1;

      switch(input) {
        case 1:
          Mensagem.mensagemComInput("Quantos porcento de desconto você deseja?");
          input = Terminal.validarInteiro(scanner);
          this.aplicarDesconto(input);
          break;
        case 2:
          break;
      }
    }
  }

  @Override
  public boolean checarEstado() {
    return this.voltagem.getVoltagem().equals(EnumVoltagem.V110.getVoltagem()) || this.voltagem.getVoltagem().equals(EnumVoltagem.V220.getVoltagem());
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

  public int getCodigo() {
    return this.codigo;
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
