public class evenodd {
    public static void main(String[] args) {
        int num = 5;
        if( (num & 1) == 1) {
            System.out.println("odd number");
        }
        else{
            System.out.println("even");
        }
    }
}
