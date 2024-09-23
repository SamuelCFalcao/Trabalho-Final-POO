public class Atendente {
    private final String nome;
    private final int cpf;

    public Atendente(String nome, int cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public void receberPedido(Venda venda) {
        System.out.println("Pedido recebido pelo atendente " + nome + cpf);
        venda.realizarPedido(1);
    }
}
