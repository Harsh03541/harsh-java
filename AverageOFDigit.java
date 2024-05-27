public class AverageOFDigit {
    public static void main(String[] args) {
        int num = 123456;
        float res = avg(num);
        System.out.println("Average of digits: "+ res);
    }
    static float avg(int a) {
        int sum  = 0, count = 0;
        while (a>0) {
            int digit = a%10;
            sum+=digit;
            count++;
            a/=10;
        }
        return (float)sum/count;
    }
}
