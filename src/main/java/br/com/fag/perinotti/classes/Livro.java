package br.com.fag.perinotti.classes;

import br.com.fag.perinotti.interfaces.Vendavel;

public class Livro extends ProdutoBase implements Vendavel {
  private String autor;
  private String genero;
  private String editora;
  private String edicao;
  private String classificacaoIndicativa;
  private boolean amassado;

  public Livro(String nome, Float preco, Integer estoque, String autor, String genero, String editora, String edicao, String classificacao) {
    super(nome, preco, estoque);
    this.autor = autor;
    this.genero = genero;
    this.editora = editora;
    this.edicao = edicao;
    this.classificacaoIndicativa = classificacao;
    this.amassado = false;
  }

  @Override
  public String toString() {
    return "{\n" + 
    super.toString() +
    "autor: " + this.autor + "\n" + 
    "genero: " + this.genero + "\n" +
    "editora: " + this.editora + "\n" + 
    "edicao: " + this.edicao + "\n" +
    "classificacao: " + this.classificacaoIndicativa + "\n" +
    "}\n";
  }

  @Override
  public boolean checarEstado() {
    return possuiEstoque() && !getAmassado();
  }

  public String getAutor() {
    return this.autor;
  }

  public void setAutor(String autor) {
    this.autor = autor;
  }

  public String getGenero() {
    return this.genero;
  }

  public void setGenero(String genero) {
    this.genero = genero;
  }

  public String getEditora() {
    return this.editora;
  }

  public void setEditora(String editora) {
    this.editora = editora;
  }

  public String getEdicao() {
    return this.edicao;
  }

  public void setEdicao(String edicao) {
    this.edicao = edicao;
  }

  public String getClassificacaoIndicativa() {
    return this.classificacaoIndicativa;
  }

  public void setClassificacaoIndicativa(String classificacaoIndicativa) {
    this.classificacaoIndicativa = classificacaoIndicativa;
  }

  public boolean getAmassado() {
    return this.amassado;
  }

  public void setAmassado(boolean amassado) {
    this.amassado = amassado;
  }


}