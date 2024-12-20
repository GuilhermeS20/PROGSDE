package main;

import java.util.Scanner;

public class palindromo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário a palavra
        System.out.print("Digite uma palavra: ");
        String palavra = scanner.nextLine();
        
        // Remove espaços e converte para minúsculas para uma comparação insensível a maiúsculas/minúsculas
        palavra = palavra.replaceAll("\\s", "").toLowerCase();

        // Verifica se a palavra é um palíndromo
        if (ehPalindromo(palavra)) {
            System.out.println("A palavra é um palíndromo.");
        } else {
            System.out.println("A palavra não é um palíndromo.");
        }

        scanner.close();
    }

    // Método para verificar se a palavra é um palíndromo
    public static boolean ehPalindromo(String palavra) {
        int inicio = 0;
        int fim = palavra.length() - 1;

        // Compara os caracteres de ambos os lados da palavra
        while (inicio < fim) {
            if (palavra.charAt(inicio) != palavra.charAt(fim)) {
                return false; // Não é um palíndromo
            }
            inicio++;
            fim--;
        }

        return true; // É um palíndromo
    }
}