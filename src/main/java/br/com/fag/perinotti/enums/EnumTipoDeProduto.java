package br.com.fag.perinotti.enums;

public enum EnumTipoDeProduto {
  ALIMENTO("Alimento"),
  ELETRONICO("Eletrônico"),
  LIVRO("Livro"),
  OUTROS("Outros");

  private final String tipoDoProduto;

  private EnumTipoDeProduto(String tipoDoProduto) {
    this.tipoDoProduto = tipoDoProduto;
  }

  public String getTipoDoProduto() {
    return this.tipoDoProduto;
  }

  public static String[] getAll() {
    EnumTipoDeProduto[] opcoes = EnumTipoDeProduto.values();
    String[] array = new String[opcoes.length];
    int i;
    for(i = 0; i < array.length; i++) {
      array[i] = opcoes[i].getTipoDoProduto();
    }

    return array;
  }
}
