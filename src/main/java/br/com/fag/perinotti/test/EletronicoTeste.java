package br.com.fag.perinotti.test;

import br.com.fag.perinotti.classes.Eletronico;

public class EletronicoTeste {
  public static void main(String[] args) {
    Eletronico novoEletronico = new Eletronico("Rádio", 100f, 5, "AAA1", "Sony", "110", false, false);

    // System.out.println(novoEletronico);

    novoEletronico.ligar("220");
    
  }
}
