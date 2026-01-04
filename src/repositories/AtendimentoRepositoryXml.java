package repositories;

import java.io.PrintWriter;

import entities.Atendimento;
import interfaces.AtendimentoRepository;

public class AtendimentoRepositoryXml implements AtendimentoRepository {

	@Override
	public void exportarAtendimento(Atendimento atendimento) throws Exception {
		var printWriter = new PrintWriter("c:\\temp\\atendimento_" + atendimento.getId() + ".xml");

		printWriter.println("<?xml version='1.0' encoding='UTF-8'?>");

		printWriter.println("<atendimento>");
		printWriter.println("<id>" + atendimento.getId() + "</id>");
		printWriter.println("<nomeUsuario>" + atendimento.getNomeUsuario() + "</nomeUsuario>");
		printWriter.println("<data>" + atendimento.getDataHora() + "</data>");
		printWriter.println("<pergunta>" + atendimento.getPergunta() + "</pergunta>");
		printWriter.println("<resposta>" + atendimento.getResposta() + "</resposta>");
		printWriter.println("</atendimento>");

		printWriter.close();
	}

}
