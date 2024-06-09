package konsultation;

public class Headset {
    private  boolean waterresistant;

    private String color;

    private konsultation.ConnectionType connectionType;

    private String brand;

    private konsultation.Size size;

    private int soundLevel;

    private boolean hasMicro;

    private konsultation.ChargingType chargingType;

    public Headset(boolean waterresistant, String color, konsultation.ConnectionType connectionType, String brand, konsultation.Size size, int soundLevel, boolean hasMicro, konsultation.ChargingType chargingType) {
        this.waterresistant = waterresistant;
        this.color = color;
        this.connectionType = connectionType;
        this.brand = brand;
        this.size = size;
        this.soundLevel = soundLevel;
        this.hasMicro = hasMicro;
        this.chargingType = chargingType;
    }

    public boolean isWaterresistant() {
        return waterresistant;
    }

    public void setWaterresistant(boolean waterresistant) {
        this.waterresistant = waterresistant;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public konsultation.ConnectionType getConnectionType() {
        return connectionType;
    }

    public void setConnectionType(konsultation.ConnectionType connectionType) {
        this.connectionType = connectionType;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public konsultation.Size getSize() {
        return size;
    }

    public void setSize(konsultation.Size size) {
        this.size = size;
    }

    public int getSoundLevel() {
        return soundLevel;
    }

    public void setSoundLevel(int soundLevel) {
        this.soundLevel = soundLevel;
    }

    public boolean isHasMicro() {
        return hasMicro;
    }

    public void setHasMicro(boolean hasMicro) {
        this.hasMicro = hasMicro;
    }

    public konsultation.ChargingType getChargingType() {
        return chargingType;
    }

    public void setChargingType(konsultation.ChargingType chargingType) {
        this.chargingType = chargingType;
    }


}



