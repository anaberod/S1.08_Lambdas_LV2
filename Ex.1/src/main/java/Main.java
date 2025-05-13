import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ana", "Javier", "Arnau", "Felipe", "Sofia");

        //usamos el metodo de la otra clse
        List<String> filteredNames = NameFilter.filterNames(names);

        System.out.println("Names starting with 'A' and lenght 3: " + filteredNames);

    }
}
