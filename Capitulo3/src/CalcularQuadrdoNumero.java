import java.util.Scanner;

public class CalcularQuadrdoNumero {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite o n�mero que deseja calcular o quadrado: ");
		Double numeroDesejado = scanner.nextDouble();
		
		Double numeroQuadrado = numeroDesejado * numeroDesejado;
		
		System.out.println("O quadrado do n�mero digitado �: " + numeroQuadrado);

		scanner.close();
	}

}
