public abstract class Produto {
    public String nome;
    protected float preco;
    private int quantidade;

    public float setPreco(float preco) {
        this.preco = preco;
    }

    public void getPreco() {
        return preco;
    }

    public int setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void getQuantidade() {
        return quantidade;
    }

    public abstract void calculaPeso();
}