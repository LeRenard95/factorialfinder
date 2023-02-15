import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Type number for factor n");
        Scanner scan = new Scanner(System.in);
        int answer = scan.nextInt();
        System.out.println(answer);

        while (answer > 0) {
            int answer2 = answer * (answer - 1);
            System.out.println(answer2);
            answer--;
        }
    }
}
