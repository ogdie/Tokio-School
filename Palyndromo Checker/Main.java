public class Main {
    static boolean isPalindrome(String str) {
        int i = 0;
        int j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "Radar";
        String str2 = "O galo ama o lago";

        str = str.toLowerCase();
        if (isPalindrome(str)){
            System.out.println("Palavra: Radar -> e palindromo!");
            System.out.println(str);
        } else {
            System.out.println("Palavra: Radar -> nao e palindromo!");
            System.out.println(str);
        }
        System.out.println();
        String clean = str2.replaceAll(" ", "").toLowerCase();
        if (isPalindrome(clean)){
            System.out.println("Frase: O galo ama o lago -> e palindromo");
            System.out.println(clean);
        } else {
            System.out.println("Frase: O galo ama o lago -> nao e palindromo");
            System.out.println(clean);
        }
    }
}