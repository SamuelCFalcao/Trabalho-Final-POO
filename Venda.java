public abstract class Venda {
    public static void realizarPedido(int quantidade, String mercadoria) {
        if("Bebida".equals(mercadoria)){
            Estoque.atualizarQuantidade(mercadoria, quantidade);
        }
    }
}