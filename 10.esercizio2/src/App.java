import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;
public class App {
    public static void main(String[] args) throws Exception {
        List<String> wordList = Arrays.asList("parolauno", "Andrea", "ciao", "pippo", "parolalunga", "test", "miotest");
        // filtrare le parole in base alla lunghezza
        // List<String> paroleLunghe = wordList.stream().filter(word -> word.length() > 4).toList();
        // System.out.println(String.join(",", paroleLunghe));

        //! voglio creare una funzione di ordine superiore che prenda in input la lista da filtrare e una lambda che contiene la logica per cui li devo filtrare
        List<String> filtered = filter(wordList, a -> a.indexOf("test") >= 0);
        System.out.println(String.join(",", filtered));
    }



    public static <T> List<T> filter(List<T> values, Predicate<T> p){
        List<T> result = new ArrayList<>();
        for(T value : values){
            if(p.test(value)) result.add(value);
        }
        return result;
    }
}
