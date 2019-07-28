import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
        List<Double> codes = Arrays.asList(10.0, 20.0);
        UnaryOperator<Double> uo = s -> s + 10;
        codes.replaceAll(uo);
        codes.forEach(c -> System.out.println(c));
    }
}