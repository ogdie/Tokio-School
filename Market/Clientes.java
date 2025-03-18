public class Clientes extends Mercado {
    private String codCliente;
    public Clientes() {
    }
    public Clientes(String nome, String sobrenome, String numId, String morada, String telefone, String codCliente) {
        super(nome, sobrenome, numId, morada, telefone);
        this.codCliente = codCliente;
    }
    public String getCodCliente() {
        return codCliente;
    }
    public void setCodCliente(String codCliente) {
        this.codCliente = codCliente;
    }
    public static void realizarCompra() {
        int numCompras = 0;
        System.out.println("Deseja efetuar uma compra?");
        System.out.println("1) Sim \n2)Nao");
        int opcao = Main.scan.nextInt();
        if (opcao == 1) {
            System.out.println("Compra efetuada com sucesso");
            numCompras++;
        } else {
            System.out.println("Você não comprou nada.");
        }
        if (numCompras == 100) {
            System.out.println("Parabéns, ganhou 1% de desconto");
        } else {
            System.out.println("Você ainda não tem direito ao desconto");
        }
    }
    @Override
    public String funcionariosMercado() {
        return "";
    }
}
