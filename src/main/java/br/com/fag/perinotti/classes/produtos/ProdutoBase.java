package br.com.fag.perinotti.classes.produtos;

public abstract class ProdutoBase {
  private String nome;
  private Float preco;
  private String categoria;
  private Integer estoque;
  private Integer desconto;

  public ProdutoBase(String nome, Float preco, Integer estoque) {
    this.nome = nome;
    this.preco = preco;
    this.estoque = estoque;
    this.categoria = this.getClass().getSimpleName();
    this.desconto = 0;
  }

  public boolean possuiEstoque() {
    return this.getEstoque() > 0;
  }

  public void aplicarDesconto(int procentagemDeDesconto) {
    if (verificarDesconto(procentagemDeDesconto)) {
      this.desconto = procentagemDeDesconto;
      this.setPreco(this.preco * (procentagemDeDesconto / 100));
    }
  };

  public boolean verificarDesconto(int procentagemDeDesconto) {
    if (procentagemDeDesconto >= 0 && procentagemDeDesconto <= 100) {
      return true;
    }
    return false;
  }

  public Integer getDesconto() {
    return this.desconto;
  }

  public void setDesconto(Integer desconto) {
    this.desconto = desconto;
  }

  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public Float getPreco() {
    return this.preco;
  }

  public void setPreco(Float preco) {
    this.preco = preco;
  }

  public String getCategoria() {
    return this.categoria;
  }

  public Integer getEstoque() {
    return this.estoque;
  }

  public void setEstoque(Integer estoque) {
    this.estoque = estoque;
  }

  @Override
  public String toString() {
    return "{\n" + 
    "nome: " + this.nome + "\n" +
    "preco: " + this.preco + "\n" +
    "estoque: " + this.estoque + "\n" +
    "categoria: " + this.categoria +
    "\n}\n";
  };
}
