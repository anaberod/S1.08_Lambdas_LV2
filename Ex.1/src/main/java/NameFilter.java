import java.util.List;
import java.util.stream.Collectors;

public class NameFilter {

    public static List<String> filterNames (List<String> input) {
        return input.stream()
                .filter(name -> name.startsWith("A")&& name.length() == 3)
                .collect(Collectors.toList());

    }
}
