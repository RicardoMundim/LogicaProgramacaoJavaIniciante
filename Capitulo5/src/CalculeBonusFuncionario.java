import java.util.Scanner;

public class CalculeBonusFuncionario {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Entre como a meta do faturamento anual: ");
		Double metaFaturamento = scanner.nextDouble();
		
		System.out.print("Entre como faturamento no ano: ");
		Double faturamento = scanner.nextDouble();
		
		System.out.print("Entre como a m�dia salarial: ");
		Double mediaSalarial = scanner.nextDouble();
		
		Double bonus = 0.0;
		
		if(faturamento >= metaFaturamento) {
			bonus = mediaSalarial;
		} else if (faturamento >= (metaFaturamento * 0.8)) {
			bonus = mediaSalarial * 0.8;
		}
		
		System.out.println("A bonifica��o a ser recebida pelo funcion�rio � de: " + bonus);
	
//		Double oitentaPorCentoDaMeta = (meta * 80) / 100;
//		
//		Boolean bateuAMeta = faturamento >= meta;
//		
//		Boolean faturouPeloMenosOitentaPorCento = faturamento >= oitentaPorCentoDaMeta;
//		
//		if (bateuAMeta) {
//			System.out.println("Voc� vai ganhar um b�nus de 100%! Ele ser� de: " + mediaSalarial);
//		} else if (faturouPeloMenosOitentaPorCento) {
//			Double oitentaPorCentoDaMediaSalarial = (mediaSalarial * 80) / 100; // Esse c�lculo s� precisa ser feito se a meta N�O tiver sido batida e, por isso, ele ficou aqui.
//			
//			System.out.println("Voc� vai ganhar um b�nus de 80%! Ele ser� de: " + oitentaPorCentoDaMediaSalarial);
//		} else {
//			System.out.println("Infelizmente, esse ano n�o tem b�nus!");
//		}
		
		scanner.close();
	}

}
