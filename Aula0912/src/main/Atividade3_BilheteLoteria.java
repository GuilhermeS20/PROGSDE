package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Atividade3_BilheteLoteria {

	public static void main(String[] args) {
		// Crie um programa de loteria que pede e armazena 6 números inteiro de 0 a 100.
		// Ao final imprima o bilhete gerado para o jogador.
		// - Os números escolhidos DEVEM ser entre 0 e 100
		// - Não se deve permitir escolher números repetidos (bilhete.contains(numero))
	    // - Imprimir o bilhete no formato "xx - xx - xx - xx - xx - xx" 
		// Dica: Comece tentando imprimir cada número do bilhete por linha
		
		Scanner leitor = new Scanner(System.in);
        ArrayList<Integer> bilhete = new ArrayList<Integer>();
        //CRUD > CREATE > READ > UPDATE > DELETE
        // INSERIR > LER/VER > ATUALIZAR/MODIFICIAR > APAGAR
        while(true) {
            System.out.println("Digite um número:");
            int numero = leitor.nextInt();
            
            if (numero >= 0 && numero <= 100) {
                if (bilhete.contains(numero)) {
                    System.out.println("Você já inseriu esse número! Escolha outro!");
                }else {
                    bilhete.add(numero);
                }
                
            }else {
                System.out.println("Número inválido!");
            }
            
            if (bilhete.size() == 6) {
                break;
            }
            
        }
        

        System.out.println(bilhete);

	}

}
