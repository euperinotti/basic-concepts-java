package br.com.fag.perinotti.classes.atendimento;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.fag.perinotti.classes.controladores.AlimentoController;
import br.com.fag.perinotti.classes.controladores.EletronicoController;
import br.com.fag.perinotti.classes.controladores.LivroController;
import br.com.fag.perinotti.enums.EnumOperacoes;
import br.com.fag.perinotti.enums.EnumTipoDeProduto;
import br.com.fag.perinotti.interfaces.Controller;
import br.com.fag.perinotti.utils.Mensagem;
import br.com.fag.perinotti.utils.Terminal;

public class Atendimento {
  public static void inicarAtendimento() {
    Scanner scanner = new Scanner(System.in);
    boolean condicao = true;
    List<Controller> controllers = new ArrayList<>();
    controllers.add(new AlimentoController());
    controllers.add(new EletronicoController());
    controllers.add(new LivroController());

    Mensagem.mensagem("Bem vindo ao sistema de cadastro de produtos");
    Mensagem.exibirMensagemComOpcoes(EnumTipoDeProduto.getAll(), "Escolha o tipo de produto");
    
    Controller controller = controllers
          .get(Terminal.validarElementoSelecionado(controllers, Terminal.validarInteiro(scanner) - 1, scanner));

    while (condicao) {
      Mensagem.exibirMensagemComOpcoes(EnumOperacoes.getAll(), "Oque deseja fazer?");
      switch (Terminal.validarInteiro(scanner) - 1) {
        case 0:
          controller.criar();
          break;
        case 1:
          System.out.println(controller.buscarTodos().toString());
          break;
        case 2:
          Mensagem.mensagemComInput("Informe o código do produto para editar");
          controller.editar(Terminal.validarInteiro(scanner));
          break;
        case 3:
          Mensagem.mensagemComInput("Informe o código do produto para excluir");
          controller.excluir(Terminal.validarInteiro(scanner));
          break;
        case 4:
          Mensagem.mensagem("Você escolheu sair");
          condicao = false;
          break;
      }
    }

    scanner.close();
  }

}
