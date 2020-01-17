import java.util.Scanner;

public class ImprimaNomeCompleto {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Qual é o seu nome: ");
		String nome = scanner.nextLine();
		
		System.out.print("Qual é o seu sobrenome: ");
		String sobrenome = scanner.nextLine();
		
		System.out.println(nome + " " + sobrenome);
		
		scanner.close();
		
		


	}

}
