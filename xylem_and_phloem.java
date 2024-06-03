class xylem_and_phloem{
    public static void main(String[] args) {
        int n = 1444;
        boolean res = isXylem(n);
        if(res) {
            System.out.println(n + " is a xylem number");
        }
        else {
            System.out.println(n + " is not a xylem number");
        }
    }
    public static boolean isXylem(int x) {
        int os = 0;
        int ms = 0;
        int temp = x;
        while (x != 0) {
            int r = x % 10;
            if(x == temp || x ==r) {
                os = os + r;
            }
            else {
                ms = ms + r;
            }
            x = x / 10;
        }
        return os == ms;
    }
}