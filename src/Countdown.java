import java.util.Scanner;

public class Countdown
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What number do you want to start at? ");
        int userNumber = scanner.nextInt();
        int initialNum = userNumber;
        while (userNumber >= 0) {
            System.out.println(userNumber);
            userNumber--;
        }
        System.out.println("Time's up! " + initialNum + " seconds have passed!");
    }
}
