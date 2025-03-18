public class Main {
    public static void main(String[] args) {
        
        int numMax = 100;
        boolean ePrimo = true;
        String numerosPrimos = "";

        for (int i = 2; i <= numMax; i++){
            ePrimo = validarPrimo(i);
            if (ePrimo){
                numerosPrimos = numerosPrimos + i + " ";
            }
        }
        System.out.println("Os numeros primos de 2 à 100, sao:");
        System.out.println(numerosPrimos);
    }
    public static boolean validarPrimo (int numVerificar){
        int resto;
        for (int i = 2; i <= (numVerificar/2); i++){
            resto = numVerificar % i;
            if (resto == 0){
                return false;
            }
        }
        return true;
    }
    }
