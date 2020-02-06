import java.util.Scanner;

public class VerificarSePessoaPassouNoConcursoPublico {

	static final Integer NOTA_MINIMA_PARA_CLASSIFICACAO = 150;
	
	static final Integer NOTA_MINIMA_PARA_DESCLASSIFICACAO = 60;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Entre com a nota de português: ");
		Double notaPortugues = scanner.nextDouble();
		
		System.out.print("Entre com a nota de matemática: ");
		Double notaMatematica = scanner.nextDouble();
		
		if(notaPortugues < NOTA_MINIMA_PARA_DESCLASSIFICACAO || notaMatematica < NOTA_MINIMA_PARA_DESCLASSIFICACAO) {
			System.out.println("Você foi desclassificado.");
		} else if((notaMatematica + notaPortugues) >= NOTA_MINIMA_PARA_CLASSIFICACAO) {
			System.out.println("Você foi classificado.");
		}else {
			System.out.println("Você foi desclassificado.");
		}
		
		
		scanner.close();
	}

}

/*
 public class Exercicio01 {
	
	static final Double NOTA_DESCLASSIFICATORIA_GERAL = 150.0;
	
	static final Double NOTA_MINIMA = 60.0;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("VERIFICANDO SE TEM NOTA SUFICIENTE PARA CONCURSO.");
		
		System.out.print("Português: "); 
		Double notaDePortugues = scanner.nextDouble();
		
		System.out.print("Matemática: "); 
		Double notaDeMatematica = scanner.nextDouble();
		
		Boolean estaAcimaDoMinimoEmPortugues = notaDePortugues >= NOTA_MINIMA;
		
		Boolean estaAcimaDoMinimoEmMatematica = notaDeMatematica >= NOTA_MINIMA;
		
		Double notaTotal = notaDePortugues + notaDeMatematica;
		
		Boolean temNotaParaPassar = notaTotal >= NOTA_DESCLASSIFICATORIA_GERAL;
		
		Boolean passou = temNotaParaPassar && estaAcimaDoMinimoEmPortugues && estaAcimaDoMinimoEmMatematica;

		if (passou) {
			System.out.println("Parabéns! Você passou.");
		} else {
			System.out.println("Infelizmente, não foi dessa vez.");
		}
		
		scanner.close();
	}

}
*/
