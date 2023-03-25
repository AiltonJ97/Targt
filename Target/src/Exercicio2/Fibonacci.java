package Exercicio2;

import java.util.Scanner;
/*Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores
(exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...),
escreva um programa na linguagem que desejar onde, informado
um número, ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número
informado pertence ou não a sequência.
*/

public class Fibonacci {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		
		int y = 0, z = 1;
		int[] vect = new int[30];
		
		for(int i = 0; i < 30; i++){
            y = y + z;
            z = y - z;
            vect[i] = z;
        }
		
		System.out.println("Digite um numero: ");
		int num = sc.nextInt();
		boolean x = true;
		for (int i = 0; i < 30; i++) {
			if(num == vect[i]) {
				System.out.println("Pertence");
				x = true;
				break;
			}else {
				x = false;
			}
		}
		if(x == false) {
			System.out.println("Nao pertence");
		}
		
		sc.close();
	}
}
