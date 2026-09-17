public class ArmstrongNumbers {
    public static void main(String[] args) {
        
        for(int i=1; i<=1000; i++) {
            int temp = i;
            int sum = 0;

            while(temp > 0) {
                int digit = temp % 10;
                sum += digit * digit * digit;
                temp /= 10;
            }
            if(sum == i) {
                System.out.print(i + " ");
            }
        }
    }
}