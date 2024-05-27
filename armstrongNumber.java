public class armstrongNumber {
    public static void main(String[] args) {
        int num = 153;
        int res = isArmstrong(int num);
        if(res == num) {
            System.out.println(num + " is a Armstrong Number");
        }
        else {
            System.out.println(num + " is not a Armstrong Number");
        }
    }

    public static int isArmstrong(int x) {
        int sum = 0;
        int count = 0;
        int temp = x;
        while (temp != 0) {
            temp = temp / 10;
            count++;
        }

        while (temp != 0) {
            temp = temp % 10;
            for(int i=1; i <= count; i++) {
                sum *= temp;
            }
            x /= 10;
        }
    }
    return sum;
}
