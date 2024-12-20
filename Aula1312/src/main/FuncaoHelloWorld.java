package main;

import java.util.ArrayList;
import java.util.Scanner;

public class FuncaoHelloWorld {
	public static int somar(int n1, int n2) {
		return  n1+ n2;
		
	}
	public static void main(String[] args) {
//		int resultado = somar(10, 20);
//		System.out.println("O resultado da soma é: " +resultado);
//		numeros(50, 60);
//		
//		String nome;
//		Scanner leitor = new Scanner (System.in);
//		System.out.print("Digite seu nome: ");
//		nome = leitor.nextLine();
//		VerificarIniciaVolgalOuConsoante(nome);
		adicionarPessoas();
	}
	
	public static boolean ehPar (int numero ) {
		if (numero %2 == 0) {
			return true;
		}else {
			return false;
		}
		
	}
	
	public static void numeros (int num1, int num2) {
		for (int i = num1;  i <= num2; i++){
			if (num2 >60) {
				break;
			}
			System.out.println(i);
			
			
			
		}
	}
	
	public static void VerificarIniciaVolgalOuConsoante(String palavra) {
		char primeiraLetra = Character.toLowerCase(palavra.charAt(0));
		
		if (primeiraLetra == 'a' || primeiraLetra == 'e' || primeiraLetra == 'i' || primeiraLetra == 'o' || primeiraLetra == 'u') {
			System.out.println("Essa palavra começa com vogal");
		}else  {
			System.out.println("Inicia com consoante");
		}
		
		}
	
	public static void adicionarPessoas () {
		
		ArrayList<String> listaDePessoas = new ArrayList<>();
		Scanner sc = new Scanner (System.in);
		String nome;
	
		
		System.out.println("Digite o nome das pessoas para adicionar a lista");
		
		
		while(true) {
			
			System.out.print("Digite seu  nome");
			nome = sc.nextLine();
			
			
			if (nome.equalsIgnoreCase("Sair")) {
				break;
			}else {
				listaDePessoas.add(nome);
			}
			
			
			
			
		}
		System.out.println("Lista de pessoas adicionadas: " +listaDePessoas);
		
		
	}
	


}
