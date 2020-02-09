import java.util.Scanner;

public class Calculadora {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Double numero1 = receberNumeroDoUsuario("Entre com o primerio número: ", scanner);
		imprimirTraco();
		
		Double numero2 = receberNumeroDoUsuario("Entre com o segundo número: ", scanner);
		imprimirTraco();
		
		Integer operacaoEscolhida = escolhaAOperacao(scanner);
		imprimirTraco();
		
		Double resultado = realizaCalculo(numero1, numero2, operacaoEscolhida);
		
		System.out.println("O resultado é: " + resultado);
		
		scanner.close();
	}
	
	static Double realizaCalculo(Double numero1, Double numero2, Integer operacaoEscolhida) {
		Double resultado = null;
		
		switch(operacaoEscolhida) {
		case 0:
			resultado = adicao(numero1, numero2);
			break;
		case 1:
			resultado = subtracao(numero1, numero2);
			break;
		case 2: 
			resultado = multiplicacao(numero1, numero2);
			break;
		case 3:
			resultado = divisao(numero1, numero2);
			break;
		default:
			System.err.println("Escolha uma operação válida!");
			System.exit(1);
		}
		
		return resultado;
		
	}
	
	static Double adicao(Double numero1, Double numero2) {
		return numero1 + numero2;
	}
	
	static Double subtracao(Double numero1, Double numero2) {
		return numero1 - numero2;
	}
	
	static Double multiplicacao(Double numero1, Double numero2) {
		return numero1 * numero2;
	}
	
	static Double divisao(Double numero1, Double numero2) {
		return numero1 / numero2;
	}
	
	
	static void imprimir(String texto) {
		System.out.println(texto);
	}
	
	
	static Integer escolhaAOperacao(Scanner scanner) {
		System.out.println("ESCOLHA A OPERAÇÃO");
		
		String[] operacoes = new String[] {"Adição", "Subtração", "Multiplicação", "Divisão"};
		
		for(int i = 0; i < operacoes.length; i++) {
			System.out.println("[" + i + "] " + operacoes[i]);
		}
		
		System.out.print("Digite a operação: ");
		
		return scanner.nextInt();
	}
	
	static void imprimirEContinuarMesmaLinha(String texto) {
		System.out.print(texto);
	}
	
	static Double receberNumeroDoUsuario(String texto, Scanner scanner) {
		imprimirEContinuarMesmaLinha(texto);
		Double numero = scanner.nextDouble();
		return numero;
	}
	
	static void imprimirTraco() {
		System.out.println("---------------------------------------");
	}
}
