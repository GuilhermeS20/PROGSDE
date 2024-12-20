package desafio;

import java.util.Scanner;

public class SistemLivro {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		Livro l1 = new Livro ();
		
		System.out.print("TÍTULO: ");	
		l1.setTitulo(leitor.nextLine());
		System.out.print("AUTOR: ");
		l1.setAutor(leitor.nextLine());
		System.out.print("ANO DE PUBLICAÇÃO: ");
		l1.setanoPublicacao(leitor.nextInt());
		
		System.out.println(l1.mostrarInformacoes());
		l1.verificarLivroAntigo();

	}

}
