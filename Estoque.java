import java.util.ArrayList;
import java.util.List;

public abstract class Estoque {
    // Variável interna para ter uma lista de produtos
    private static List<Produto> produtos = new ArrayList<>();

	public void adicionarProduto(Produto produto) {
		produtos.add(produto);
		System.out.println(produto + "adicionado ao estoque.");
	}
	
	// public static void create(Produto p) {
    //     this.produtos.add(p);
	// }

	public static void read() {
        // Lista todos os produtos
		for (Produto p: this.produtos) {
			System.out.println(p);
		}
	}

	public void removerProduto(String nome) {
		for(int i = 0; i < produtos.size(); i++) {
			if(produtos.get(i).getNome().equalIsIgnoreCase(nome)) {
				produtos.remove(i);
				System.out.println(nome + " foi removido do estoque.");
				return;
		} else {
			System.out.println("Produto não encontrado no sistema.");
		}
	}

	public void atualizarQuantidade(String nome, int novaQuantidade) {
        for (Produto produto : produtos) {
            if (produto.nome.equalsIgnoreCase(nome)) {
                produto.setQuantidade(novaQuantidade);
                System.out.println("Quantidade do produto " + nome + " atualizada para " + novaQuantidade);
                return;
            }
        }
        System.out.println("Produto não encontrado.");
    }
	
	// public static void update(String nome, int qtdComprada) {
	// 	int qtdFinal;
	// 	for (Produto p: this.produtos) {
	// 		if (p.getNome() == nome) {
	// 			qtdFinal = p.getQuantidade(); - qtdaComprada;
	// 			if (qtdFinal <= 0){
	// 				produtos.removeIf(p -> p.getNome() == nome);
	// 			}
	// 			else{
	// 				p.setQuantidade(qtdFinal);
	// 			}
	// 			break;
	// 		}
	// 	}
	// }
}