package exercicio03;

public class ExibindoDadosDeUmPedido {

	public static void main(String[] args) {

		Pedido pedido = new Pedido();

		pedido.codigo = 1;
		pedido.subtotal = 100.0;
		pedido.desconto = 5.0;

		System.out.println("Código: " + pedido.getCodigo() + ", Subtoral: " + pedido.getSubtotal() + ", Desconto: "
				+ pedido.getDesconto() + ", Total: " + pedido.getTotal());
	}
}
