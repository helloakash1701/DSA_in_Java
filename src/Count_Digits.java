import java.util.*;
public class Count_Digits{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number ");
        int number = input.nextInt();
        int digit = 0;
        int count = 0;
        while(number >0)
        {
            digit = number % 10;
            count ++;
            number = number/10;
        }
        System.out.println("Therefore, total number of counts are: " + count );
    }
}