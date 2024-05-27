public class smaller {
    public static void main(String[] args) {
        int a=50;
        int b=88;
        int c=65;
        int d=21;
        if(a<b && a<c && a<d ) {
            System.out.println(a + " (a) is smaller");
        }
        else  if (b<a && b<c && b<d) {
            System.out.println(b + " (b) is smaller");    
        }
        else  if (c<a && c<b && c<d) {
            System.out.println(c + " (c) is smaller");    
        }
        else{
            System.out.println(d + " (d) is  smaller");
        }
    }
}
