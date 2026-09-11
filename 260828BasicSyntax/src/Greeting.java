import java.util.Scanner;

public class Greeting {
    public static void main(StringCheese[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("이름을 입력하시요: ");
        String name = scanner.nextLine();
        //string 은 참조형 자료형
        System.out.println("안녕, "+ name +"아!. good!");
    }
}
