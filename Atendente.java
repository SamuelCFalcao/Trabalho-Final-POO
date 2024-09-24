// public class Atendente {
//     private final String nome;
//     private final int cpf;

//     public Atendente(String nome, int cpf) {
//         this.nome = nome;
//         this.cpf = cpf;
//     }

//     public void receberPedido(Venda venda) {
//         System.out.println("Pedido recebido pelo atendente " + nome + cpf);
//         venda.realizarPedido(1,Bebida);
//     }
// }
public class Atendente {
    private final String nome;
    private final String cpf;

    public Atendente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public void receberPedido(Venda venda, Produto produto) {
        // Exibe o nome do atendente e o CPF
        System.out.println("Pedido recebido pelo atendente " + nome + " (CPF: " + formatarCPF(cpf) + ")");
        // Chama o método de venda com um produto específico
        venda.realizarPedido(1, produto);
    }

    // private String formatarCPF(String cpf) {
    //     if (cpf.length() == 11) {
    //         return cpf.substring(0, 3) + "." + cpf.substring(3, 6) + "." + cpf.substring(6, 9) + "-" + cpf.substring(9);
    //     }
    //     return cpf;
    // }
}
