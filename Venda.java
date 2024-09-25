public abstract class Venda {
    public static void realizarPedido(int quantidade, String mercadoria) {
        Estoque.atualizarQuantidade(mercadoria, quantidade);
    }
    
    public static float totalPagar(int quantidade, float preco){
        float quant = (float) quantidade;
        return quant*preco;
    }
}