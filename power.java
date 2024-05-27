public class power {
    public static void main(String[] args) {
        int n = 2, p = 5;
        System.out.println(n + " power of " + p + " is " + pwr(n, p));
    }

    public static int pwr(int number, int power) {
        int r = 1;
        for(int i =1; i<= power; i++) {
            r *= number;
        }
        return r;
    }
}
