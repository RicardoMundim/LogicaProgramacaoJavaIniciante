
public class EstruturaIf {

	public static void main(String[] args) {
		Double emprestimo = 4000.0;
		Double movimentacaoMedia = 2000.0;
		
//		Boolean movimentaPeloMenosMetadeDoValor = (movimentacaoMedia * 2) >= emprestimo;
		Boolean aContaTemTempoSuficienteDeAbertura = true;
		Boolean temNomeLimpo = true;

//		Boolean liberaEmprestimo = movimentaPeloMenosMetadeDoValor && aContaTemTempoSuficienteDeAbertura
//				&& temNomeLimpo;
		
//		if(liberaEmprestimo) {
//			System.out.println("Sim! Pode liberar empr�stimo.");
//		}
		
		if(((movimentacaoMedia * 2) >= emprestimo) && aContaTemTempoSuficienteDeAbertura && temNomeLimpo) {
			System.out.println("Sim! Pode liberar empr�stimo.");
		} else {
			System.out.println("N�o pode liberar o empr�stimo.");
		}
	}

}
