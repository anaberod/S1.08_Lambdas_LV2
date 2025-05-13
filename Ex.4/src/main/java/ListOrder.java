import java.util.List;
import java.util.stream.Collectors;

public class ListOrder {

    public static List<String> orderByFirstChar(List<String> input) {
        return input.stream()
                .sorted((a, b) -> Character.compare(a.charAt(0), b.charAt(0)))
                .collect(Collectors.toList());
    }

    public static List<String> prioritizeByE(List<String> input) {
        return input.stream()
                .sorted((a, b) -> {
                    boolean aHasE = a.contains("e");
                    boolean bHasE = b.contains("e");
                    return Boolean.compare(!aHasE, !bHasE);

                })
                .collect(Collectors.toList());
    }

    public static List<String> replaceAwith4(List<String> input) {
        return input.stream()
                .map(s ->s.replace("a", "4"))
                .collect(Collectors.toList());
    }

    public static List<String> filterNumeric(List<String> input) {
        return input.stream()
                .filter(s -> s.matches("\\d+")) //solo dígitos
                .collect(Collectors.toList());

    }

}



