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

	Bebida bebida = new Bebida();
	bebida.setQuantidade(50);
	bebida.setNome("Coca");
	bebida.setPreco((float) 4.50);
	Estoque.adicionarProduto(bebida);
	
	fulano.receberPedido(bebidaComprada, "Coca");
	System.out.println(	Venda.totalPagar(bebidaComprada, bebida.getPreco()));

	fulano.receberPedido(bombomComprado, "Bombom");
	System.out.println(	Venda.totalPagar(bombomComprado, bombom.getPreco()));

	fulano.receberPedido(salgadoComprado, "Coxinha");
	System.out.println(	Venda.totalPagar(salgadoComprado, bebida.getPreco()));

	}
}