public class print1To10 {
    public int result(int num) {
        for(int i=1; i<=10; i++) {
            System.out.println(i);
        }
        return 0;
    }
    public static void main(String[] args) {
        int n=10;
        print1To10 obj = new print1To10();
        obj.result(n);
    }
}
