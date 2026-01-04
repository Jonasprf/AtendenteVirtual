package repositories;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import entities.Atendimento;
import interfaces.AtendimentoRepository;

public class AtendimentoRepositoryJson implements AtendimentoRepository {
	
	@Override
	public void exportarAtendimento(Atendimento atendimento)throws Exception{
		
		var file = new File("c:\\temp\\atendimento_" +atendimento.getId()+ ".json");
		
		var objectMapper = new ObjectMapper();
		objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
		objectMapper.writeValue(file, atendimento);
		
	}

}
