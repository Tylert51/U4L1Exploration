import java.util.Scanner;

public class GetDownToOne
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What number do you want to halve to one? ");
        int userNumber = scanner.nextInt();

        int numHalves = 0;

        while (userNumber != 1) {
            userNumber /= 2;
            numHalves++;
            System.out.println(userNumber);
        }
        System.out.println("There are " + numHalves + " halvings to get 1");
    }
}
