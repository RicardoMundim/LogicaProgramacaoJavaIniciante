
public class OperadoresIncrementoDecremento {

	public static void main(String[] args) {
		Integer numero = 10;
		System.out.println("N�mero antes: " + numero);
		
		++numero;
		System.out.println("N�mero depois: " + numero);
		
		Integer numero2 = 10;
		Integer numero02 = ++numero2;
		System.out.println("N�mero2: " + numero2 + ", N�mero02: " + numero02 );
		
		Integer numero3 = 10;
		Integer numero03 = numero3++;
		System.out.println("N�mero3: " + numero3 + ", N�mero03: " + numero03 );
	}

}
