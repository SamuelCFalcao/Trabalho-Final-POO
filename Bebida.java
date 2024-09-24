public class Bebida extends Produto{

    public void removerProduto(String nome){
        Estoque.removerProduto(nome);
    }
    @Override
    public void calculaVolume(float peso) {
        if(peso >= 1000) {
            peso = peso/1000;
            System.out.println(peso + "L");
        } 
        else {
            System.out.println(peso + " mL");
        }
    }
}
