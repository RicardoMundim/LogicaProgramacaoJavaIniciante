import java.util.Scanner;

public class CalculoDeGastosFamiliar {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Double gastoTotalMes = 0.0;
		
		System.out.print("Entre com o valor da conta de luz: ");
		gastoTotalMes += scanner.nextDouble();
		
		System.out.print("Entre com o valor da conta de �gua: ");
		gastoTotalMes += scanner.nextDouble();
		
		System.out.print("Entre com o valor da conta de telefone: ");
		gastoTotalMes += scanner.nextDouble();
		
		System.out.print("Entre com  o valor da escola do filho: ");
		gastoTotalMes += scanner.nextDouble();
		
		System.out.print("Entre com o valor do cart�o de cr�dito: ");
		gastoTotalMes += scanner.nextDouble();
		
		System.out.print("Entre com o valor do supermercado: ");
		gastoTotalMes += scanner.nextDouble();
		
		System.out.println("O gasto total no m�s foi de: " + gastoTotalMes);
		
		scanner.close();
	}

}
