public class happyNumber {
    public static void main(String[] args) {
        int n = 49  ;
        boolean res = isHappyNumber(n);
        if(res) {
            System.out.println(n + " is Happy Number");
        }
        else{
            System.out.println(n + " is not Happy Number");
        }
    }
    public static boolean isHappyNumber(int x) {

        while (x > 9) {
            int sum = 0;
            do{
                int r = x % 10;
                sum += x * x;
                x /= 10;
            }
            while(x != 0); 
            
        }
        return x == 1 || x == 7;
    }
}
