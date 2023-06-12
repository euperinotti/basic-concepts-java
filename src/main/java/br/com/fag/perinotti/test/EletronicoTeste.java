package br.com.fag.perinotti.test;

import br.com.fag.perinotti.classes.Eletronico;
import br.com.fag.perinotti.enums.EnumVoltagem;

public class EletronicoTeste {
  public static void main(String[] args) {
    Eletronico novoEletronico = new Eletronico("Rádio", 100f, 5, "AAA1", "Sony", EnumVoltagem.V110, false, false);

    System.out.println(novoEletronico);
    novoEletronico.ligar(EnumVoltagem.V220);
    novoEletronico.verificarBateria();
    System.out.println(novoEletronico.possuiEstoque());
    System.out.println(novoEletronico.getCategoria());
    novoEletronico.setEstoque(0);
    System.out.println(EnumVoltagem.V220.getVoltagem());

    Eletronico outroEletronico = new Eletronico("Celular", 600f, 0, "BBB1", "Samsung", EnumVoltagem.V220, true, true);

    System.out.println(outroEletronico);
    outroEletronico.ligar(EnumVoltagem.V220);
    outroEletronico.verificarBateria();
    System.out.println(outroEletronico.possuiEstoque());
    System.out.println(outroEletronico.getCategoria());
    
  }
}
