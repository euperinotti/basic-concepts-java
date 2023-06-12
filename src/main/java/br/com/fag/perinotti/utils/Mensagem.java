package br.com.fag.perinotti.utils;

public class Mensagem {
  public static void campoDeInput() {
    System.out.print("Input...: ");
  }

  public static void mensagem(String msg)  {
    System.out.println("\n" + msg);
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

  public static void mensagemComInput(String msg) {
    mensagem(msg);
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
