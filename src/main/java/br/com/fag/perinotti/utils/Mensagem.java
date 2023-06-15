package br.com.fag.perinotti.utils;

public class Mensagem {
  public static void campoDeInput() {
    System.out.print("Input...: ");
  }

  public static void mensagem(String mensagem)  {
    System.out.println("\n" + mensagem);
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

  public static void exibirMensagemComOpcoes(String[] array, String mensagem) {
    int i;
    mensagem(mensagem);
    for (i = 0; i < array.length; i++) {
      System.out.println("[" + (i + 1) + "] " + array[i]);
    }
    Mensagem.campoDeInput();
  }

  public static void mensagemComInput(String mensagem) {
    mensagem(mensagem);
    campoDeInput();
  }

  public static void caracterInvalido() {
    mensagem("Caracter inválido, informe um número apenas");
    campoDeInput();
  }

  public static void opcaoInvalida() {
    mensagem("Opção inválida, tente novamente");
    campoDeInput();
  }
}
