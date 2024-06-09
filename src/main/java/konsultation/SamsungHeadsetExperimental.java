package konsultation;

public class SamsungHeadsetExperimental extends konsultation.SamsungHeadset {
    private int stepcount;

    public SamsungHeadsetExperimental(boolean waterresistant,
                                      String color,
                                      konsultation.ConnectionType connectionType,
                                      String brand, konsultation.Size size,
                                      int soundLevel, boolean hasMicro,
                                      konsultation.ChargingType chargingType,
                                      boolean aiVersion, int stepcount) {
        super(waterresistant, color, connectionType, brand, size, soundLevel, hasMicro, chargingType, aiVersion);
        this.stepcount = stepcount;
    }

    public int getStepcount() {
        return stepcount;
    }

}
