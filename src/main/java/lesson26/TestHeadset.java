package lesson26;

public class TestHeadset {
    public static void main(String[] args) {
        AppleHeadset appleHeadset = new AppleHeadset(true, "white",ConnectionType.WIRELESS,"Apple",Size.SMALL,70,true, lesson26.ChargingType.INDUCTION,"1.2");
        System.out.println(appleHeadset.getChargingType());

        SamsungHeadsetExperimental samsungHeadsetExperimental = new SamsungHeadsetExperimental(true,"white", lesson26.ConnectionType.WIRELESS,"Samsung", lesson26.Size.MEDIUM,80,true, lesson26.ChargingType.INDUCTION,true,2000);
        System.out.println(samsungHeadsetExperimental.getStepcount());
    }
}
