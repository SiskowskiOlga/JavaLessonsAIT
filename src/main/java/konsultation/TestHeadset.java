package konsultation;

public class TestHeadset {
    public static void main(String[] args) {
        konsultation.AppleHeadset appleHeadset = new konsultation.AppleHeadset(true, "white", konsultation.ConnectionType.WIRELESS,"Apple", konsultation.Size.SMALL,70,true, konsultation.ChargingType.INDUCTION,"1.2");
        System.out.println(appleHeadset.getChargingType());

        konsultation.SamsungHeadsetExperimental samsungHeadsetExperimental = new konsultation.SamsungHeadsetExperimental(true,"white", konsultation.ConnectionType.WIRELESS,"Samsung", konsultation.Size.MEDIUM,80,true, konsultation.ChargingType.INDUCTION,true,2000);
        System.out.println(samsungHeadsetExperimental.getStepcount());
    }
}
