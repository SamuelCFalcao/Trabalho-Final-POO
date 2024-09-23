import java.util.ArrayList;
import java.util.List;

public abstract class Estoque{
	//Variável de Scanner para ler inputs
	//private static Scanner scanner = new Scanner(System.in);

    //Variável interna para ter uma lista de produtos
    private static List<Produto> produtos = new ArrayList<>();
	
	public static void create(int a) {
        //Verifica se é Salgado, Bebida ou Bombom
        if (a == 1){
            Salgado produto = new Salgado();
        }
        else if (a == 2){
            Bebida produto = new Bebida();
        }
        else if (a == 3){
            Bombom produto = new Bombom();
        }

        produto.setId();
        produto.setNome();
        produto.setPreco();

		//Adiciona o produto à lista
        this.produtos.add(produto);

		System.out.println("Usuário inserido! Voltando ao menu!");
	}

	public static void read() {
        //Lista todos os produtos
		for (Produto p: this.produtos) {
			System.out.println(p);
		}
	}
	
	public static void update(int produtovendido) {
        int a = produtovendido ;
        //Verifica se é Salgado, Bebida ou Bombom
        if (a == 1){
            Lanche produto = new Lanche();
        }
        else if (a == 2){
            Bebida produto = new Bebida();
        }
        else if (a == 3){
            Bombom produto = new Bombom();
        }

        System.out.println("Forneça o ID do usuário a ser modificado: ");
		String id = scanner.next();
		int idInteiro = Integer.parseInt(id);
		
		System.out.println("Qual o novo nome? ");
		String nome = scanner.next();

        System.out.println("Qual preço? ");
		String preco = scanner.next();

        //Variável que irá checar se aquele ID pertence a algum usuário existente
		boolean noID = true;

        for (Produto p: this.produtos) {
		    if (p.getId() == idInteiro) {
                p.setNome(nome);
                p.setPreco(preco);
                noID = false;
                break;
            }
		}
	    
		//Caso não existe nenhum usuário com o ID
		if(noID) {
			System.out.println("Nenhum usuário encontrado com este ID!");
		}
        
		//Caso exista um usuário com o ID
		else {
			System.out.println("Usuário atualizado! Voltando ao menu!");
		}
	}

	public static void delete() {	
		System.out.println("Forneça o ID do usuário a ser modificado: ");
		String id = scanner.next();
		int idInteiro = Integer.parseInt(id);
		
		
		//Verifica se existe um usuário com aquele ID, se houver, remove
		produtos.removeIf(p -> p.getId() == idInteiro);

		System.out.println("Usuário removido! Voltando ao menu!");
	}
}
