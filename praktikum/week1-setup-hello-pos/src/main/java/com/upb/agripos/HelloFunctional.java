import java.util.function.Consumer;

public class HelloFunctional {
    public static void main(String[] args) {
        Consumer<String[]> sayHello = data ->
            System.out.println("Hello World, I am " + data[0] + " - " + data[1] + " from " + data[2]);

        sayHello.accept(new String[]{"Irwandi Isnugroho", "240202867", "3IKKA"});
    }
}