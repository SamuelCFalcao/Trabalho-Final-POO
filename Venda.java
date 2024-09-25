public abstract class Venda {
    public static void realizarPedido(int quantidade, String mercadoria) {
        if("Coca".equals(mercadoria)){
            Estoque.atualizarQuantidade(mercadoria, quantidade);
        }
        if("Bombom".equals(mercadoria)){
            Estoque.atualizarQuantidade(mercadoria, quantidade);
        }
        if("Coxinha".equals(mercadoria)){
            Estoque.atualizarQuantidade(mercadoria, quantidade);
        }
    }
    
    public static float totalPagar(int quantidade, float preco){
        float quant = (float) quantidade;
        return quant*preco;
    }
}