package exercicio01;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import org.apache.commons.mail.EmailException;

public class ListaDeTarefas {

	public static void main(String[] args) throws IOException, EmailException {
		Scanner scanner = new Scanner(System.in);
		
		ArrayList<String> linhas = new ArrayList<String>();
		String listaComAsTarefas = null;
		int i = 1;
		
		while(!"x".equals(listaComAsTarefas)){
			System.out.println("Entre com a tarefa " + i + ": ");
			listaComAsTarefas = scanner.nextLine();
			
			if(listaComAsTarefas.equals("x")) {
				break;
				
			}
			linhas.add(listaComAsTarefas);
			i++;
		}
		
		String tarefas = "";
		
		for (int iteracao = 0; iteracao < linhas.size(); iteracao++) {
			tarefas += linhas.get(iteracao) + "\\n"; // Repare aqui a quebra de linha.
		}

		String mensagem = "Suas tarefas: \\n" + tarefas; 
		
		System.out.println("Digite o e-mail do destinatario: ");
		String destinatario = scanner.next();
		
		EnvioEmail.enviar(destinatario, "Sua lista de tarefas", mensagem);
		
		System.out.println("Fim...");
		
		scanner.close();
		
		
	}
	
}
