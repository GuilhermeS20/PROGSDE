package desafio;

public class Livro {
	
	private String titulo;
	private String autor;
	private int anoPublicacao;
	
	public Livro() {}
	
	public Livro(String titulo, String autor, int anoPublicacao) {
		
		this.titulo = titulo;
		this.autor = autor;
		this.anoPublicacao = anoPublicacao;
		
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getAutor() {
		return autor;
	}
	
	public void setAutor(String autor){
		this.autor = autor;
	}
	
	public int anoPublicacao(){
		return anoPublicacao;
	}
	
	public void setanoPublicacao(int anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}
	
	public String mostrarInformacoes() {
		System.out.println("----------------------------");
		
		return "Titulo: "+titulo+"\nAutor: "+autor+"\nAno De Publicação: "+anoPublicacao;
	}
	
	public void verificarLivroAntigo () {
		int anoAtual = 2024;
		int resultado = anoAtual - anoPublicacao;
		
		if (resultado > 50 ) {
			System.out.print("Esse livro tem mais de 50 anos");

		}
		else {
			System.out.print("Esse livro tem "+resultado+" anos");
			
		}
			}
	
}


