import java.util.List;
import java.util.stream.Collectors;

public class NumberFilter {
    public static String filterNumber (List<Integer> number) {
        return number.stream()
                .map(n ->(n % 2 == 0 ? "e" : "o") + n)
                .collect(Collectors.joining(", "));
    }
}
