import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        DoubleStream str= DoubleStream.of(1.0,2.0,3.0,4.0);
        Double d = str.average().getAsDouble();
        System.out.println(d);
    }
}