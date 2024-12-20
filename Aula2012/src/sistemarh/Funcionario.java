package sistemarh;

public class Funcionario extends Pessoa {
	
	private double salario;
	private String cargo;
	
	public Funcionario(String nome, String dataDeNascimento, String cpf, double peso, double altura, double salario, String cargo) {
		super(nome, dataDeNascimento, cpf, peso, altura);
		this.salario = salario;
		this.cargo = cargo;
	}
	
	public double getsalario () {
		return salario;
	}
	
	public void setsalario(double salario) {
		this.salario = salario;
	}
	
	public String getcargo() {
		return cargo;
	}
	
	public void setcargo(String cargo) {
		this.cargo = cargo;
	}
		
	public void mostrarCliente () {
		mostrarInformacoes();
		System.out.println("Cargo: " + this.cargo);
		System.out.println("Salário: " + this.salario);
	}
	
	
	

}
