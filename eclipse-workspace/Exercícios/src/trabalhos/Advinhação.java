package trabalhos;

import java.util.Scanner;

public class Advinhação {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numCorreto = 10000;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Adivinhe o número:");
		
		int num = teclado.nextInt();
		
		if(num == numCorreto) {
			System.out.println("Prabéns,você advinhou corretamente!");
		}else if(num > numCorreto) {
			System.out.println("O número correto é menor que " + num);
		}else if(num < numCorreto) {
			System.out.println("O número correto é maior que " + num);
		}
	}

}
