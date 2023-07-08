public class Armstrong {
    public static void main(String[] args) {
        int number = 153;
        int original = 153;
        int temp = number;
        int count = 0;
        double sum = 0;
        while(number != 0)
        {
            int digit = number % 10;
            count ++;
            number /= 10;
        }
        while(temp != 0) {
            double digit = temp % 10;
            sum = sum + Math.pow(digit, count);
            temp /= 10;
        }
        int summ = (int)(sum);
        System.out.println(summ);

        if(original == summ)
        {
            System.out.println("It is a armstrong number ");
        }
        else{
            System.out.println("It is not a armstrong number ");
        }
        
    }
}
