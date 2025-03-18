public class Main {
    public static void main(String[] args) {

        Carro carro = new Carro("2002YXZ", "Fiat", "Uno", 120, 180);
        Carro.Chassis chassis = carro.new Chassis("Carbono", 139.2);
        Carro.Roda[] rodas = new Carro.Roda[] {
                //Rodas Dianteiras
                carro.new Roda(145, "Seco", "Goodyear", "Eco Control"),
                carro.new Roda(145, "Seco", "Goodyear", "Eco Control"),
                //Rodas Traseiras
                carro.new Roda(155, "Seco", "Goodyear", "Sport"),
                carro.new Roda(155, "Seco", "Goodyear", "Sport")
        };
        System.out.println(carro);
        System.out.println(chassis);
        System.out.println(rodas[0]);
        System.out.println(rodas[1]);
        System.out.println(rodas[2]);
        System.out.println(rodas[3]);
    }
}