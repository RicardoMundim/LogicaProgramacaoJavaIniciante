package metodoinstancia;

public class Cliente {
	String primeiroNome;
	
	String ultimoNome;
	
	String telefone;
	
	String email;

	String obterNomeCompleto() {
		return primeiroNome +  " " + ultimoNome;
	}
	
	String obterDDD() {
		return telefone.substring(0, 2);
	}
}
