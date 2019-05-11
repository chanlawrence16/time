public class Main {

    public static void main(String[] args) {

        int hour = 6;

        if (hour > 12) {
            System.out.println(hour - 12 + "pm");

        } else if (hour < 12) {
            System.out.println(hour - 12 + 12 + "am");
        }

        ///this is test
        else if (hour == 12) {
            System.out.println("12nn");
        }



    }
}
