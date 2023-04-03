import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) throws Exception {
        //! data una lista di oggetti di classe Person, filtrare le persone in base al genere


        //? Imperativo
        // List<Person> females = new ArrayList<>();
        // for(Person p : people){
        //     if(Gender.FEMALE.equals(p.gender)) females.add(p);
        // }
        // for(Person f : females){
        //     System.out.println(f.name);
        // }

        List<Person> people = List.of(
            new Person("Maria" , Gender.FEMALE),
            new Person("Marco" , Gender.MALE),
            new Person("Paola" , Gender.FEMALE),
            new Person("Roberto" , Gender.MALE),
            new Person("Giovanna" , Gender.FEMALE)
        );

        //? Dichiarativo
       List<Person> females = people.stream().filter(p -> Gender.FEMALE.equals(p.gender)).toList();
       for(Person p : females){
        System.out.println(p.name);
       }


    }
}
