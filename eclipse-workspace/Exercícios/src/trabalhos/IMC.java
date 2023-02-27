package trabalhos;

import java.util.Scanner;

public class IMC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o peso e a altura para saber o IMC:");
		
		int peso = teclado.nextInt();
		double altura = teclado.nextDouble();
		
		double imc = peso / (altura * altura);
		
		System.out.printf("IMC: %.2f", imc);
		
	}

}
