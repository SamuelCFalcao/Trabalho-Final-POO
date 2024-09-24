import java.util.ArrayList;
import java.util.List;

public abstract class Estoque{
    //Variável interna para ter uma lista de produtos
    private static List<Produto> produtos = new ArrayList<>();
	
	public static void create(Produto p) {
        this.produtos.add(p);
	}

	public static void read() {
        //Lista todos os produtos
		for (Produto p: this.produtos) {
			System.out.println(p);
		}
	}
	
	public static void update(String nome, int qtdComprada) {
		int qtdFinal;
		for (Produto p: this.produtos) {
			if (p.getNome() == nome) {
				qtdFinal = p.getQuantidade(); - qtdaComprada;
				if (qtdFinal <= 0){
					produtos.removeIf(p -> p.getNome() == nome);
				}
				else{
					p.setQuantidade(qtdFinal);
				}
				break;
			}
		}
	}
}