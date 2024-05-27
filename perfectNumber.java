public class PerfectNumber {
    static boolean isPerfectNumber(int n) {
        int sum = 0;
        for(int i = 1; i <= n/2; i++) {
            if(n % i ==0) {
                sum += i;
            }
        }
        return sum == n;
    }
    public static void main(String[] args) {
        int num = 28;
        boolean res = isPerfectNumber(num);
        if(res) {
            System.out.println(num + " IS A PERFECT NUMBER");
        }
        else {
            System.out.println(num + " IS A NOT PERFECT NUMBER");
        }
    }
}
