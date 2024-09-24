public class Salgado {
    public String sabor;
    public boolean fritura;

    public void removerProduto(String nome){
        Estoque.removerProduto(nome);
    }

    public void calculaVolume(float peso) {
        if(peso >= 1000) {
            peso = peso/1000;
            System.out.println(peso + " kg");
        } else {
            System.out.println(peso + " mg");
        }
    }
}
