import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.ToIntFunction;

public class Main {

    public static void main(String[] args) {
        IntConsumer consumer = e-> System.out.println(e);
        Integer value =90;
        ToIntFunction<Integer> funRef = e -> e + 10;
        Integer result =  funRef.applyAsInt(value);
        consumer.accept(result);
    }
}