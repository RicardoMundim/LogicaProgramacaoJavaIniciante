package exercicio02;

public class Produto {
	
	static final Integer QUANTIDADE_MINIMA_ESTOQUE = 10;
	
	String nome;
	
	Integer quantidadeEstoque;
	
	
	Boolean eNecessarioReporEstoque() {
		return quantidadeEstoque < QUANTIDADE_MINIMA_ESTOQUE;
	}
}
