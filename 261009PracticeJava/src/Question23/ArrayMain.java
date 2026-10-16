package Question23;

public class ArrayMain {
    public static void main(String[] args) {
        int intArray[] = {80, 75, 90, 60, 100};
        int total = 0;
        int average = 0;
        for (int i : intArray) {
            total += i;
        }
        average = total / intArray.length;

        System.out.println("Average : " + average);
    }
}
