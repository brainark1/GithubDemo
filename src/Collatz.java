
public class Collatz {
    
    public static void main(String[] args) {
        int s = Integer.parseInt(args[0]);
        String result = "Collatz sequence for " + s + ": " + s;
        while (s != 0) {
            if (s % 2 == 0) {
                s /= 2;
            } else {
                s = 3*s + 1;
            }
            result += " " + s;
        }
        System.out.println(result);
    }
    
}
