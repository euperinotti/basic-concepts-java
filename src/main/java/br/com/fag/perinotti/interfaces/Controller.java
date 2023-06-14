package br.com.fag.perinotti.interfaces;

import java.util.ArrayList;

import br.com.fag.perinotti.classes.produtos.ProdutoBase;

public interface Controller {
  public <T> T criar();

  public <T> T buscar(int codigo);

  public ArrayList<? extends ProdutoBase> buscarTodos();

  public <T> T editar(int codigo);

  public void excluir(int codigo);
}
