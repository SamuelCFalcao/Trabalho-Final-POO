import java.util.ArrayList;
import java.util.List;

public abstract class Estoque {
    //Variável interna para ter uma lista de produtos
    private static List<Produto> produtos = new ArrayList<>();

	//Adiciona um produto novo ao estoque
	public static void adicionarProduto(Produto produto) {
		produtos.add(produto);
		System.out.println("Adicionadas "+produto.getQuantidade()+" unidades de "+produto.getNome());
	}

	//Lista todos os produtos no estoque
	public static void listarProdutos() {
		for (Produto produto: produtos) {
			System.out.println(produto);
		}
	}

	//Atualizar quantidade de produtos no estoque
	public static void atualizarQuantidade(String nome, int qtdComprada) {
		//Variável que verifica se o produto existe no estoque
		boolean disponivel = false;
		int qtdFinal = 0;
        for (Produto produto : produtos) {
            if (produto.getNome().equalsIgnoreCase(nome)) {
				qtdFinal = produto.getQuantidade() - qtdComprada;
				//Valida se há suficiente no estoque
				if (qtdFinal < 0){
					qtdComprada = qtdComprada + qtdFinal; //Resulta na diferença
					qtdFinal = 0;
					System.out.println("Não há "+nome+" suficiente no estoque, compradas apenas "+qtdComprada+" unidades");
				}
                produto.setQuantidade(qtdFinal);
                System.out.println("Quantidade do produto " + nome + " no estoque atualizada para " + qtdFinal+" unidades");
				disponivel = true;
            }
        }
		if(!disponivel){
			System.out.println("Produto não encontrado");
		}
    }
	
	//Remove um produto do estoque
	public static void removerProduto(String nome) {
		boolean deletado = false;
		for(Produto produto : produtos) {
			if(produto.getNome().equalsIgnoreCase(nome)) {
				produtos.remove(produto);
				System.out.println(nome + " foi removido do estoque");
				deletado = true;
			} 
		}
		if(!deletado){
			System.out.println("Produto não encontrado");
		}
	}
}

