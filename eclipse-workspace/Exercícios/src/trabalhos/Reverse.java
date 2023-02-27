package trabalhos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		ArrayList<String> listaNomes = new ArrayList<String>();
		
		System.out.println("Digite a quantidade de nomes:");
		
		int qtd = teclado.nextInt();
		
		for(int i = 0; i < qtd ; i++) {
			String nome = teclado.next();
			listaNomes.add(nome);
		}
		
		/*for(int i = listaNomes.size()-1; i > 0; i--) {
			System.out.println(listaNomes.get(i));
		}
		*/
		System.out.println("Ordem normal:");
		System.out.println(listaNomes);
		
		Collections.reverse(listaNomes);
		
		System.out.println("Ordem reversa:");
		System.out.println(listaNomes);

	}

}
