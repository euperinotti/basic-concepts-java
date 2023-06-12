package br.com.fag.perinotti.interfaces;

import java.util.ArrayList;

import br.com.fag.perinotti.classes.produtos.ProdutoBase;

public interface IDesconto {
  public boolean deveAplicar();

  public Float verificarSituacao(ArrayList<? extends ProdutoBase> produtos);

  public Float calcular(ArrayList<? extends ProdutoBase> produtos);
}
