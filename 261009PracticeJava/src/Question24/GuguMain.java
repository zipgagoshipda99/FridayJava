package Question24;

public class GuguMain {
    public static void main(String[] args) {
        // 3단 구구단 반복문으로 출력
        // for (int i = 1; i < 10; i++) {
        //     System.out.println(3 * i);
        // }
        GuguMain.TimesTable(3);
    }

    public static void TimesTable(int num) {
        for (int i = 1; i < 10; i++) {
            System.out.print(num * i);
            if(i < 9){
                System.out.print(", ");
            }
        } 
    }
}
