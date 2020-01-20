
public class OperadoresRelacionais {

	public static void main(String[] args) {
		Boolean tresMaiorDois = 3 > 2;
		System.out.println("3 > 2? " + tresMaiorDois);
		
		Boolean tresMenorDois = 3 < 2;
		System.out.println("3 < 2? " + tresMenorDois);
		
		Boolean tresMaiorQueTres = 3 > 3;
		System.out.println("3 > 3? " + tresMaiorQueTres);
		
		Boolean tresMaiorOuIgualTres = 3 >= 3;
		System.out.println("3 >= 3? " + tresMaiorOuIgualTres);

		Boolean tresMenorOuIgualTres = 3 <= 3;
		System.out.println("3 <= 3? " + tresMenorOuIgualTres);
		
		Boolean doisIgualDois = 2 == 2;
		System.out.println("2 == 2? " + doisIgualDois);
		
		Boolean doisDiferenteDois = 2 != 2;
		System.out.println("2 != 2? " + doisDiferenteDois);
		
		Integer quatro = 4;
		Boolean quatroMaiorQuatro = quatro > quatro;
		System.out.println("Quatro > quatro? " + quatroMaiorQuatro);
		
		Boolean quatroMaiorOuIgualQuatro = quatro >= quatro;
		System.out.println("Quatro >= quatro? " + quatroMaiorOuIgualQuatro);
		
		Integer cinco = 5;
		Boolean cincoIgualCinco = cinco.equals(cinco);
		System.out.println("Cinco.equal(cinco)? " + cincoIgualCinco);
		
		Integer seis = 6;
		Boolean cincoIgualSeis = cinco.equals(seis);
		System.out.println("Cinco.equal(seis)? " + cincoIgualSeis);
		
		Integer centoVinteOito = 128;
		Integer centoVinteOito02 = 128;
		Boolean centoViteOitoIgualCentoVinteOito = centoVinteOito.equals(centoVinteOito02);
		System.out.println("centoVinteOito.equals(centoVinteOito02)? " + centoViteOitoIgualCentoVinteOito);
		
		Boolean centoViteOitoIgualCentoVinteOito02 = centoVinteOito == centoVinteOito02;
		System.out.println("centoVinteOito == centoVinteOito02? " + centoViteOitoIgualCentoVinteOito02);
		
	}

}
