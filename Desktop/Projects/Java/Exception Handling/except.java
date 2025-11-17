enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class except {
    public static void main(String[] args) {

        try {
            Day today = Day.valueOf("FUNDAY");
            System.out.println("Today is: " + today);

        } catch (IllegalArgumentException e) {
            System.out.println("Invalid day! Please enter a valid day of the week.");

        } finally {
            System.out.println("This block always executes.");
        }
    }
}