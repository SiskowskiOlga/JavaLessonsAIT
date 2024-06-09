package konsultation;

public enum Day {
    //константы пишем всегда большими буквами, это неизменяемые значения, не можем их менять

    MONDAY ("Monday are bad day"),
    TUESDAY("Tuesday are bad day"),
    WEDNESDAY("Wednesday is a small Friday"),
    THURSDAY("Thursday is a small Saturday"),
    FRIDAY("Friday"),
    SATURDAY("Saturday"),
    SUNDAY("Sunday");

    private String description;
    Day(String description){
        this.description = description;
    }
    public String getDescription(){
        return description;
    }


}
