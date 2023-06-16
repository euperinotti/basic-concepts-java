package br.com.fag.perinotti.enums;

public enum EnumOperacoes {
  CADASTRAR("Cadastrar um produto"),
  VER_PRODUTOS("Ver produtos"),
  EDITAR_PRODUTO("Editar um produto"),
  EXCLUIR("Excluir um produto"),
  VENDER("Vender um produto"),
  SAIR("Sair");

  private final String operacao;

  private EnumOperacoes(String operacao) {
    this.operacao = operacao;
  }

  public String getOperacao() {
    return this.operacao;
  }

  public static String[] getAll() {
    EnumOperacoes[] opcoes = EnumOperacoes.values();
    String[] array = new String[opcoes.length];
    int i;
    for(i = 0; i < array.length; i++) {
      array[i] = opcoes[i].getOperacao();
    }

    return array;
  }
}