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
        //! person -> Gender.FEMALE.equale(person.gender)
        //? dalla lista genero uno stram ( una sequenza di dati che può essere manipolato uno alla volta )
        people.stream()
        //? dato che ho creato uno stream indico alla funzione filter in base a cosa deve filtrare il singolo elemento che sta controllando
            .filter(person -> Gender.FEMALE.equals(person.gender))
            //? dopo aver filtrato, ho ancora uno stram, non una lista quindi devo trasformare lo stream in lista per poterla poi ciclare e stampare
            // ? utilizzo il metodo dell'oggetto Collectors.toList() che ritrasforma lo stream in una lista
            .collect(Collectors.toList())
            .forEach(person -> System.out.println(person.name));

            //! la lista originale non è stata modificata
        for(Person p : people){
            System.out.println(p.name);
        }


    }
}
