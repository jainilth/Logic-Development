import java.util.Scanner;

public class Lab_4_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter hour: ");
        int hour = sc.nextInt();
        System.out.print("Enter minutes: ");
        int minutes = sc.nextInt();
        double hourangle = 0.5*minutes;
        hourangle += 30 * (hour % 12);
        double minuteangle = 6 * minutes;
        double angle = Math.abs(minuteangle - hourangle);
        System.out.println("Angle between hour hand and minute hand is: " + angle + " degrees");
    }
}
