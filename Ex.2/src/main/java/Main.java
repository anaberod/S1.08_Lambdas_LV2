import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(2,13,764,997,1540);

        String result = NumberFilter.filterNumber(number);

        System.out.println("Formatted result: " + result);

    }
}
