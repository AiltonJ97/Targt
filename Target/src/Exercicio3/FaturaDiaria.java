package Exercicio3;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class FaturaDiaria {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Faturamento> list = new ArrayList<>();
		
		System.out.println("Quantos dias tem o faturamento? ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.print("Dia: ");
			int dia = sc.nextInt();
			System.out.print("Valor: ");
			double valor = sc.nextDouble();
			list.add(new Faturamento(dia, valor));
		}
		
		double media = 0;
		for (Faturamento fat : list) {
			media += fat.getValor();
			if (fat.getValor() == 0) {
				n -= 1;
			}
		}
		
		double maior = 0;
		double menor = 0;
		int diaMaior = 0;
		int diaMenor = 0;
		for(Faturamento fat : list) {
			if(maior < fat.getValor()) {
				maior = fat.getValor();
				diaMaior = fat.getDia();
			}
			if(menor > fat.getValor() || fat.getValor() > 0) {
				menor = fat.getValor();
				diaMenor = fat.getDia();
			}
		}
		
		System.out.println();
		System.out.println("Maior faturamento: " + String.format("%.2f", maior)+ " Dia: " + diaMaior);
		System.out.println("Menor faturamento: "+ String.format("%.2f", menor)+ " Dia: " + diaMenor);
		
		System.out.println();
		double mediaMensal = media /n;
		System.out.println("MEDIA: " + String.format("%.2f", mediaMensal));
		
		int dias = 0;
		for(Faturamento fat : list) {
			if(fat.getValor() > mediaMensal) {
				dias += 1;
			}
		}
		System.out.println("Valor de faturamento diário foi superior à média mensal: " + dias+ " Dias.");
		
		sc.close();
	}
}
