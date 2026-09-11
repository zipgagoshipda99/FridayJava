import java.util.Scanner;

public class IntroduceYourSelf {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("이름 입력 : ");
        String name = scanner.next();
        System.out.print("나이 입력 : ");
        int age = scanner.nextInt();
        System.out.print("좋아하는 게임 입력 : " );
        String favoriteGame = scanner.next();
        //print 자기소개
        System.out.println("안녕하세요, 저는 " + name + "입니다.");
        System.out.printf("저는 %d살 입니다.\n", age);
        System.out.printf("제가 좋아하는 게임은 %s 입니다", favoriteGame);
    }
}
