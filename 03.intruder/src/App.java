
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
       List<String> names = List.of("spring", "java", "oop", "php");
        List<String> intruders = names.stream().filter(name -> name.equals("php")).toList();
        for (String string : intruders) {
            System.out.println(string);
        }
    }
}
