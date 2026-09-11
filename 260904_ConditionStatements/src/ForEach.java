public class ForEach {
    public static void main(String[] args) {
        int scores[] = new int[]{67, 100, 99};
        int studentCount = 0;
        for(int score : scores){
            studentCount++;
            System.out.printf("%d째 학생 점수 : %d", studentCount, score);
        }
    }
}
