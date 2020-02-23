package exercicio02;

import console.Interacao;

public class CalcularValorTroco {

	public static void main(String[] args) {

		Interacao interacao = new Interacao();

		Double valorProduto = interacao.lerDecimal("Digite o valor do produto:  ");

		Double valorPassadoPeloCliente = interacao.lerDecimal("Digite quantidade passada pelo cliente: ");

		Double valorTrocoDaCompra = valorPassadoPeloCliente - valorProduto;
		
		interacao.imprimir("O troco do cliente é: " + valorTrocoDaCompra);

		interacao.fechar();
		
	}

}
