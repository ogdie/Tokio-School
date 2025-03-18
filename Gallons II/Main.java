public class Main {
    public static void main(String[] args) {
        double polegadas, metros;
        int contador = 0;
        System.out.println("*** TABELA DE CONVERSAO (pol/m) ***");
        for (polegadas = 1; polegadas <= 144; polegadas++){
            metros = polegadas / 39.37;
            System.out.println(polegadas + " polegadas sao " + metros + " metros.");
            contador++;
            if (contador == 12){
                System.out.println();
                contador = 0;
            }
        }
    }
}