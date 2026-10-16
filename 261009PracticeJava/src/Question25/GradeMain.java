package Question25;
import java.util.Scanner;

public class GradeMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("점수 입력 : ");
        int score = scanner.nextInt();
        scanner.close();
        String grade = (score>=90) ? "A" : (score>=80) ? "B" : (score>=70) ? "C" : (score>=60) ? "D" : "F";
        System.out.println("당신의 성적 : " + grade);
    }
}
