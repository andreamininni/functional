import java.util.Comparator;

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

        var frigo = new SensoreFrigo[] {
            new SensoreFrigo(28),
            new SensoreFrigo(44),
            new SensoreFrigo(25),
            new SensoreFrigo(24),
        };


        //? posso utilizzare, al posto di una implementazione di PropertyGetter ( SensorExternalTempGetter, ThermometerExternaTempGetter) una lambda che rispetta l'interfaccia PropertyGetter -> prende un oggetto e restituisce un double
        // PropertyGetter pGetter = (Object obj) -> ((Sensor) obj).getExternaleTemp();
        // PropertyGetter pGetterTherm = (Object obj) -> ((Thermometer) obj).getExternaleTemp();

        System.out.println("La temperatura esterna media presa dai sensori è di "
            + averageExternalTemp(sensors, (Object obj) -> ((Sensor) obj).getExternaleTemp()) + " gradi");
        System.out.println("La temperatura esterna media presa dai termometri è di "
            + averageExternalTemp(therms, (Object obj) -> ((Thermometer) obj).getExternaleTemp()) + " gradi");
        System.out.println("La temperatura esterna media presa dai sensori frigo è di "
            + averageExternalTemp(frigo, (Object obj) -> ((SensoreFrigo) obj).getExternalTemp()) + " gradi");
    }

    //! se lanciamo questa funzione con i sensori e con SensorExternaleTempGetter, restituirà al media calcolata sugli oggetti di classe Sensor
    //! se lanciamo questa funzione con i termometri  e con ThermometerExternaTempGetter, restituirà al media calcolata sugli oggetti di classe Thermometer
    //* una qualsiasi cosa che rispetta questa interfaccia ->  */
    public static <T> double averageExternalTemp(T[] sensors, GenericPropertyGetter<T> pGetter){
        double sum = 0;
        for (T sensor : sensors) {
            //! dopo aver creato una astrazione su come accediamo al dato dai sensori -> la funzione getDoubleProperty, andiamo ad astrarre anche il tipo di dato
            //? (Object obj) -> ((SensoreFrigo) obj).getExternalTemp()
            sum += pGetter.getProperty(sensor);
        }
        return (sum / sensors.length);
    }
    Comparator

}
