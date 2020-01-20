
public class OperadoresIncrementoDecremento {

	public static void main(String[] args) {
		Integer numero = 10;
		System.out.println("Número antes: " + numero);
		
		++numero;
		System.out.println("Número depois: " + numero);
		
		Integer numero2 = 10;
		Integer numero02 = ++numero2;
		System.out.println("Número2: " + numero2 + ", Número02: " + numero02 );
		
		Integer numero3 = 10;
		Integer numero03 = numero3++;
		System.out.println("Número3: " + numero3 + ", Número03: " + numero03 );
	}

}
