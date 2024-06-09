package konsultation;

public class AppleHeadset extends konsultation.Headset {
    private String softwareVersion;
    public AppleHeadset(boolean waterresistant,
                        String color, konsultation.ConnectionType connectionType,
                        String brand, konsultation.Size size, int soundLevel,
                        boolean hasMicro, konsultation.ChargingType chargingType,
                        String softwareVersion){
        super(waterresistant, color, connectionType, brand, size, soundLevel, hasMicro,chargingType);
        this.softwareVersion = softwareVersion;
    }
    public String getSoftwareVersion(){
        return softwareVersion;
    }

}
