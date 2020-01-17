import java.util.Scanner;

public class VerificaAprovacaoAlunoComConstante {

	static final Integer NOTA_MINIMA_PARA_APROVACAO = 70;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Qual a nota do aluno? ");
		Double nota = scanner.nextDouble();

		Boolean passouDeAno = nota >= NOTA_MINIMA_PARA_APROVACAO;

		if (passouDeAno) {
			System.out.println("O aluno foi aprovado!");
		} else {
			System.out.println("O aluno foi reprovado!");
		}
		scanner.close();
	}

}
