import java.util.Scanner;

public class CadastrandoAsTarefasDoDia {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String[] tarefas = new String[5];
		
		for(int i = 0; i < tarefas.length; i++) {
			System.out.print("Entre com a tarefa [" + i + "]: ");
			tarefas[i] = scanner.nextLine();
		}
		
		for(int i = 0; i < tarefas.length; i++) {
			System.out.println("As tarefas do dia s�o: " + tarefas[i]);
		}
		
//		String[] tarefas = new String[5];
//		
//		for(int i = 0; i < tarefas.length; i++) {
//			System.out.print("Tarefa " + i + ": ");
//			tarefas[i] = scanner.nextLine();
//		}
//		
//		
//		System.out.println("Suas tarefas s�o: ");
//		for(int i = 0; i < tarefas.length; i++) {
//			System.out.println(i + ": " + tarefas[i]);
//		}
		
		scanner.close();
		
		
	}

}
