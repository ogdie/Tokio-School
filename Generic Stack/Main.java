public class Main {
    public static void main(String[] args) {

        Stack<Character> c1 = new Stack<>();

        c1.push('d');
        c1.push('i');
        c1.push('e');
        c1.push('g');
        c1.push('o');
        System.out.println(c1.toString());

        c1.pop();
        System.out.println(c1.toString());
        c1.pop();
        System.out.println(c1.toString());
        c1.pop();
        System.out.println(c1.toString());
        c1.pop();
        System.out.println(c1.toString());
    }
}