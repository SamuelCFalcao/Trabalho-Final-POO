// public class Bebida extends Produto {
//     //Define se é uma bebida quente ou fria
//     private boolean quente;

//     //Sobrescreve método de Produto para mostrar em mL
//     @Override
//     public void calculavolume(float volume) {
//         //Considerando a entrada como em mL
//         //Se o volume for maior ou igual a 1000 mL
//         if (volume >= 1000){
//             volume = volume/1000;
//             System.out.println(volume+"L");
//         }
//         else{
//             System.out.println(volume+"mL");
//         }
//     }
// }
public class Bebida extends Produto{
    @Override
    public setNome(String nome){
        this.nome = nome;
    }

    public void removerProduto(String nome){
        Estoque.removerProduto(nome);
    }

    public void calculaVolume(float volume) {
        if(volume >= 1000) {
            volume = volume/1000;
            System.out.println(volume + "L");
        } else {
            System.out.println(volume + " mL");
    }
}
