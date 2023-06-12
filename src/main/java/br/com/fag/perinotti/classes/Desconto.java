package br.com.fag.perinotti.classes;

import java.util.ArrayList;

import br.com.fag.perinotti.interfaces.IDesconto;

public class Desconto implements IDesconto {

  public abstract boolean deveAplicar() {}

  @Override
  public Float verificarSituacao(ArrayList<? extends ProdutoBase> produtos) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'verificarSituacao'");
  }

  @Override
  public Float calcular(ArrayList<? extends ProdutoBase> produtos) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'calcular'");
  }
  
}
