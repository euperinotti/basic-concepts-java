package br.com.fag.perinotti.classes.atendimento;

import br.com.fag.perinotti.classes.controladores.AlimentoController;
import br.com.fag.perinotti.enums.EnumOperacoes;
import br.com.fag.perinotti.enums.EnumTipoDeProdutos;
import br.com.fag.perinotti.utils.Mensagem;

public class Atendimento {
  public static void inicarAtendimento() {
    
    Mensagem.mensagem("Bem vindo ao sistema de cadastro de produtos");
    Mensagem.exibirMensagemComOpcoes(EnumOperacoes.getAll(), "Oque deseja fazer?");
    new AlimentoController().
    
  }
}
