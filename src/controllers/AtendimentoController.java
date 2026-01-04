package controllers;

import java.util.Date;
import java.util.Scanner;
import java.util.UUID;

import entities.Atendimento;
import interfaces.AtendimentoRepository;
import repositories.AtendimentoRepositoryJson;
import repositories.AtendimentoRepositoryXml;

public class AtendimentoController {
	
	//você cria uma variável que pode receber um objeto 
	//de uma classe que assina (implementa) o contrato da interface
	private AtendimentoRepository repository;
	 
	public void realizarAtendimento()throws Exception{
		
		var scanner = new Scanner(System.in);
		
		System.out.println("\nSEJA BEM VINDO AO ATENDENTE VIRTUAL!\n");
		System.out.println("Tire suas dúvidas de suporte de TI:\n");
		
		var atendimento = new Atendimento();
		
		atendimento.setId(UUID.randomUUID());
		
		atendimento.setDataHora(new Date());
		
		System.out.println("INFORME O SEU NOME.........");
		atendimento.setNomeUsuario(scanner.nextLine());

		System.out.println("Escreva sua pergunta.......");
		atendimento.setPergunta(scanner.nextLine());
		
		System.out.println("Como deseja gravar este atendimento? (1)JSON ou (2)XML?");
		var opcao = Integer.parseInt(scanner.nextLine());
		
		switch(opcao) {
		case 1: repository = new AtendimentoRepositoryJson();break;
		//polimorfismo
		case 2: repository = new AtendimentoRepositoryXml();break;
		//polimorfismo
		}
		
		if(repository != null) {
			//exportando atendimento
			repository.exportarAtendimento(atendimento);
		}
		
	    scanner.close();
	}

}

