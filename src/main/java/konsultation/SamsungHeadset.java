package konsultation;

public class SamsungHeadset extends konsultation.Headset {
    private  boolean aiVersion;

    public SamsungHeadset(boolean waterresistant,
                          String color,
                          konsultation.ConnectionType connectionType,
                          String brand,
                          konsultation.Size size,
                          int soundLevel,
                          boolean hasMicro,
                          konsultation.ChargingType chargingType,
                          boolean aiVersion) {
        super(waterresistant, color, connectionType, brand, size,
                soundLevel, hasMicro, chargingType);
        this.aiVersion = aiVersion;
    }

    public boolean isAiVersion() {
        return aiVersion;
    }

}
