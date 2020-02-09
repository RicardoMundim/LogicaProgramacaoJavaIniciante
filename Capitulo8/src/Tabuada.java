import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		imprimir("Entre com o número para calcular a tabuada: ");
		Integer multiplicando  = scanner.nextInt();
		
		System.out.println("----------------------------------");
		
		imprimirTabuada(multiplicando ,1);
		scanner.close();

	}

	static void imprimir(String texto) {
		System.out.println(texto);
	}
	
	static void imprimirTabuada(Integer multiplicando , Integer multiplicador) {
		imprimir(multiplicando + " x " + multiplicador + " = " + multiplicando * multiplicador );
		
		if(++multiplicador <= 10) {
			imprimirTabuada(multiplicando, multiplicador);
		}
		
	}
}
