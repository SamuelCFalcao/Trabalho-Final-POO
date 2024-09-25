public class Atendente {
    private final String nome;
    private final String cargo;

    public Atendente(String nome, String cargo) {
        this.nome = nome;
        this.cargo = cargo;
    }

    public void receberPedido(int quantidade, String mercadoria) {
        System.out.println("Pedido recebido pelo " + cargo+", " + nome);
        Venda.realizarPedido(quantidade, mercadoria);
    }
}
