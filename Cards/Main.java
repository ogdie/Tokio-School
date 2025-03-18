public class Main {
    public static void main(String[] args) {

        Baralho baraja = new Baralho();
        Molho molho = baraja.getMolho();
        System.out.println("=== Lista de Cartas ===");
        System.out.println(molho.toString() + "\n");

        molho.setAlgoritmo(new OrdPalNumInc());
        molho.ordena();
        System.out.println("=== ORDENAÇAO: NAIPE + NÚMERO (INCREMENTO) === ");
        System.out.println(molho.toString() + "\n");

        molho.setAlgoritmo(new OrdPalNumDec());
        molho.ordena();
        System.out.println("=== ORDENAÇAO: NAIPE + NÚMERO (DECREMENTO) ===");
        System.out.println(molho.toString() + "\n");

        molho.setAlgoritmo(new OrdNumIncPal());
        molho.ordena();
        System.out.println("=== ORDENAÇAO: NÚMERO + NAIPE (INCREMENTO) ===");
        System.out.println(molho.toString());
    }
}