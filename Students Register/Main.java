import java.util.Scanner;

public class Main {

    static Scanner scan = new Scanner(System.in);
    static Aluno[] alunos = new Aluno[3];

    public static class Aluno{
        private String nome;
        private int idade;
        private String curso;
        private String matricula;

        public Aluno(String nome, int idade, String curso, String matricula) {
            this.nome = nome;
            this.idade = idade;
            this.curso = curso;
            this.matricula = matricula;
        }

        public Aluno() { }
    }
    public static void main(String[] args) {
        alunos[0] = new Aluno("Diego", 33, "JAVA OCP", "20230302PT");
        alunos[1] = new Aluno("Raiza", 31, "Direito", "20232702PT");
        alunos[2] = new Aluno("Rodrigo", 20, "Publicidade e Propaganda", "20231005PT");

        int opcao;

        do{
            System.out.println("Escolha a opcao desejada: ");
            System.out.println("1) Consultar Aluno");
            System.out.println("2) Adicionar Aluno");
            opcao = scan.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Informe o nome do aluno: ");
                    String consultar = scan.next();
                    consultarAluno(consultar);
                    break;
                case 2:
                    adicionarAluno();
                    break;
                default:
                    System.out.println("Opcao inválida, tente novamente.");
            }
            System.out.println("Deseja realizar outra operacao? (1 - Sim / 2 - Nao)");
            opcao = scan.nextInt();
        } while (opcao == 1);
    }
    public static void consultarAluno(String nome){
        for (Aluno aluno : alunos){
            if (aluno != null && aluno.nome.equalsIgnoreCase(nome)){
                System.out.print("Nome do aluno: " + aluno.nome);
                System.out.print("Idade do aluno: " + aluno.idade);
                System.out.print("Curso: " + aluno.curso);
                System.out.print("Matricula: " + aluno.matricula);
                return;
            }
        }
        System.out.println("Aluno nao encontrado!");
    }
    public static void adicionarAluno(){
        for (int i = 0; i < alunos.length; i++){
            if (alunos[i] == null){
                System.out.println("Informe os dados para adicionar o aluno:");
                System.out.print("Informe o nome do aluno: ");
                String nome = scan.next();
                System.out.print("Informe a idade do aluno: ");
                int idade = scan.nextInt();
                System.out.println("Informe o curso do aluno: ");
                String curso = scan.next();
                System.out.println("Informe a matricula do aluno: ");
                String matricula = scan.next();

                alunos[i] = new Aluno(nome, idade, curso, matricula);
                System.out.println("Aluno adicionado com sucesso!!");
                return;
            }
        }
        System.out.println("Nao foi possivel adicionar mais alunos, o limite foi atingido!!");
    }
}