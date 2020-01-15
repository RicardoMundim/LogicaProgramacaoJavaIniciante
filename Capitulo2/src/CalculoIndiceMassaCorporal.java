import java.util.Scanner;

public class CalculoIndiceMassaCorporal {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		double peso, altura, imc;

		System.out.print("Entre com o seu peso: ");
		peso = scanner.nextDouble();
		System.out.print("Entre com a sua altura: ");
		altura = scanner.nextDouble();
		
		imc = peso / (altura * altura);
		
		System.out.print("O seu imc é : " + imc);
		
		scanner.close();

	}
}
