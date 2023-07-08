import java.lang.Math;
public class HCF{
    public static void main(String[] args) {
        int one = 2;
        int two = 4;
        int max = 0;
        for (int i = 1; i <= Math.max(one,two); i++) {
            if (one % i ==0 && two % i ==0){
                if(max < i){
                    max = i;
                }
            }
        }
        System.out.println(max);
    }
}