## Programmazione funzionale

### imperativo
- siamo noi che diciamo al programma cosa deve fare per raggiungere un risultato
- diamo al programma tutte le istruzioni, passo dopo passo, per eseguire un algoritmo e ottenere un risultato
numbers = [1, 2, 3, 4, 5, 6, 7, 8]
Integer[] result = [];
for(Integer n : numbers){
    if(n % 2== 0){
        result.add(n)
    }
}

passiamo ad un algoritmo ( funzione ) dei dati che vengono manipolati e possono cambiare il proprio stato ( valore )


### dichiarativo
- dichiariamo al programma quello che vogliamo ottenere, sarà il programma a manipolare i dati secondo delle funzioni già esistenti
numbers = [1, 2, 3, 4, 5, 6, 7, 8]
numbers.filter( el => el % 2 == 0 );

con il dichiarativo si tende ad astrarre il dato ricevuto -> che non lavoro mai direttamente sul dato ma eseguo delle *funzioni pure


* funzioni pure -> funzioni che non hanno side effect -> non manipolano uno stato ( un dato in menoria ), non stampano nulla e il loro risultato dipende esclusivamente dai dati ricevuti in input
function somma(num1, num2){ console.log(num1 + num2); }
function somma(num1, num2){ return num1 + num2; }

let person = { name: "Pippo" };
function f(p){
    p.name = "ciccio";
}
f(person)


let arr = [1, 2, 3, 4, 5, 6, 7, 8]
 arr.map(el => el * 2) // perchè questa funzione NON MANIPOLA l'array originale ( arr ). Semplicemente lo riceve in input e genera un nuovo array con i valori ottenuti dalla funzione

per conservare lo stato originale del programma invariato
let p = {
    name: "Andrea",
    cf
}


## Lambda
parametro -> espressione
(int a) -> a * 2; // static typing
a -> a * 2; // type inference
a -> {
    // code ....
    return
}

let arr = [1, 2, 3, 4, 5, 6, 7, 8]
arr.filter(el => el % 2 == 0)


## Stream
una struttura dati che, partendo da una qualsiasi collection ( List, ArrayList, Set, TreeSet... NON LE MAPPE ) elaborano un dato alla volta
 people.stream()
    .filter(person -> Gender.FEMALE.equals(person.gender))
    .collect(Collectors.toList())
    .forEach(person -> System.out.println(person.name));
    //! 3 volte -> un unico ciclo e compie tutte le operazione in una volta

//! se contiene un numero
//! se contiene un uppercase


 List<Integer> ints = List.of(1,5,8,6,10,20,32, 45, 15);
        ints.stream()
            .filter(el -> el > 5)
            .limit(5).toList(); //! 1, 2, 3, 4, 5
