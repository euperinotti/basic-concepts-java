package br.com.fag.perinotti.enums;

public enum EnumFormatoDoLivro {
  FISICO("Fisico"),
  PDF("Pdf");

  private final String formato;

  private EnumFormatoDoLivro(String formato) {
    this.formato = formato;
  }
}
