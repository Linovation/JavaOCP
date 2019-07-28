import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Emp> emp = Arrays.asList(
                new Emp ("Aohn", "Fale"),
                new Emp ("Beter", "ESam"),
                new Emp ("Chomas", "DSmith")
        );
        List<Emp> result = new ArrayList();
        result =
        emp.stream().sorted(Comparator.comparing(Emp::getfName).reversed()
                .thenComparing(Emp::getlName)).collect(Collectors.toList());
        result.forEach(r -> System.out.println(r.getfName() +" "+ r.getlName()));
    }
}
