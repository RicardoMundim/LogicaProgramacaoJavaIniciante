import java.util.Scanner;

public class CalculeBonusFuncionario {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Entre como a meta do faturamento anual: ");
		Double metaFaturamento = scanner.nextDouble();
		
		System.out.print("Entre como faturamento no ano: ");
		Double faturamento = scanner.nextDouble();
		
		System.out.print("Entre como a média salarial: ");
		Double mediaSalarial = scanner.nextDouble();
		
		Double bonus = 0.0;
		
		if(faturamento >= metaFaturamento) {
			bonus = mediaSalarial;
		} else if (faturamento >= (metaFaturamento * 0.8)) {
			bonus = mediaSalarial * 0.8;
		}
		
		System.out.println("A bonificação a ser recebida pelo funcionário é de: " + bonus);
	
//		Double oitentaPorCentoDaMeta = (meta * 80) / 100;
//		
//		Boolean bateuAMeta = faturamento >= meta;
//		
//		Boolean faturouPeloMenosOitentaPorCento = faturamento >= oitentaPorCentoDaMeta;
//		
//		if (bateuAMeta) {
//			System.out.println("Você vai ganhar um bônus de 100%! Ele será de: " + mediaSalarial);
//		} else if (faturouPeloMenosOitentaPorCento) {
//			Double oitentaPorCentoDaMediaSalarial = (mediaSalarial * 80) / 100; // Esse cálculo só precisa ser feito se a meta NÃO tiver sido batida e, por isso, ele ficou aqui.
//			
//			System.out.println("Você vai ganhar um bônus de 80%! Ele será de: " + oitentaPorCentoDaMediaSalarial);
//		} else {
//			System.out.println("Infelizmente, esse ano não tem bônus!");
//		}
		
		scanner.close();
	}

}
