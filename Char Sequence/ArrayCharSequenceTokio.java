public class ArrayCharSequenceTokio implements CharSequenceTokio {

    private char[] sequencia;

    public ArrayCharSequenceTokio(char[] sequencia) {
        this.sequencia = sequencia;
    }
    @Override
    public int length() {
        return sequencia.length;
    }
    @Override
    public char charAt(int index) {
        if (index < 0 || index >= length())
            return '0';
        else
            return sequencia[index];
    }
    @Override
    public CharSequenceTokio subSequence(int start, int end) {
        if (start < 0 || start >= length())
            return null;
        if (end < 0 || end >= length())
            return null;
        if (start > end)
            return null;
        if (start == end) {
            return new ArrayCharSequenceTokio(new char[0]);
        }
        char[] subSequencia = new char[(end+1) - start];
        for (int i = start; i < end; i++)
            subSequencia[i] = sequencia[i+1];

        return new ArrayCharSequenceTokio(subSequencia);
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for (char caracter:sequencia) {
            str.append(caracter);
        }
        return str.toString();
    }
}
