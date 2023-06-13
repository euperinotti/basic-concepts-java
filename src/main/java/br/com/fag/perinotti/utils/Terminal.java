package br.com.fag.perinotti.utils;

import java.util.List;
import java.util.Scanner;

public class Terminal {

  public static int validarInteiro(Scanner scanner) {
    String str = scanner.nextLine();
    str = str.replaceAll("[^0-9?!\\.]", "");

    while (str.length() == 0) {
      System.out.println("\nCaracter inválido, informe um número apenas");
      Mensagem.campoDeInput();
      str = scanner.nextLine();
    }

    return transformarEmInteiro(str);
  }

  private static int transformarEmInteiro(String str) {
    return (int) Math.abs(Math.floor(Double.parseDouble(str)));
  }

  public static int validarElementoSelecionado(List<?> lista, int input, Scanner scanner) {
    while(input > lista.size()) {
      Mensagem.mensagemComInput("Informe um número válido");
      input = Terminal.validarInteiro(scanner);
    }

    return input;
  }
}
