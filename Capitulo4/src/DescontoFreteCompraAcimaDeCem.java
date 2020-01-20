import java.util.Scanner;

public class DescontoFreteCompraAcimaDeCem {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Entre com o valor do produto: ");
		Double valorProduto = scanner.nextDouble();
		
		Boolean precisaCobrarFrete = valorProduto < 100;
		
		Double valorFinal = valorProduto;
		
		if(precisaCobrarFrete) {
			valorFinal += 15.0;
		}
		
		System.out.println("Valor final da compra é: " + valorFinal);
		
		scanner.close();
	}

}
