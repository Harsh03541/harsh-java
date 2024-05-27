public class factorial {
    public static int fact(int number) {
        int fact=1;
        for(int i=1;i<=number;i++) {
            fact*=i;
        }
        return fact;
    }
    public static void main(String[] args) {
        
        System.out.println("factorial : "+fact(5));
    }
}
