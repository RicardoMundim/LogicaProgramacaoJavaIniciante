import java.util.Scanner;

public class CalculadoraSimples {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Entre com o primeiro valor: ");
		Double primeiroValor = scanner.nextDouble();
		
		System.out.print("Operação [1 = + | 2 = - | 3 = * | 4 = /]: ");
		Integer operacao = scanner.nextInt();
		
		System.out.print("Entre com o segundo valor: ");
		Double segundoValor = scanner.nextDouble();
		
		Double resultado = null;
		if(operacao.equals(1)) {
			resultado =  (primeiroValor + segundoValor);
		} 
		
		if(operacao.equals(2)) {
			resultado = (primeiroValor - segundoValor);
		} 
		
		if(operacao.equals(3)) {
			resultado = (primeiroValor * segundoValor);
		}
		
		if(operacao.equals(4)) {
			resultado =  (primeiroValor / segundoValor);
		}
		
		System.out.println("Resultado: " + resultado);
		
		scanner.close();
	}
}
