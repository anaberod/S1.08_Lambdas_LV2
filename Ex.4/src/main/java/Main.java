import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> elements = Arrays.asList("bottle","25", "glasses","567", "elephant", "banana");

        System.out.println("1. Order by first character:");
        ListOrder.orderByFirstChar(elements).forEach(System.out::println);

        System.out.println("\n2. Strings that contain 'e' first:");
        ListOrder.prioritizeByE(elements).forEach(System.out::println);

        System.out.println("\n3. Replace 'a' with '4':");
        ListOrder.replaceAwith4(elements).forEach(System.out::println);

        System.out.println("\n4. Only numeric elements:");
        ListOrder.filterNumeric(elements).forEach(System.out::println);

    }
}
