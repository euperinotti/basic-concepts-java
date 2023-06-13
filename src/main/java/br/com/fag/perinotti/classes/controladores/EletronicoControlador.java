package br.com.fag.perinotti.classes.controladores;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

import br.com.fag.perinotti.classes.produtos.Alimento;
import br.com.fag.perinotti.classes.produtos.Eletronico;
import br.com.fag.perinotti.classes.produtos.ProdutoBase;
import br.com.fag.perinotti.enums.EnumVoltagem;
import br.com.fag.perinotti.interfaces.Controller;
import br.com.fag.perinotti.utils.Mensagem;

public class EletronicoControlador implements Controller {
  
  @Override
  public void criar() {
    Scanner scanner = new Scanner(System.in);
    String nome;
    int estoque;
    Float preco;
    String numeroDeSerie;
    String marca;
    EnumVoltagem voltagem;
    boolean funcionaABateria;
    boolean possuiSeguro;

    Mensagem.mensagemComInput("Informe o nome do eletronico");
    nome = scanner.next();

    Mensagem.mensagemComInput("Informe o preco do eletronico");
    preco = scanner.nextFloat();

    Mensagem.mensagemComInput("Informe a quantidade desse eletronico em estoque");
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

    Eletronico novoEletronico = new Eletronico(nome, pesoEmGramas, null, nome, lote, null, lactose);

    this.catalogo.add(novoAlimento);
  }

  @Override
  public <T> T buscar(int codigo) {
    for (Alimento alimento : catalogo) {
      if(alimento.getCodigo() == codigo) {
        return (T) alimento;
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
    Alimento alimento = buscar(codigo);

    Mensagem.mensagemComInput("Informe o nome do alimento");
    alimento.setNome(scanner.next());

    Mensagem.mensagemComInput("Informe o peso do alimento (em gramas)");
    alimento.setPesoEmGramas(scanner.nextFloat());

    Mensagem.mensagemComInput("Informe a quantidade desse alimento em estoque");
    alimento.setEstoque(scanner.nextInt());
    
    scanner.nextLine();

    Mensagem.mensagemComInput("Informe a data de validade do alimento");
    alimento.setDataDeValidade(LocalDate.parse(scanner.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy")));

    Mensagem.mensagemComInput("Informe a data de fabricação do alimento");
    alimento.setDataDeFabricacao(LocalDate.parse(scanner.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy")));

    Mensagem.mensagemComInput("Informe o lote de produção");
    alimento.setLote(scanner.next());

    Mensagem.mensagemComInput("O alimento possui gluten?");
    alimento.setGluten(scanner.nextBoolean());

    Mensagem.mensagemComInput("O alimento possui lactose?");
    alimento.setLactose(scanner.nextBoolean());

    return (T) alimento;
  }

  @Override
  public void excluir(int codigo) {
    for (Alimento alimento : catalogo) {
      if(alimento.getCodigo() == codigo) {
        catalogo.remove(alimento);
        System.out.println("Elemento removido");
        break;
      }
    }
    System.out.println(this.catalogo.toString());
  }

}
