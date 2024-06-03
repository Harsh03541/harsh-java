public class FibonacciRange {
    public static void main(String[] args) {
        int start = 0;
        int end = 50;
        
        System.out.println("Fibonacci series " + start + " to " + end + ":");
        FibonacciRange(start, end);
    }
    
    public static void FibonacciRange(int s, int e) {
        int n1 = 0, n2 = 1 , count = 0;
        
        while (n1 <= e) {
            if (n1 >= s) {
                System.out.print(n1 + " ");
                count++;
            }
            int n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
        System.err.println();
        System.out.println("count: " + count);
    }
}
