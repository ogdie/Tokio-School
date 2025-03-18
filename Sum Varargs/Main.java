public class Main {
    static int somaVarargs(Integer... vetor){
        int total = 0;
        for (int i = 0; i < vetor.length; i++){
            total += vetor[i];
        }
        return total;
    }
    public static void main(String[] args) {

        System.out.println("Total: " + somaVarargs(1,2,3,4,5,6,7,8,9,10));
    }
}