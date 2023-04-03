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

        var therms = new Thermometer[] {
            new Thermometer(28),
            new Thermometer(44),
            new Thermometer(25),
            new Thermometer(24),
        };

        System.out.println("La temperatura esterna media presa dai sensori è di " + averageExternalTemp(sensors, new SensorExternalTempGetter()) + " gradi");
        System.out.println("La temperatura esterna media presa dai termometri è di " + averageExternalTemp(therms, new ThermometerExternaTempGetter()) + " gradi");


    }

    //! se lanciamo questa funzione con i sensori e con SensorExternaleTempGetter, restituirà al media calcolata sugli oggetti di classe Sensor
    //! se lanciamo questa funzione con i termometri  e con ThermometerExternaTempGetter, restituirà al media calcolata sugli oggetti di classe Thermometer
    public static <T> double averageExternalTemp(T[] sensors, PropertyGetter pGetter){
        double sum = 0;
        for (T sensor : sensors) {
            //! dopo aver creato una astrazione su come accediamo al dato dai sensori -> la funzione getDoubleProperty, andiamo ad astrarre anche il tipo di dato
            sum += pGetter.getDoubleProperty(sensor);
        }
        return (sum / sensors.length);
    }

}
