public class Matrizes {
    static double mediaArray(double[] valores){
        double TotalSum = 0;
        for (int i = 0; i < valores.length; i++) {
            TotalSum = TotalSum + valores[i];
        }
        return (TotalSum / valores.length);
    }
    static int[] minMax(int[] numeros) {
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
        }
        for (int j = 0; j < numeros.length; j++) {
            if (numeros[j] < menor) {
                menor = numeros[j];
            }
        }
        System.out.println("O maior e " + maior + " e o menor e " + menor);
        return numeros;
    }
}
