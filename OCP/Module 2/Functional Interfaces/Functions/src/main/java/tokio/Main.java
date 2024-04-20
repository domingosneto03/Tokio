package tokio;

import java.util.function.Function;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog("Max", 10, 5);

        Function<Dog, String> getName = (d) -> d.getName();
        Function<String, Character> getInitial = (s) -> s.charAt(0);
        Function<Dog, Character> getNameInitial = getName.andThen(getInitial);
        Character initial = getNameInitial.apply(dog);
        System.out.println("A letra inicial do nome do cão é: " + initial);
        Function<Dog, Character> getNameInitialCompose = getInitial.compose(getName);
        Character initialCompose = getNameInitialCompose.apply(dog);
        System.out.println("A letra inicial do nome do cão usando compose é: " + initialCompose);
    }
}
