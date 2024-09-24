public class Salgado {
    public String sabor;
    public boolean fritura;

    public void removerProduto(int quantidade){
        Estoque.removerProduto(quantidade);
    }

    public void calculaPeso(float peso) {
        if(peso >= 1000) {
            peso = peso/1000;
            System.out.println(peso + " kg");
        } else {
            System.out.println(peso + " mg");
        }
    }
}
