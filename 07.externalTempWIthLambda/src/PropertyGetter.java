//! ho creato questa interfaccia perché posso creare tutte le clsaasi che voglio per implementarla e poter ottenere una prorietà da ogni oggetto che voglio
public interface PropertyGetter {
    double getDoubleProperty(Object obj); //? prende un oggetto e restituisce un double
}
// (Object obj) -> ((Sensor) s).getExternaleTemp();
