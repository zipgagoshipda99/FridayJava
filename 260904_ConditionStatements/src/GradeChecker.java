import java.util.Scanner;

public class GradeChecker {
    public static void main(String[] args) throws Exception {
        //조건문을 사용하여 90점 이상 A 80점 이상 B등등을 체크하는 제어문을 사용한 코드를 짜자.
        // 필요한 제어문 if , else if.
        System.out.println("점수를 입력하시오: ");
        Scanner sc = new Scanner(System.in); //표준 입력 장치를 쓰겠다 그래서 system.in 을 매개변수에 입력
        int score = sc.nextInt();
        
        if (score >= 90){
            System.out.println("A학점!! 축하합니다. 인서울 레스기!");
        } 
        else if(score >= 80){
           System.out.println("B학점!! 축하해용 티비");
        }
        else if(score >= 70){
            System.out.println("C학점, try a lil bit harder  yk");
        }
        else System.out.println("dang dude you should get some tutoring lessons!");
    }
}
