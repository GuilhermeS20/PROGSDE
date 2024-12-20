package sistemarh;

import java.util.ArrayList;
import java.util.Scanner;

public class SistemaRH {

	public static void main(String[] args) {
		ArrayList<Funcionarios> func = new ArrayList<Funcionarios>();
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("CADASTRO DE FUNCIONÁRIOS");
		
		while(true) {
		
			System.out.println("Digite seu nome: ");
			String nome = leitor.nextLine();
			
			System.out.println("Digite sseu cargo: ");
			String cargo = leitor.nextLine();
			
			System.out.println("Digite seu salário: ");
			double salario = Double.parseDouble(leitor.nextLine());
			
			System.out.println("Digite seu departamento: ");
			String departamento = leitor.nextLine();
			
			Funcionarios novoFuncionario = new Funcionarios(nome, cargo, salario, departamento);
			
			func.add(novoFuncionario);
			
			System.out.println("DESEJA CONTINUAR CADASTRANDO? S/N");
			String resposta = leitor.nextLine();
			
			if(resposta.equalsIgnoreCase("N")) {
				break;
			}
			
		
		for (int i = 0; i < func.size(); i++ ) {
			func.get(i).mostrarInformacoes();
			
		}

		

	}

}
	
}
