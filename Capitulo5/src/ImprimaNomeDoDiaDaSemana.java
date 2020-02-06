import java.util.Scanner;

public class ImprimaNomeDoDiaDaSemana {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Entre com o número referente ao dia da semana: ");
		Integer diaDaSemana = scanner.nextInt();

		String dia = null;

		switch (diaDaSemana) {
		case 1:
			dia = "Domingo";
			break;
		case 2:
			dia = "Segunda-feira";
			break;
		case 3:
			dia = "Terça-feira";
			break;
		case 4:
			dia = "Quarta-feira";
			break;
		case 5:
			dia = "Quint-feira.";
			break;
		case 6:
			dia = "Sexta-feira";
			break;
		case 7:
			dia = "Sábado.";
			break;
		default:
			System.err.println("Número informado deve estar entre 1 e 7.");
			System.exit(1);
		}
		
		System.out.println("O dia escolhido foi: " + dia);
		scanner.close();
	}

}
