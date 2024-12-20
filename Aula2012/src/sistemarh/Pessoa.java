package sistemarh;

public class Pessoa {
	
	private String nome;
	private String dataDeNascimento;
	private String cpf;
	private double peso;
	private double altura;
	
	public Pessoa(String nome, String dataDeNascimento, String cpf, double peso, double altura) {
		
		this.nome = nome;
		this.dataDeNascimento = dataDeNascimento;
		this.cpf = cpf;
		this.peso = peso;
		this.altura = altura;
		
		}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		
	}
	
	public String getdataDeNascimento() {
		return dataDeNascimento;
	}
	
	public void setdataDeNascimento(String dataDeNascimento) {
		
	}
	
	public String getcpf() {
		return cpf;
	}
	
	public void setcpf(String cpf) {
		
	}
	
	public double getpeso() {
		return peso;
	}
	
	public void setpeso(double peso) {
		
	}
	
	public double altura() {
		return altura;
	}
	
	public void setaltura(double altura) {
		
	}
	
	
	public void mostrarInformacoes () {
		System.out.println("####Informações Pessoais####");
		System.out.println("Nome: " + this.nome);
		System.out.println("Data De Nascimento: " + this.dataDeNascimento);
		System.out.println("CPF: " + this.cpf);
		System.out.println("Peso: " + this.peso);
		System.out.println("Altura: " + this.altura);
	}

}
