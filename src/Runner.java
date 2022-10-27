public class Runner {
    public static void main(String[] args) {
        int a = 5;
        int b = 20;
        while (a < 20 && b > 0)
        {
            a++;
            b--;
            if (b > 5)
            {
                b /= 2;
            }
        }


        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
