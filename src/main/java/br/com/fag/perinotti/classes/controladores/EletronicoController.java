package br.com.fag.perinotti.classes.controladores;

import java.util.ArrayList;
import java.util.Scanner;

import br.com.fag.perinotti.classes.catalogos.CatalogoEletronico;
import br.com.fag.perinotti.classes.produtos.Eletronico;
import br.com.fag.perinotti.classes.produtos.ProdutoBase;
import br.com.fag.perinotti.enums.EnumVoltagem;
import br.com.fag.perinotti.interfaces.Controller;
import br.com.fag.perinotti.utils.Mensagem;
import br.com.fag.perinotti.utils.Terminal;

public class EletronicoController implements Controller {
  private ArrayList<Eletronico> catalogo = CatalogoEletronico.catalago();
  
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
    estoque = Terminal.validarInteiro(scanner);
    
    scanner.nextLine();

    Mensagem.mensagemComInput("Informe o numero de serie do eletronico");
    numeroDeSerie = scanner.nextLine();

    Mensagem.mensagemComInput("Informe a marca do eletronico");
    marca = scanner.nextLine();

    Mensagem.exibirMensagemComOpcoes(EnumVoltagem.getAll(), "Escolha voltagem do eletronico");
    voltagem = EnumVoltagem.values()[Terminal.validarInteiro(scanner) - 1];

    Mensagem.mensagemComInput("O eletronico funciona a bateria?");
    funcionaABateria = scanner.nextBoolean();

    Mensagem.mensagemComInput("O eletronico possui seguro?");
    possuiSeguro = scanner.nextBoolean();

    Eletronico novoEletronico = new Eletronico(nome, preco, estoque, numeroDeSerie, marca, voltagem, funcionaABateria, possuiSeguro);

    this.catalogo.add(novoEletronico);
  }

  @Override
  public <T> T buscar(int codigo) {
    for (Eletronico eletronico : catalogo) {
      if(eletronico.getCodigo() == codigo) {
        return (T) eletronico;
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
    Eletronico eletronico = buscar(codigo);

    Mensagem.mensagemComInput("Informe o nome do eletronico");
    eletronico.setNome(scanner.next());

    Mensagem.mensagemComInput("Informe o preco do eletronico");
    eletronico.setPreco(scanner.nextFloat());

    Mensagem.mensagemComInput("Informe a quantidade desse eletronico em estoque");
    eletronico.setEstoque(Terminal.validarInteiro(scanner));

    Mensagem.mensagemComInput("Informe o numero de serie do eletronico");
    eletronico.setNumeroDeSerie(scanner.nextLine());

    Mensagem.mensagemComInput("Informe a marca do eletronico");
    eletronico.setMarca(scanner.nextLine());

    Mensagem.exibirMensagemComOpcoes(EnumVoltagem.getAll(), "Escolha voltagem do eletronico");
    eletronico.setVoltagem(EnumVoltagem.values()[Terminal.validarInteiro(scanner) - 1]);

    Mensagem.mensagemComInput("O eletronico funciona a bateria?");
    eletronico.setFuncionaABateria(scanner.nextBoolean());

    Mensagem.mensagemComInput("O eletronico possui seguro?");
    eletronico.setPossuiSeguro(scanner.nextBoolean());

    return (T) eletronico;
  }

  @Override
  public void excluir(int codigo) {

    for (Eletronico eletronico : catalogo) {
      if(eletronico.getCodigo() == codigo) {
        catalogo.remove(eletronico);
        System.out.println("Eletronico removido");
        break;
      }
    }
  }

}
