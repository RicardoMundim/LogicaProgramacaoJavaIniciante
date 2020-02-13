package exercicio02;

public class MetodoQueInformaNecessidadeDeReporEstoque {

	public static void main(String[] args) {
		Produto produto = new Produto();
		produto.nome = "Smartphone";
		produto.quantidadeEstoque = 8;

		System.out.println(
				"Necessário repor estoque do produto " + produto.nome + "? " + produto.eNecessarioReporEstoque());
	}

	
}
