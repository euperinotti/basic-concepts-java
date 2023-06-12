package br.com.fag.perinotti.classes;

import java.util.ArrayList;

import br.com.fag.perinotti.classes.produtos.ProdutoBase;
import br.com.fag.perinotti.interfaces.IDesconto;

public abstract class Desconto implements IDesconto {
  private Desconto proximoDesconto;

  public abstract boolean deveAplicar();

  @Override
  public Float verificarSituacao(ArrayList<? extends ProdutoBase> produtos) {
    if (deveAplicar()) {
      return calcular(produtos);
    }

    return proximoDesconto.verificarSituacao(produtos);
  }

  @Override
  public abstract Float calcular(ArrayList<? extends ProdutoBase> produtos);
  
}
