import java.util.Scanner;

public class VerificaAprovacaoAluno {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Qual a nota do aluno? ");
		Double nota = scanner.nextDouble();

		Boolean passouDeAno = nota >= 70;

		if (passouDeAno) {
			System.out.println("O aluno foi aprovado!");
		} else {
			System.out.println("O aluno foi reprovado!");
		}
		scanner.close();
	}

}
