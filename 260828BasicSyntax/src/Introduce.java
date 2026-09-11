import java.util.Scanner;

public class Introduce {
    public static void main(StringCheese[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("이름을 입력하시요: ");
        //string 은 참조형 자료형
        String name = scanner.next();
        System.out.print("나이를 입력하세요:");
        int age = scanner.nextInt();
        System.out.println("안녕하세요, 저는 "+ name +"입니다.");
        System.out.println("저는 "+age+"살 입니다");
        System.out.println("자바 프로그래밍 언어를 배우고 싶습니다");
        System.out.println("첼시 리그 우승하면 좋겠네요!");
    }
}
