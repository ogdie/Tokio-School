public class Main extends Decrescente{

    public static void main(String[] args) {

        int[] valores = new int[5];
        valores[0] = 23;
        valores[1] = 65;
        valores[2] = 2;
        valores[3] = 87;
        valores[4] = 34;

        System.out.println("Array antes da ordenação: ");
        for (int i = 0; i < valores.length; i++) {
            System.out.print(valores[i] + " ");
        }
        descrescer(valores);
        System.out.println();
        System.out.println("Array depois da ordenação decrescente: ");
        for (int i = 0; i < valores.length; i++) {
            System.out.print(valores[i] + " ");
        }
    }
}