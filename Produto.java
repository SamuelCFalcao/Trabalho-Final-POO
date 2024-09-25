public abstract class Produto {
    protected String nome;
    protected float preco;
    private int quantidade;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public float getPreco() {
        return preco;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public abstract void calculaVolume(float peso); 
}