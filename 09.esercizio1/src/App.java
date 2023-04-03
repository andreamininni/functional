import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        // Integer[] ints = new Integer[]{8,4,2,6,7,10};
        // //! in alcuni casi, se vogliamo, tramite la programmazione funzionale, possiamo modifiare i dati che manipoliamo
        // // Arrays.sort(ints, (a,b) -> Integer.compare(a , b));
        // Arrays.sort(ints, (a, b) -> Integer.compare(a , b));
        // List.of(ints).stream().forEach(el -> System.out.println(el));

        // String[] names = new String[]{"Pippo", "Pluto", "Paperino", "Gianmario"};
        // Arrays.sort(names, (a, b) -> a.length() - b.length());
        // System.out.println(String.join("-", names));


        Person[] people = new Person[]{
            new Person(24, "Pippo", "Disney"),
            new Person(78, "Pluto", "Disney"),
            new Person(35, "Paperino", "Disney"),
        };

        // Arrays.sort(people, (a, b) -> a.getAge() - b.getAge());
        // Arrays.sort(people, Comparator.comparing(a -> a.getAge()));
        Arrays.sort(people, MyComparator.reverse((a, b) -> a.getAge() - b.getAge()));
        System.out.println(Arrays.toString(people));
    }
}
