import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number ");
        int number = input.nextInt();
        int originalNumber = number;
        int ans = 0;
        while(number != 0)
        {
            int digit = number % 10;
            ans = (ans * 10) + digit;
            number /= 10;
        }
        if(originalNumber == ans)
        {
            System.out.println("It is a palindrome number ");
        }
        else {
            System.out.println("It is not a palindrome number ");
        }
    }
}
