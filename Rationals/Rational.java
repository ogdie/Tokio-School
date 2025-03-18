public class Rational {
    int num, den;
    Rational(){}
    Rational(int x, int y) {
        num = x;
        den = y;
    }
    Rational soma(Rational aux) {
        Rational temp = new Rational();
        temp.num = ((num * aux.den) + (den * aux.num));
        temp.den = den * aux.den;
        return temp;
    }
    Rational subtracao(Rational aux) {
        Rational temp = new Rational();
        temp.num = ((num * aux.den) - (den * aux.num));
        temp.den = den * aux.den;
        return temp;
    }
    Rational multiplicacao(Rational aux) {
        Rational temp = new Rational();
        temp.num = num * aux.num;
        temp.den = den * aux.den;
        return temp;
    }
    Rational divisao(Rational aux) {
        Rational temp = new Rational();
        temp.num = num * aux.den;
        temp.den = den * aux.num;
        return temp;
    }
    void imprimir() {
        System.out.println(num + "/" + den);
    }
}
