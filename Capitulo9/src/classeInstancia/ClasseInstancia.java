package classeInstancia;

public class ClasseInstancia {

	public static void main(String[] args) {
		System.out.println("Quantidade minima estoque: " + Produto.quantidadeMinimaEstoque);

		Produto produto = new Produto();
		produto.nome = "Caneca";

		Produto produto2 = new Produto();
		produto2.nome = "Carteira";

		Impressao.informacao("Produto 1: " + produto.nome);
		Impressao.informacao("Produto 2: " + produto2.nome);

	}

}
