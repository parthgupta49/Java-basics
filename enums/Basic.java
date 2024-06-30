package enums;

public class Basic {
    enum Week {
        Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday
    }

    public static void main(String[] args) {
        Week week = Week.Monday;
//        System.out.println(week.ordinal()); // this is a constant value so the output will be always same..
//        ordinal just gives the index of the enum values like when
        for (Week day : Week.values()) {
            System.out.println(day.ordinal() + " " + day); // here we are getting the index of every day
        }
    }
}
