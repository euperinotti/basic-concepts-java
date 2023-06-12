package br.com.fag.perinotti.classes.controladores;

import java.util.ArrayList;

import br.com.fag.perinotti.classes.catalogos.CatalogoAlimento;
import br.com.fag.perinotti.classes.produtos.Alimento;
import br.com.fag.perinotti.classes.produtos.ProdutoBase;
import br.com.fag.perinotti.interfaces.Controller;

public class Controlador<T> implements Controller {
  private ArrayList<Alimento> catalogo = CatalogoAlimento.catalago();

  @Override
  public void criar() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'criar'");
  }

  @Override
  public <T extends ProdutoBase> T buscarUm(int codigo) {
    T elemento = null;
    for (Alimento alimento : catalogo) {
      if(alimento.getCodigo() == codigo) {
        elemento = (T) alimento;
      }
    }

    return elemento;
  }

  @Override
  public ArrayList<? extends ProdutoBase> buscarTodos() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'buscarTodos'");
  }

  @Override
  public Class<? extends ProdutoBase> editar(int codigo, Class<? extends ProdutoBase> produto) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'editar'");
  }

  @Override
  public void excluir(int codigo) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'excluir'");
  }
  
}
