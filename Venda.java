public class Venda {
    public void realizarPedido(int quantidade, Produto produto) {
        if (produto != null) {
            produto.removerEstoque(quantidade);
            System.out.println("Pedido realizado: " + quantidade + " unidades de" + produto.getNome());
        } else {
            System.out.println("Produto inválido.");
        }
    }
}