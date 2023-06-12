package br.com.fag.perinotti.test;

import br.com.fag.perinotti.classes.Eletronico;

public class EletronicoTeste {
  public static void main(String[] args) {
    Eletronico novoEletronico = new Eletronico("Rádio", 100f, 5, "AAA1", "Sony", "110", false, false);

    System.out.println(novoEletronico);
    novoEletronico.ligar("220");
    novoEletronico.verificarBateria();
    System.out.println(novoEletronico.possuiEstoque());
    System.out.println(novoEletronico.getCategoria());
    novoEletronico.setEstoque(0);
    System.out.println(novoEletronico.getCategoria());

    Eletronico outroEletronico = new Eletronico("Celular", 600f, 0, "BBB1", "Samsung", "220", true, true);

    System.out.println(outroEletronico);
    outroEletronico.ligar("220");
    outroEletronico.verificarBateria();
    System.out.println(outroEletronico.possuiEstoque());
    System.out.println(outroEletronico.getCategoria());
    
  }
}
