public abstract class Produto {
    public String nome;
    protected float preco;

    public String setNome(String nome) {
        this.nome = nome;
    }

    public void getNome() {
        return nome;
    }

    public float setPreco(float preco) {
        this.preco = preco;
    }

    public void getPreco() {
        return preco;
    }
}