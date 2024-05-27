public class sumOfNumber {
    public int result(int num) {
        int sum=0;
        for(int i=1; i<=num; i++) {
            sum=sum+i;
        }
        return sum;
    }
    public static void main(String[] args) {
        int n=10;
        sumOfNumber obj = new sumOfNumber();
        int res = obj.result(n);
        System.out.println("Sum of n numers: "+res);
    }
}
