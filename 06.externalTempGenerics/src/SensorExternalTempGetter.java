//! questa è l'implementazione per l'intarfaccia sull'oggetto Sensor
//! quando creerò un'altrrqa classe simile a Sensor, potrò utilizzarla anche sull'altra classe
public class SensorExternalTempGetter implements PropertyGetter {
    public double getDoubleProperty(Object obj){
        Sensor s = (Sensor) obj;
        return s.getExternaleTemp();
    }
}
