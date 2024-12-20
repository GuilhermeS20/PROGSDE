package main;

import java.util.ArrayList;
import java.util.Scanner;

public class Atividade2_NotaFiscal {

	public static void main(String[] args) {
		// •Atividade 2 - Crie um programa que calcula o total a pagar de um usuário. 
		// O usuário digita valores monetários até digitar 0 e ao final deve-se exibir
		// o total e os valores digitados. (Use lista)
		
		// Desafio:
		// Imprima no seguinte formato
        // Nota Fiscal:
        // Produto 1 - R$ {valor1}
        // Produto 2 - R$ {valor2}
        // .
        // .
        // .
        // Total: R$ {soma}
		
		Scanner leitor = new Scanner(System.in);
		ArrayList<String> produto = new ArrayList<String>();
		ArrayList<Double> valores = new ArrayList<Double>();
        
        
        while(true) {
        	System.out.print("Digite um produto: ");
        	System.out.print("Digite um preço: R$");
            
            
            double valor = Double.valueOf(leitor.nextLine());
            
            if(valor == 0) {
                System.out.println("Encerrando Carrinho de Compras");
                break;
            }
            else {
                valores.add(valor);
             }
           }
        
            double soma = 0;
            for (int i = 0; i < valores.size(); i++) {
            System.out.println(valores.get(i));
            soma += valores.get(i);
            }
        System.out.println("Total: R$ "+ soma);

   }
}