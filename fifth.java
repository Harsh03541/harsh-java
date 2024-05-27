public class fifth {
    public static void main(String[] args) {
        int number = 55;
        int d1 = number % 10;
        int d2 = d1 % 10;
        int res = ((d1 * d2) + (d1 + d2));
        if (res == number) {
            System.out.println("Number is special");
        } else {
            System.out.println("Nunber is not a special");
        }

    }
}
