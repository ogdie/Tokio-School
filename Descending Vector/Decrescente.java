public class Decrescente {
    static void descrescer(int[] valores) {
        for (int i = 1; i < valores.length; i++) {
            for (int j = 0; j < i; j++) {
                if (valores[i] > valores[j]) {
                    int temp = valores[i];
                    valores[i] = valores[j];
                    valores[j] = temp;
                }
            }
        }
    }
}
