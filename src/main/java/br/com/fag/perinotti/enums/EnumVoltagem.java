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

  public static String[] getAll() {
    EnumVoltagem[] opcoes = EnumVoltagem.values();
    String[] array = new String[opcoes.length];
    int i;
    for(i = 0; i < array.length; i++) {
      array[i] = opcoes[i].getVoltagem();
    }

    return array;
  }
}
