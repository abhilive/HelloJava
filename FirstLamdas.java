import java.util.function.Consumer;
import java.util.function.Supplier;

public class FirstLamdas {

    public static void main(String[] args) {
        // Supplier
        Supplier<String> supplier = () -> "Hello!";

        String string = supplier.get();
        System.out.println("string = " + string);

        // Consumer
        Consumer<String> consumer = 
                (String s) -> {
                    System.out.println("I am inside the Consumer");
                    System.out.println(s);
                };
        consumer.accept("World !");
    }
    
}
