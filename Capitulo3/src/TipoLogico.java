import java.util.Scanner;

public class TipoLogico {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Para saber se est� apto a tirar carteira, informe sua idade? ");
		Integer idade = scanner.nextInt();

		Boolean podeTirarCarteira = idade >= 18;

		if (podeTirarCarteira) {
			System.out.println("Sim! Ele(a) pode tirar carteira.");
		} else {
			System.out.println("N�o! Ele(a) n�o pode tirar carteira.");
		}
		
		scanner.close();
	}

}
