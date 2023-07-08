import java.util.*;
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number ");
        int number = input.nextInt();
        int ans = 0;
        int digit = 0;
        while(number != 0)
        {
            if (number < Integer.MAX_VALUE || number > Integer.MIN_VALUE)
            {
                digit = number % 10;
                ans = (ans * 10) + digit;
                number /= 10;
            }

        }
        System.out.println("Therefore, the reverse number is: " + ans);
    }
}
