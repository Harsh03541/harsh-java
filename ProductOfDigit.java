public class ProductOfDigit {
        public static void main(String[] args) {
            int num = 2584;
            float res = product(num);
            System.out.println("Product ofigits: "+ res);
        }
        static float product(int a) {
            int multi = 1;
            while (a>0) {
                int digit = a%10;
                multi*=digit;
                a/=10;
            }
            return multi;
        }
}
