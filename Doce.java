public class Doce extends Produto{   
    public String sabor;
    
    public void removerProduto(String nome){
        Estoque.removerProduto(nome);
    }
    @Override
    public void calculaVolume(float peso) { 
        System.out.println(peso + "g");
    }
}