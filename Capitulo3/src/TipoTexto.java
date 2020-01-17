import java.util.Scanner;

public class TipoTexto {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String nome = scanner.nextLine();
		
		System.out.println("Olá " + nome + "!");
		
		scanner.close();
		
		Character variavelChar = 'a';
		
		System.out.println(variavelChar);
	}

}
