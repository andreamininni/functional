public class App {
    public static void main(String[] args) throws Exception {
        //! vogliamo creare un programma che, dati dei sensori, prenda la temperatura esterna da ognuno di essi e ritorni la temperatura media
        //! creiamo una lista o un array di sensori che inizializziamo
        var sensors = new Sensor[] {
            new Sensor(37, 55),
            new Sensor(28, 55),
            new Sensor(44, 55),
            new Sensor(25, 55),
            new Sensor(24, 55),
        };


        System.out.println("La temperatura esterna media presa dai sensori è di " + averageExternalTemp(sensors, new SensorExternalTempGetter()) + " gradi");

    }

    public static double averageExternalTemp(Sensor[] sensors, PropertyGetter pGetter){
        double sum = 0;
        for (Sensor sensor : sensors) {
            //! NON STIAMO PIU' ACCEDENDO ALLA PRORPIETà DIRETTAMENTE SULL'OGGETTO SENSOR
            sum += pGetter.getDoubleProperty(sensor); //! non ho effettuato l'accesso diretto all'oggetto sensor ma l'ho fatto fare ad una classe che implementa l'interfaccia PropertyGetter => prende un oggetto e restituisce un double
        }
        return (sum / sensors.length);
    }

}
