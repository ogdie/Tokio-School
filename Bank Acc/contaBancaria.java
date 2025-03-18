public class contaBancaria {
    private int numeroConta;
    private String nomeTitular;
    private double saldo;

    public int getNumeroConta() {
        return numeroConta;
    }
    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }
    public String getNomeTitular() {
        return nomeTitular;
    }
    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public String toString(){
        String s = "";
        s += "Nome do Cliente: " + nomeTitular;
        s += " / Numero da conta: " + numeroConta;
        s += " / Saldo da conta: " + saldo;
        return s;
    }
    public void depositar(double valor){
        saldo += valor;
    }
    public boolean levantar(double valor){
        if ((saldo - valor) >= 0){
            saldo -= valor;
            return true;
        }
        return false;
    }
}
