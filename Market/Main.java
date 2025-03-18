import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        List<Mercado> list = new ArrayList<Mercado>();

        Clientes cliente1 = new Clientes("Diego", "Monteiro", "123654", "Vereda Lameiro",
                "934756543", "1021");
        Clientes cliente2 = new Clientes("Bruna", "Menezes", "321432", "Alameda das Arvores",
                "932344321", "9827");
        FuncionariosRepositores funErep1 = new FuncionariosRepositores("Joao", "Moreira", "543678",
                "Rua das Aguas", "923234543", 987654, 800, "Manhã");
        FuncionariosRepositores funErep2 = new FuncionariosRepositores("Mario", "Neves", "789654", "Rua Real",
                "913432123", 765789, 900, "Tarde");
        FuncionariosRepositores funErep3 = new FuncionariosRepositores("Josué", "Matos", "873421", "Rua Falafel",
                "924567868", 827321, 900, "Noite");
        Subcontratados subCon1 = new Subcontratados("Rafael", "José", "876567", "Rua Brasil",
                "913456543", 876567, 800, "Noite", "Talho");
        Subcontratados subCon2 = new Subcontratados("Maria", "das Dores", "276543", "Rua Leão",
                "924343234", 876589, 800, "Tarde", "Caixa");
        Subcontratados subCon3 = new Subcontratados("Celeste", "Monjardin", "234321", "Rua das Flores",
                "92345635", 876132, 800, "Tarde", "Frutaria");
        Subcontratados subCon4 = new Subcontratados("Marcos", "Ferreira", "125009", "Rua do Carvão",
                "912543210", 900980, 900, "Manhã", "Limpeza");

        list.add(cliente1);
        list.add(cliente2);
        list.add(funErep1);
        list.add(funErep2);
        list.add(funErep3);
        list.add(subCon1);
        list.add(subCon2);
        list.add(subCon3);
        list.add(subCon4);

        boolean rodando = true;
        while (rodando) {
            System.out.println("=== BEM VINDO AO BANCO DE DADOS DO MERCADO ===");
            System.out.println("1) Cliente\n2) Funcionario\n3) Sair");
            int opcao = scan.nextInt();
            switch (opcao) {
                case 1:
                    do {
                        int qtdCompras = 0;
                        System.out.println("Deseja efetuar uma compra?");
                        System.out.println("1) Sim\n2) Não");
                        opcao = scan.nextInt();

                            if (opcao == 1) {
                                for (int i = 0; i < 100; i++) {
                                System.out.println("Compra efetuada com sucesso.");
                                qtdCompras++;
                                System.out.println("Você tem " + qtdCompras + " compras realizadas.");
                                if (qtdCompras == 100) {
                                    System.out.println("Parabéns, ganhou 1% de desconto");
                                } else {
                                    System.out.println("Você ainda não tem direito ao desconto");
                                }
                            }
                        } else {
                                System.out.println("Você não comprou nada.");
                            }
                        } while (opcao == 1);
                    break;
                case 2:
                    for (Mercado lt : list) {
                        System.out.println(lt.funcionariosMercado());
                    }
                    System.out.println();
                    System.out.println("======>");
                    System.out.println("O Funcionário " + funErep3.getNome() + " " + funErep3.getSobrenome() +
                            "\nNum ID: " + funErep3.getNumId() + "\nTurno: " + funErep3.getTurno() + "\nTem direito ao" +
                            " adicional noturno." + "\nNovo salario: " + funErep3.obterAdicional());
                    System.out.println("======>");
                    System.out.println("O Funcionário " + subCon1.getNome() + " " + subCon1.getSobrenome() +
                            "\nNum ID: " + subCon1.getNumId() + "\nTurno: " + subCon1.getTurno() + "\nTem direito ao" +
                            " adicional noturno." + "\nNovo salario: " + subCon1.obterAdicional());
                    System.out.println();
                    break;
                case 3:
                    rodando = false;
                    break;
            }
        }
    }
}