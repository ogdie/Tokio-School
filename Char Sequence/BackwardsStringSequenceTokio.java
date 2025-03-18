public class BackwardsStringSequenceTokio implements CharSequenceTokio {
    private String cadeia;

    public BackwardsStringSequenceTokio(String cadeia) {
        StringBuilder invertida = new StringBuilder();
        for (int i = cadeia.length()-1; i >= 0; i--)
            invertida.append(cadeia.charAt(i));

        this.cadeia = invertida.toString();
    }

    @Override
    public int length() {
        return cadeia.length();
    }

    @Override
    public char charAt(int index) {
        if (index < 0 || index >= length())
            return '0';
        else
            return cadeia.charAt(index);
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
            return new BackwardsStringSequenceTokio("");
        }
        String subCadeia = "";
        for (int i = end ; i >= start; i--)
            subCadeia += cadeia.charAt(i);

        return new BackwardsStringSequenceTokio(subCadeia);
    }

    @Override
    public String toString() {
        return cadeia;
    }
}

