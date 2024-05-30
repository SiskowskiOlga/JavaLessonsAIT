package homework33;
import java.util.List;
public enum CheckForFrostWarningValues {
    TEST1(java.util.List.of(1.0, 0.5, 2.0),false),
    TEST2(java.util.List.of(-1.0, 0.5, 2.0),true),
    TEST3(java.util.List.of(0.0, 0.0, 0.0),false),
    TEST4(java.util.List.of(-10.5, -5.5, 3.0),true),
    TEST5(java.util.List.of(25.0, 30.0, 15.0),false),
    TEST6(java.util.List.of(0.1, -0.1, 0.2),true);


    private final java.util.List<Double> tempList;
    private final boolean expected;

    CheckForFrostWarningValues(java.util.List<Double> tempList, boolean expected) {
        this.tempList = tempList;
        this.expected = expected;
    }

    public java.util.List<Double> getTempList() {
        return tempList;
    }

    public boolean isExpected() {
        return expected;
    }

}


