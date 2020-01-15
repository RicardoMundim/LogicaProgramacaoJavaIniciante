import java.util.Scanner;

public class CalcularValorTroco {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o valor do produto: ");
		Double valorProtudo = scanner.nextDouble();
		
		System.out.print("Digite quantidade passada pelo cliente: ");
		Double valorPassadoPeloCliente = scanner.nextDouble();
		
		Double resultado = valorPassadoPeloCliente - valorProtudo;
		System.out.println("O troco do cliente é: " + resultado);
		
		scanner.close();
	}

}
