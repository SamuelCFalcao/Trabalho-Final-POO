public class Doce {   
    public String sabor;
    
    public void removerProduto(String nome){
        Estoque.removerProduto(nome);
    }

    public void calculaVolume(float peso) { 
        System.out.println(peso + "g");
    }
}