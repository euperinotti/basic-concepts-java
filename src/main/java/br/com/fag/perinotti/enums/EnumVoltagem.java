package br.com.fag.perinotti.enums;

public enum EnumVoltagem {
  V110("110v"),
  V220("220v"),
  BIVOLT("Bivolt");

  private final String voltagem;

  private EnumVoltagem(String voltagem) {
    this.voltagem = voltagem;
  }

  public String getVoltagem() {
    return this.voltagem;
  }
}
