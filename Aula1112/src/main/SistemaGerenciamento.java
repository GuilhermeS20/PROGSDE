package main;

import java.util.ArrayList;
import java.util.Scanner;

public class SistemaGerenciamento {

	public static void main(String[] args) {
		String opc;
		ArrayList<String> funcionarios = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		String nome = "";
		
		while(true) {
			
			System.out.println("Menu: ");
			System.out.println("1. Inserir Funcionario");
			System.out.println("2. Ver Funcionários ");
			System.out.println("3. Atualizar Funcionário ");
			System.out.println("4. Remover Funcionário ");
			System.out.println("0. Sair ");
			
			System.out.print("\nEscolha uma das opcões: ");
			opc = sc.nextLine();
			
				if(opc.equals("1")) {
					System.out.println("Você escolheu a opção inserir funcionarios. ");
					nome = sc.next();
					funcionarios.add(nome);
				}
				else if(opc.equals("2")) {
					System.out.println("Você escolheu a opção ver funcionários");
					for (int i = 0; i < funcionarios.size();i++) {
					System.out.println( (i+1)+ " . " + funcionarios.get(i));
					
					}
				}
				else if(opc.equals("3")) {
					
					
					System.out.println("Digite o nome do funcionario a ser atualizado");
					
					
					
					
					}
				else if(opc.equals("4")) {
					System.out.println("Você escolheu a opção remover funcionários");
					
				}
				else if (opc.equals("0")) {
						System.out.println("Você saiu..");
						break;
					}
				else {
					System.out.println("Opção invalida");
				}
		
		}
		
	}
			
}

		
		