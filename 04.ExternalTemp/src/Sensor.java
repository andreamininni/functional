public class Sensor {
    private int externaleTemp;
    private int InternaleTemp;
    public Sensor(int externaleTemp, int internaleTemp) {
        this.externaleTemp = externaleTemp;
        InternaleTemp = internaleTemp;
    }
    public int getExternaleTemp() {
        return externaleTemp;
    }
    public void setExternaleTemp(int externaleTemp) {
        this.externaleTemp = externaleTemp;
    }
    public int getInternaleTemp() {
        return InternaleTemp;
    }
    public void setInternaleTemp(int internaleTemp) {
        InternaleTemp = internaleTemp;
    }
}
