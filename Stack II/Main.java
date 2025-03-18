public class Main {
    public static void main(String[] args) {

        Stack chars = new Stack();

        try {
            chars.push('D');
            chars.push('i');
            chars.push('e');
            chars.push('g');
            chars.push('o');
        } catch (StackFullException e) {
            throw new RuntimeException(e);
        }

        System.out.println(chars.toString());

        while (!chars.stackVazio()) {
            try {
                System.out.println(chars.pop());
            } catch (StackEmptyException e) {
                throw new RuntimeException(e);
            }
        }
    }
}