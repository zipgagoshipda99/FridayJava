import java.util.Scanner;

public class ArrayHighestVal{
    public static void main(String[] args) {
        double scores[] = new double[5];
        Scanner scanner = new Scanner(System.in);
        double highestScore = scores[0];
        int count = 0;
        for (int i = 0; i < scores.length; i++) {
            System.out.print((i + 1) + "번째 점수 입력: ");
            scores[i] = scanner.nextDouble(); 
            System.out.println(scores[i]);
            
            if (scores[i] > highestScore) {
                highestScore = scores[i];
            }
        }
        System.out.print("전체 점수: ");
        for (int i = 0; i< scores.length; i++){
            if (i == scores.length - 1){
                System.out.print(scores[i]);
            }
            else{
                System.out.print(scores[i] + ", ");
                
            }
        }

        System.out.println("\n");
        System.out.println("최고점 : " + highestScore);
        if (highestScore>= 90){
            System.out.println("등급 : A등급");
        }
        else if (highestScore >= 80){
            System.out.println("등급 : B등급 ");
        }
        else {
            System.out.println( "등급 : C등급");
        }
    }
}