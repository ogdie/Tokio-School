import java.util.Arrays;

public class Carro {

    private String matricula;
    private String marca;
    private String modelo;
    private int potencia;
    private int velocidadeMax;
    private Chassis chassis;
    private Roda[] rodas;

    public Carro(String matricula, String marca, String modelo, int potencia, int velocidadeMax) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.potencia = potencia;
        this.velocidadeMax = velocidadeMax;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getVelocidadeMax() {
        return velocidadeMax;
    }

    public void setVelocidadeMax(int velocidadeMax) {
        this.velocidadeMax = velocidadeMax;
    }

    public class Chassis {

        private String material;
        private double peso;

        public Chassis(String material, double peso) {
            this.material = material;
            this.peso = peso;
        }

        public String getMaterial() {
            return material;
        }

        public void setMaterial(String material) {
            this.material = material;
        }

        public double getPeso() {
            return peso;
        }

        public void setPeso(double peso) {
            this.peso = peso;
        }

        @Override
        public String toString() {
            return "==> Chassis" +
                    "\n Material: " + material +
                    "\n Peso: " + peso + "g";
        }
    }
    public class Roda {

        private int medida;
        private String tipo;
        private String marca;
        private String modelo;

        public Roda(int medida, String tipo, String marca, String modelo) {
            this.medida = medida;
            this.tipo = tipo;
            this.marca = marca;
            this.modelo = modelo;
        }

        public int getMedida() {
            return medida;
        }

        public void setMedida(int medida) {
            this.medida = medida;
        }

        public String getTipo() {
            return tipo;
        }

        public void setTipo(String tipo) {
            this.tipo = tipo;
        }

        public String getMarca() {
            return marca;
        }

        public void setMarca(String marca) {
            this.marca = marca;
        }

        public String getModelo() {
            return modelo;
        }

        public void setModelo(String modelo) {
            this.modelo = modelo;
        }

        @Override
        public String toString() {
            return "==> Roda" +
                    "\n Medida: " + medida +
                    "\n Tipo: " + tipo +
                    "\n Marca: " + marca +
                    "\n Modelo: " + modelo;
        }
    }

    @Override
    public String toString() {
        return "==> Carro" +
                "\n Matricula: " + matricula +
                "\n Marca: " + marca +
                "\n Modelo: " + modelo +
                "\n Potencia: " + potencia +"cv" +
                "\n VelocidadeMax: " + velocidadeMax +"km";
    }
}
