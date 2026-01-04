package interfaces;

import entities.Atendimento;

public interface AtendimentoRepository {
	
	public void exportarAtendimento(Atendimento atendimento)throws Exception;

}
