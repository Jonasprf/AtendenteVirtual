package principal;

import controllers.AtendimentoController;

public class Main {

	public static void main(String[] args) {
		
		var atendimentoController = new AtendimentoController();
		
		try {
			
			atendimentoController.realizarAtendimento();
			
			System.out.println("\nAtendimento realizado com sucesso!");
		}
		catch(Exception e) {
			System.out.println("\nErro ao relaizar atendimento: " + e.getMessage());
		}

	}

}
