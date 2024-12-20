package main;

//import java.awt.image.ReplicateScaleFilter;
import java.util.Scanner;

public class execicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
	        
	        // Solicita ao usuário a palavra
	        System.out.print("Digite uma palavra: ");
	        String palavra = scanner.nextLine();
	        
	        // Solicita o caractere que deseja trocar
	        System.out.print("Digite o caractere a ser substituído: ");
	        char caractereAntigo = scanner.next().charAt(0);
	        
	        // Solicita o novo caractere
	        System.out.print("Digite o novo caractere: ");
	        char caractereNovo = scanner.next().charAt(0);
	        
	        // Substitui o caractere
	        String novaPalavra = palavra.replace(caractereAntigo, caractereNovo);
	        
	        // Exibe a nova palavra
	        System.out.println("Nova palavra: " + novaPalavra);
	        
	        scanner.close();
	        palavra.replace(caractereAntigo, caractereNovo);
	        //System.out.println(palavra.replace('a','o'));
	    }
	}


