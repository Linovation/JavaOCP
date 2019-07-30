
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {
        List<Product> products = new ArrayList<> (Arrays.asList(new Product(1,10), new Product(2,30), new Product(2,30)));
        Product p = products.stream().reduce(new Product(4,0), (p1,p2) -> {
            p1.price+=p2.price;
            return new Product(p1.id, p1.price);
        });
        products.add(p);
        products.stream().parallel().reduce((p1,p2) -> p1.price>p2.price?p1:p2)
                .ifPresent(System.out::print);
    }
}