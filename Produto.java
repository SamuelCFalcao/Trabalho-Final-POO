public abstract class Produto {
    public string nome;
    protected float preco;
    private int quantidadeEstoque;
    static float desconto;

    public float calcularPrecoFinal() {
        this.preco = preco;
        this.desconto = desconto;

        return(preco * desconto);
    }

    static void setDesconto(float valor) {
    }
}