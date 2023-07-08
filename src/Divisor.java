public class Divisor {
    public static void main(String[] args) {
        int number = 10;
        for (int i = 1; i <= number; i++) {
//            Divisor is a number for which remainder is 0
            if(number % i == 0){
                System.out.println(i);
            }
        }
    }
}
