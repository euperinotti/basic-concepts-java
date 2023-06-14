package br.com.fag.perinotti.classes.controladores;

import java.util.ArrayList;
import java.util.Scanner;

import br.com.fag.perinotti.classes.catalogos.CatalogoLivro;
import br.com.fag.perinotti.classes.produtos.Livro;
import br.com.fag.perinotti.classes.produtos.ProdutoBase;
import br.com.fag.perinotti.enums.EnumFormatoDoLivro;
import br.com.fag.perinotti.interfaces.Controller;
import br.com.fag.perinotti.utils.Mensagem;
import br.com.fag.perinotti.utils.Terminal;

public class LivroController implements Controller {

  private ArrayList<Livro> catalogo = CatalogoLivro.catalago();

  public void adicionarAoCatalogo() {
    Livro novoLivro = this.criar();
    this.catalogo.add(novoLivro);
  }
  
  @Override
  public <T> T criar() {
    Scanner scanner = new Scanner(System.in);
    String nome;
    int estoque;
    Float preco;

    String autor;
    String genero;
    String editora;
    String edicao;
    String classificacao;
    EnumFormatoDoLivro formato;
    int numeroDePaginas;

    Mensagem.mensagemComInput("Informe o nome do livro");
    nome = scanner.next();

    Mensagem.mensagemComInput("Informe o preco do livro");
    preco = scanner.nextFloat();

    Mensagem.mensagemComInput("Informe a quantidade desse livro em estoque");
    estoque = Terminal.validarInteiro(scanner);
    
    scanner.nextLine();

    Mensagem.mensagemComInput("Informe o autor do livro");
    autor = scanner.nextLine();

    Mensagem.mensagemComInput("Informe o gênero do livro");
    genero = scanner.nextLine();

    Mensagem.mensagemComInput("Informe a editora do livro");
    editora = scanner.nextLine();

    Mensagem.mensagemComInput("Informe a edição do livro");
    edicao = scanner.nextLine();

    Mensagem.mensagemComInput("Informe a classificação indicativa do livro");
    classificacao = scanner.nextLine();

    Mensagem.exibirMensagemComOpcoes(EnumFormatoDoLivro.getAll(), "Escolha o formato do livro");
    formato = EnumFormatoDoLivro.values()[Terminal.validarElementoSelecionado(EnumFormatoDoLivro.getAll(), scanner.nextInt(), scanner)];

    Mensagem.mensagemComInput("Informe o número de páginas do livro");
    numeroDePaginas = Terminal.validarInteiro(scanner);

    return (T) new Livro(nome, preco, estoque, autor, genero, editora, edicao, classificacao, formato, numeroDePaginas);
  }

  @Override
  public <T> T buscar(int codigo) {
    for (Livro livro : catalogo) {
      if(livro.getCodigo() == codigo) {
        return (T) livro;
      }
    }
    return null;
  }

  @Override
  public ArrayList<? extends ProdutoBase> buscarTodos() {
    return this.catalogo;
  }

  @Override
  public <T> T editar(int codigo) {
    Scanner scanner = new Scanner(System.in);
    Livro livro = buscar(codigo);

    String nome;
    int estoque;
    Float preco;

    String autor;
    String genero;
    String editora;
    String edicao;
    String classificacao;
    EnumFormatoDoLivro formato;
    int numeroDePaginas;

    Mensagem.mensagemComInput("Informe o nome do livro");
    nome = scanner.next();

    Mensagem.mensagemComInput("Informe o preco do livro");
    preco = scanner.nextFloat();

    Mensagem.mensagemComInput("Informe a quantidade desse livro em estoque");
    estoque = Terminal.validarInteiro(scanner);
    
    scanner.nextLine();

    Mensagem.mensagemComInput("Informe o autor do livro");
    autor = scanner.nextLine();

    Mensagem.mensagemComInput("Informe o gênero do livro");
    genero = scanner.nextLine();

    Mensagem.mensagemComInput("Informe a editora do livro");
    editora = scanner.nextLine();

    Mensagem.mensagemComInput("Informe a edição do livro");
    edicao = scanner.nextLine();

    Mensagem.mensagemComInput("Informe a classificação indicativa do livro");
    classificacao = scanner.nextLine();

    Mensagem.exibirMensagemComOpcoes(EnumFormatoDoLivro.getAll(), "Escolha o formato do livro");
    formato = EnumFormatoDoLivro.values()[Terminal.validarElementoSelecionado(EnumFormatoDoLivro.getAll(), scanner.nextInt(), scanner)];

    Mensagem.mensagemComInput("Informe o número de páginas do livro");
    numeroDePaginas = Terminal.validarInteiro(scanner);

    livro.setNome(nome);
    livro.setPreco(preco);
    livro.setEstoque(estoque);
    livro.setAutor(autor);
    livro.setGenero(genero);
    livro.setEditora(editora);
    livro.setEdicao(edicao);
    livro.setClassificacaoIndicativa(classificacao);
    livro.setFormato(formato);
    livro.setNumeroDePaginas(numeroDePaginas);

    return (T) livro;
  }

  @Override
  public void excluir(int codigo) {
    for (Livro livro : catalogo) {
      if(livro.getCodigo() == codigo) {
        catalogo.remove(livro);
        System.out.println("Livro removido");
        break;
      }
    }
  }

}