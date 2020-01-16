import java.util.Scanner;

public class ValorCompra {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Qual o valor do produto? ");
		Double valorProduto = scanner.nextDouble();
		
		System.out.print("Qual a quantidade de produto desejado? ");
		Integer quantidadeProduto = scanner.nextInt();
		
		Double desconto = 0.0;
		
		if(quantidadeProduto > 10) {
			desconto = 10.0;
		}
		
		Double subTotal = valorProduto * quantidadeProduto;
		Double valorDesconto = subTotal * desconto / 100;
				
		System.out.println("O valor da compra é: " + (subTotal - valorDesconto));
		scanner.close();
	}
}
