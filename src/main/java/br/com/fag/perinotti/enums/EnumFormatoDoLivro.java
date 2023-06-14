package br.com.fag.perinotti.enums;

public enum EnumFormatoDoLivro {
  FISICO("Fisico"),
  PDF("Pdf");

  private final String formato;

  private EnumFormatoDoLivro(String formato) {
    this.formato = formato;
  }

  public String getFormato() {
    return this.formato;
  }

  public static String[] getAll() {
    EnumFormatoDoLivro[] opcoes = EnumFormatoDoLivro.values();
    String[] array = new String[opcoes.length];
    int i;
    for(i = 0; i < array.length; i++) {
      array[i] = opcoes[i].getFormato();
    }

    return array;
  }
}
