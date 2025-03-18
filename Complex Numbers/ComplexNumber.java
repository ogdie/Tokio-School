public class ComplexNumber {
    int real, imaginario;
    public ComplexNumber() {}
    public ComplexNumber(int real, int imaginario) {
        this.real = real;
        this.imaginario = imaginario;
    }
    ComplexNumber addComplex(ComplexNumber c1, ComplexNumber c2) {
        ComplexNumber compTemp = new ComplexNumber();
        compTemp.real = c1.real + c2.real;
        compTemp.imaginario = c1.imaginario + c2.imaginario;
        return compTemp;
    }
    ComplexNumber subComplex(ComplexNumber c1, ComplexNumber c2) {
        ComplexNumber compTemp = new ComplexNumber();
        compTemp.real = c1.real - c2.real;
        compTemp.imaginario = c1.imaginario - c2.imaginario;
        return compTemp;
    }
    void imprimirComplexNumber() {
        System.out.println("Número Complexo: " + real + " + " + imaginario + "i");
    }
}
