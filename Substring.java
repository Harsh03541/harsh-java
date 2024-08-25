public class Substring {
    public static void main(String[] args) {

        StringBuilder str = new StringBuilder("abcd");
        System.out.println("Given String: " + str);

        System.out.print("Substring of the given String ( " + str + " ) : ");
        
        for(int i = 0; i< str.length(); i++) {
            for(int j = i+1; j <= str.length(); j++) {
                String s = str.substring(i, j);
                System.out.print(s + " ");
            }
        }
    }
}
