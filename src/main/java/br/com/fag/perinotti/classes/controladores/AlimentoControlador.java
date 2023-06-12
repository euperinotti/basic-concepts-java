package br.com.fag.perinotti.classes.controladores;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

import br.com.fag.perinotti.classes.catalogos.CatalogoAlimento;
import br.com.fag.perinotti.classes.produtos.Alimento;
import br.com.fag.perinotti.classes.produtos.ProdutoBase;
import br.com.fag.perinotti.interfaces.Controller;
import br.com.fag.perinotti.utils.Mensagem;

public class AlimentoControlador implements Controller {
  private ArrayList<Alimento> catalogo = CatalogoAlimento.catalago();

  @Override
  public void criar() {
    Scanner scanner = new Scanner(System.in);
    String nome;
    LocalDate dataDeValidade;
    LocalDate dataDeFabricacao;
    int estoque;
    String lote;
    Float pesoEmGramas;
    boolean gluten;
    boolean lactose;

    Mensagem.mensagemComInput("Informe o nome do alimento");
    nome = scanner.next();

    Mensagem.mensagemComInput("Informe o peso do alimento (em gramas)");
    pesoEmGramas = scanner.nextFloat();

    Mensagem.mensagemComInput("Informe a quantidade desse alimento em estoque");
    estoque = scanner.nextInt();
    
    scanner.nextLine();

    Mensagem.mensagemComInput("Informe a data de validade do alimento");
    dataDeValidade = LocalDate.parse(scanner.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));

    Mensagem.mensagemComInput("Informe a data de fabricação do alimento");
    dataDeFabricacao = LocalDate.parse(scanner.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));

    Mensagem.mensagemComInput("Informe o lote de produção");
    lote = scanner.next();

    Mensagem.mensagemComInput("O alimento possui gluten?");
    gluten = scanner.nextBoolean();

    Mensagem.mensagemComInput("O alimento possui lactose?");
    lactose = scanner.nextBoolean();

    Alimento novoAlimento = new Alimento(nome, pesoEmGramas, estoque, dataDeValidade, dataDeFabricacao, lote, pesoEmGramas, gluten, lactose);

    this.catalogo.add(novoAlimento);

    return; 
  }

  @Override
  public Class<? extends ProdutoBase> buscarUm(int codigo) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'buscarUm'");
  }

  @Override
  public ArrayList<? extends ProdutoBase> buscarTodos() {
    return this.catalogo;
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
