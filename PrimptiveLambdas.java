import java.util.function.DoubleToIntFunction;
import java.util.function.IntSupplier;

public class PrimptiveLambdas {
    public static void main(String[] agrs) {
        IntSupplier supplier = () -> 10;
        int i = supplier.getAsInt();
        System.out.println("i = " + i);

        DoubleToIntFunction function = value -> (int)Math.floor(value);
        int pi = function.applyAsInt(Math.PI);
        System.out.println("PI =" + pi);
    }
}
