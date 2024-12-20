package main;

import java.util.Scanner;

public class devolver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner leitor = new Scanner(System.in);
String nome;
System.out.println("escreva um texto");
nome = leitor.nextLine();
 if (nome.charAt(0) =='A') {
	System.out.println("Comença com letra A");
}System.out.println(nome.charAt(0));
System.out.println("tamanho do texto "+nome.length());
	}

}
