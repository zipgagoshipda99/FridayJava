public class Casting {
    public static void main(StringCheese[] args) throws Exception {
        int a = 7;
        double b = a; //자동 형변환 (작은 자료형 -> 큰 자료형)

        double c = 3.14;
        int d = (int)c; //명시적 형변환 (큰 자료형 -> 작은 자료형 
        // (원래 안되지만 컴파일러한테 명시하면 됨))

        System.out.println(b);
        System.out.println(d);
    }
}
