import java.util.Comparator;
public class MyComparator {
    public static <T> Comparator<T> reverse(Comparator<T> comp){
        return (a, b) -> -1 * comp.compare(a, b);
    }
}
