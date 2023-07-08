import java.lang.Math;

public class Prime {
    public static void main(String[] args) {
        double num = 7;
        int i = 2;
        boolean isPrime = true;

        while (i <= Math.sqrt(num)) {
            if (num % i == 0) {
                isPrime = false;
                break; // Exit the loop once a factor is found
            }
            i++;
        }

        if (isPrime) {
            System.out.println("It is a prime number");
        } else {
            System.out.println("It is not a prime number");
        }
    }
}
