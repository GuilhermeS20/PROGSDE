package sistemarh;

public class Funcionarios {

	public String nome;
	public String cargo;
	public double salario;
	public String departamento;
	
	public Funcionarios(String nome, String cargo, double salario, String departamento) {
		
		this.nome = nome;
		this.cargo = cargo;
		this.salario = salario;
		this.departamento = departamento;
		
		
	}
	
	public void mostrarInformacoes() {
		
		System.out.println("Nome: "+this.nome);
		System.out.println("Cargo: "+this.cargo);
		System.out.println("Salario: "+this.salario);
		System.out.println("Departamento: "+this.departamento);

	}

	}

