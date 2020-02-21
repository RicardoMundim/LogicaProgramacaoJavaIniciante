package exercicio01;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaDeTarefas {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		
		ArrayList<String> linhas = new ArrayList<String>();
		String tarefa = null;
		int i = 1;
		
		while(!"x".equals(tarefa)){
			System.out.println("Entre com a tarefa " + i + ": ");
			tarefa = scanner.nextLine();
			
			if(tarefa.equals("x")) {
				break;
				
			}
			linhas.add(tarefa);
			i++;
		}
		
		escreverNoArquivo("C:\\Projetos\\LogicaProgramacaoJavaIniciante\\Capitulo10\\EscritaLeitura\\exercicio.txt", linhas);
		
		scanner.close();
		
		System.out.println("Fim...");
	}
	
	static void escreverNoArquivo(String arquivo, ArrayList<String> linhas) throws IOException {
		Path path = Paths.get(arquivo);
		Files.write(path, linhas);
		
	}

}
