import java.util.Arrays;

public class Main extends Matrizes {
    public static void main(String[] args) {

        double[] valores = new double[5];
        valores[0] = 1;
        valores[1] = 2;
        valores[2] = 3;
        valores[3] = 4;
        valores[4] = 5;

        int[] numeros = new int[5];
        numeros[0] = 1;
        numeros[1] = 20;
        numeros[2] = 30;
        numeros[3] = 60;
        numeros[4] = 100;

        System.out.println(Arrays.toString(valores));
        System.out.println("A media do Array e: " + mediaArray(valores));
        System.out.println();
        System.out.println(Arrays.toString(minMax(numeros)));
    }
}