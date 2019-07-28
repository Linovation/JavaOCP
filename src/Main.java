import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;




public class Main {

    public enum USCurrency {
        PENNY (1),
        NICKLE (5),
        DIME (10),
        QUARTER (25);

        private int value;

        USCurrency(int value) {
            this.value = value;
        }
        public int getValue() {return value;}
    }
    public static void main(String[] args) {
            USCurrency usCoin = USCurrency.DIME;
            System.out.println(usCoin.getValue());

       }
}
