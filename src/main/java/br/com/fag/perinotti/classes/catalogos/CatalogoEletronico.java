package br.com.fag.perinotti.classes.catalogos;

import java.util.ArrayList;

import br.com.fag.perinotti.classes.produtos.Eletronico;
import br.com.fag.perinotti.enums.EnumVoltagem;

public class CatalogoEletronico {
  public static ArrayList<Eletronico> catalago() {
    ArrayList<Eletronico> catalogoEletronico = new ArrayList<>();

    catalogoEletronico.add(new Eletronico("Smartphone Samsung", 600f, 2, "ABCDE", "Samsung", EnumVoltagem.V220, true, true));
    catalogoEletronico.add(new Eletronico("Rádio", 200f, 6, "FGHI", "Philips", EnumVoltagem.V110, false, false));
    catalogoEletronico.add(new Eletronico("Fone de Ouvido Bluetooth", 160f, 15, "FGHI", "JBL", EnumVoltagem.V110, true, false));

    return catalogoEletronico;
  }
}
