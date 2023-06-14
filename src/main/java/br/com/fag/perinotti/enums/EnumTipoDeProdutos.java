package br.com.fag.perinotti.enums;

import br.com.fag.perinotti.classes.controladores.AlimentoController;
import br.com.fag.perinotti.classes.controladores.EletronicoController;

public enum EnumTipoDeProdutos {
  ALIMENTO(new AlimentoController()),
  ELETRONICO(new EletronicoController());

  private EnumTipoDeProdutos(AlimentoController alimentoController) {
  }

  private EnumTipoDeProdutos(EletronicoController eletronicoController) {
  }
  
}
