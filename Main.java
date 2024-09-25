public class Main {
	public static void main(String[] args) {
	int bebidaComprada = 4;
	int bombomComprado = 10;
	int salgadoComprado = 2;
	Atendente fulano = new Atendente("Gustavo", "caixa");	
	
	Salgado coxinha = new Salgado();
	coxinha.setNome("Coxinha");
	coxinha.setPreco((float)5);
	coxinha.setQuantidade(20);
	Estoque.adicionarProduto(coxinha);
	
	Doce bombom = new Doce();
	bombom.setNome("Bombom");
	bombom.setQuantidade(100);
	bombom.setPreco((float)1.50);
	Estoque.adicionarProduto(bombom);

	Bebida coca = new Bebida();
	coca.setQuantidade(50);
	coca.setNome("Coca");
	coca.setPreco((float) 4.50);
	Estoque.adicionarProduto(coca);
	
	fulano.receberPedido(bebidaComprada, coca.getNome());
	System.out.println(	Venda.totalPagar(bebidaComprada, coca.getPreco()));

	fulano.receberPedido(bombomComprado, bombom.getNome());
	System.out.println(	Venda.totalPagar(bombomComprado, bombom.getPreco()));

	fulano.receberPedido(salgadoComprado, coxinha.getNome());
	System.out.println(	Venda.totalPagar(salgadoComprado, coca.getPreco()));

	}
}