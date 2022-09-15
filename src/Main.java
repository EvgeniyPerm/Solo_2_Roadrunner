import java.util.Scanner;

public class Main {
    public static final String FAIL = "Yum";
    public static final String SUCCESS = "Meep Meep";
    public static final int coyoteDistance = 50;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int distance = sc.nextInt();
        int runnerSpeed = sc.nextInt();
        int coyoteSpeed = sc.nextInt();
        if (distance/runnerSpeed > (distance+coyoteDistance)/coyoteSpeed) {
            System.out.println(FAIL);
        } else
            System.out.println(SUCCESS);
    }
}