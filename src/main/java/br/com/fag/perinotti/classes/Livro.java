package br.com.fag.perinotti.classes;

public class Livro extends ProdutoBase {
  private String autor;
  private String genero;
  private String editora;
  private String edicao;
  private String classificacaoIndicativa;

  public Livro(String nome, Float preco, Integer estoque, String autor, String genero, String editora, String edicao, String classificacao) {
    super(nome, preco, estoque);
    this.autor = autor;
    this.genero = genero;
    this.editora = editora;
    this.edicao = edicao;
    this.classificacaoIndicativa = classificacao;
  }

  @Override
  public String toString() {
    return "{" + 
    super.toString() +
    " autor= " + this.autor + "," + 
    " genero= " + this.genero + "," +
    " editora= " + this.editora + "," + 
    " edicao= " + this.edicao + "," +
    " classificacao= " + this.classificacaoIndicativa + "," +
    "}";
  }
}