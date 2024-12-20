package biblioteca;

public class SistemaBiblioteca {

	public static void main(String[] args) {
		Livro l1 = new Livro("Harry Potter", "J. K. Rowling", "Rocco", 15);
		System.out.println(l1.titulo);
		System.out.println(l1.autor);
		System.out.println(l1.editora);
		System.out.println(l1.estoque);

		
	}

}
