package encapsulamento;

public class Encapsulamento {

	public static void main(String[] args) {
		Cliente cliente = new Cliente();

		cliente.setNome("Ricardo Mundim");
		cliente.setTelefone("34922334455");

		System.out.println("Nome cliente: " + cliente.getNome());
		System.out.println("Primeiro nome: " + cliente.getPrimeiroNome());
		System.out.println("Ultimo nome: " + cliente.getUltimoNome());
	}

}
