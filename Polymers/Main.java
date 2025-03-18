public class Main {
    public static String processPolymer(String polymer) {
        int comprimento = polymer.length();
        boolean flag = false;

        while (!flag){
            flag = true;

            for(int i = 0; i < comprimento -1; i++){
                char a = polymer.charAt(i);
                char b = polymer.charAt(i+1);

                if ((Character.isUpperCase(a) && Character.isLowerCase(b)) || (Character.isUpperCase(b)
                        && Character.isLowerCase(a))){
                    if (Character.toUpperCase(a) == Character.toUpperCase(b)){
                        flag = false;
                        String prim = Character.toString(a);
                        String seg = Character.toString(b);
                        polymer = polymer.replace(prim + seg,"");
                        comprimento = polymer.length();
                    }
                }
            }
            polymer = polymer.trim();
        }
        return polymer;
    }
    public static void main(String[] args) {
        String polymer = "CaAdbb";
        String polymer2 = "rFvdAaDVb";

        System.out.println(processPolymer(polymer));
        System.out.println(processPolymer(polymer2));
    }
}