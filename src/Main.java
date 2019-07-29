import java.io.*;
import java.lang.reflect.InvocationHandler;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        int i;
        char c;
        try (FileInputStream fis = new FileInputStream("course.txt");
             InputStreamReader isr = new InputStreamReader(fis);) {
            while (isr.ready()) {
                isr.skip(2);
                i = isr.read();
                c = (char) i;
                System.out.println(c);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}