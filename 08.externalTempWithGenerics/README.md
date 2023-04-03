## INterfaccia -> comportamento generico
auto -> accendersi, spostarsi ( accelerare, decelerare ), spegnersi, rifornirla
moto
aerei

public interface Vehicle {
    accendersi(),
    spostarsi(),
    spegnersi(),
    rifornirsi()
}

class Auto implements Vehicle {
    public accendersi() { "MI STO ACCENDENDO CON UN SISTEMA PER LE AUTO "}
    PUBLIC spostarsi() { "MI MUOVO SULL'ASFALTO "}
}

class Aereo implements Vehicle {
    public accendersi() { "Faccio partire le turbine "}
}


tutti i documenti possono essere stampati in PDF
interface Printable {
    printPDF();
}

class DOcumentiDiIdentità impoements Printable {
    print( ) {
        //! prende dati dal db tramite la class user e poi vien stampato
    }
}

class BustaPaga impoements Printable {
    print(){

    }
}