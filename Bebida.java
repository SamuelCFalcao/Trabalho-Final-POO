public class Bebida extends Produto {
    //Define se é uma bebida quente ou fria
    private boolean quente;

    //Sobrescreve método de Produto para mostrar em mL
    @Override
    public void calculaPeso(float peso) {
        //Considerando a entrada como em mL
        //Se o peso for maior ou igual a 1000 mL
        if (peso >= 1000){
            peso = peso/1000;
            System.out.println(peso+"L");
        }
        else{
            System.out.println(peso+"mL");
        }
    }
}
