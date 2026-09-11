import java.util.Scanner;

public class Level3 {
    public static void main(String[] args) {
        int[] scores = new int[5];
        Scanner scanner = new Scanner(System.in);
        float average = 0;
        int AllAddedScores = 0;
        int maxScore = scores[0];
        for(int i = 0; i<scores.length; i++){
            System.out.println((i+1) + "번째 점수 입력");
            int score = scanner.nextInt();
            scores[i] = score;
            AllAddedScores += score;
            if(scores[i] > maxScore){
                maxScore = scores[i];
            }
        }
        average = AllAddedScores / 5;
        System.out.println("합계: " + AllAddedScores);
        System.out.println("평균: " + average);
        System.out.println("최대값: " + AllAddedScores);
    }
}
