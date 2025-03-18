import java.util.function.Function;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== Dogs e Funções ===");
        Dog kaya = new Dog("Kaya"   ,  30,  6);
        Dog thor = new Dog("Thor"  ,  40, 12);
        Dog holmes = new Dog("Holmes", 120,  7);

        System.out.println(kaya);


        Function<Dog, String> getName = dog -> dog.toString();
        Function<String, Character> getInitial = name -> name.charAt(0);

        Character andThenKaya = getName.andThen(getInitial).apply(kaya);
        Character composeKaya = getInitial.compose(getName).apply(kaya);

        System.out.println("andThenMethod: " + andThenKaya);
        System.out.println("composeMethod: " + composeKaya);

        System.out.println(thor);

        Character andThenThor = getName.andThen(getInitial).apply(thor);
        Character composeThor = getInitial.compose(getName).apply(thor);

        System.out.println("andThenMethod: " + andThenThor);
        System.out.println("composeMethod: " + composeThor);

        System.out.println(holmes);

        Character andThenHolmes = getName.andThen(getInitial).apply(holmes);
        Character composeHolmes = getInitial.compose(getName).apply(holmes);

        System.out.println("andThenMethod: " + andThenHolmes);
        System.out.println("composeMethod: " + composeHolmes);
    }
}