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


        System.out.println("La temperatura esterna media è di " + averageExternalTemp(sensors) + " gradi");
    }

    public static double averageExternalTemp(Sensor[] sensors){
        double sum = 0;
        for (Sensor sensor : sensors) {
            //! qui accedo alla temperatura dal sensore stesso
            //! POSSO ACCEDERE ALLA TERMPERATURA SOLO DA UN OGGETTO DI CLASSE SENSOR
            sum += sensor.getExternaleTemp();
        }
        return (sum / sensors.length);
    }
}
