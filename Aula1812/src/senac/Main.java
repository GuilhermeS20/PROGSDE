package senac;

public class Main {

	public static void main(String[] args) {
			Produto p1 = new Produto("Monitor AOC 21", 499.99, 15);
			Produto p2 = new Produto("Mouse", 49.99);
			Produto p3 = new Produto("Teclado", 49.99, 2);
			
			p1.setNome("Monitor");
			p1.setPreco(499.99);
			p1.setQtd (2);
			
			System.out.println(p1.exibirDetalhes()+"\n\n");
			
			p1.setPreco(499.99 * 1.1);
			p1.setQtd(15);
			
			System.out.println(p1.exibirDetalhes()+"\n\n");
			
			ProdutoHigiene ph1 = new ProdutoHigiene();
			ph1.setNome ("Sabonete");
			ph1.setPreco(2.99);
			ph1.setQtd(10);
			
			System.out.print(ph1.exibirDetalhes());
			
			
			
			//getters
			//setters

	}

}
