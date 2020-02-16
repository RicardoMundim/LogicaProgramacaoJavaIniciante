package metodoinstancia;

public class MetodoInstancia {

	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		cliente.primeiroNome = "Ricardo";
		cliente.ultimoNome = "Mundim";
		cliente.telefone = "3432159876";
		cliente.email = "ricardomundim@algaworks.com.br";
		
		System.out.println("Nome cliente: " + cliente.obterNomeCompleto() + ", DDD: " + cliente.obterDDD());
				
	}

}
