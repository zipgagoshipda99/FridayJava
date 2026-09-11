import java.util.Scanner;

public class Stretch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("몸무게(kg)를 입력하시요 : ");
        float weight = scanner.nextFloat();
        System.out.println("키(m)를 입력하시오 : ");
        float m_Height = scanner.nextFloat();
        float bmi = (weight/(m_Height*m_Height));
        System.out.println("당신의 BMI는 " + bmi);
        if (bmi < 18.5f){
            System.out.println("저체중입니다. 좀 많이 드세요!");
        }
        if (bmi >= 18.5f && bmi <=22.9){
            System.out.println("정상 체중입니다.");
        }
        if (bmi >= 23f && bmi<=24.9f){
            System.out.println("과체중입니다.");
        }
        if (bmi >= 25f && bmi <=29.9){
            System.out.println("경도 비만입니다..");
        }
        if (bmi >= 30 && bmi <=34.9){
            System.out.println("중등도 비만입니다.");
        }
        if(bmi >=35){
            System.out.println("비만 2단계 초과입니다.");
        }
    }
}
