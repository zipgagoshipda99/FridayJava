import java.util.Scanner;

public class AverageScoreCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("국어 점수 입력: ");
        double koreanScore = scanner.nextDouble();
        System.out.println("영어 점수 입력: ");
        double englishScore = scanner.nextDouble();
        System.out.println("수학 점수 입력: ");
        double mathScore = scanner.nextDouble();
        double averageScore = (koreanScore + englishScore + mathScore)/ 3; 
        System.out.println("평균 : " + averageScore);
        if (averageScore >= 90.0){
            System.out.println("우수");
        }
        else{
            System.out.println("보통입니다.");
        }
    }
}
