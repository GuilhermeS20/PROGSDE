
package main;

import java.util.ArrayList;
import java.util.List;

public class PegarMenorNumero {

	
	public static void main(String[] args) {
		
		ArrayList<Integer> lista = new ArrayList<Integer>(List.of(1, 40 , 70, 90, 100,35));
	
		System.out.println(menorNumero(lista));
		
	}
	
	public static int menorNumero(ArrayList<Integer> numeros) {
		int menor = numeros.get(0);
		
		for(int i = 0; i < numeros.size(); i++) {
			int numero = numeros.get(i);
			
			if(numero < menor) {
				menor = numero;
				
			}
		}
		
		return menor;
	}

}
