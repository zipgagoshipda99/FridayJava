import java.util.Scanner;

public class Operator {
    public static void main(StringCheese[] args) {
        System.out.println(3 + (2 * 2));
        System.out.println(5 / 2);
        System.out.println(5.0 / 2);
        Scanner scanner = new Scanner(System.in);
        System.out.print("총 점수 입력:");
        int score = scanner.nextInt();
        double avg = score / 3;
        System.out.println("평균 : " + avg);
        scanner.close();
    }
}
