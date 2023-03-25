package Exercicio4;

public class FaturaMensal {

	public static void main(String[] args) {
		
		double SP = 67836.43;
		double RJ = 36678.66;
		double MG = 29229.88;
		double ES = 27165.48;
		double Outros = 19849.53;
		
		double total = SP + RJ + MG + ES + Outros;
		System.out.println("Representação de comtribuição total: R$" + String.format("%.2f", total));
		System.out.println();
		
		double perSP = SP * 100 / total;
		double perRJ = RJ * 100 / total;
		double perMG = MG * 100 / total;
		double perES = ES * 100 / total;
		double perOutros = Outros * 100 / total;
		System.out.println("Percentual SP: "+ String.format("%.1f%%", perSP));
		System.out.println("Percentual RJ: "+ String.format("%.1f%%", perRJ));
		System.out.println("Percentual MG: "+ String.format("%.1f%%", perMG));
		System.out.println("Percentual ES: "+ String.format("%.1f%%", perES));
		System.out.println("Percentual Outros: "+ String.format("%.1f%%", perOutros));
	}

}
