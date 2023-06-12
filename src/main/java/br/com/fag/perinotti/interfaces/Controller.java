package br.com.fag.perinotti.interfaces;

import java.util.ArrayList;

import br.com.fag.perinotti.classes.produtos.ProdutoBase;

public interface Controller {
  public void criar();

  public <T extends ProdutoBase> T buscarUm(int codigo);

  public ArrayList<? extends ProdutoBase> buscarTodos();

  public Class<? extends ProdutoBase> editar(int codigo, Class<? extends ProdutoBase> produto);

  public void excluir(int codigo);
}
