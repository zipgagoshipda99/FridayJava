public class ArrayExam {
    public static void main(String[] args) {
        int[][] numbers = 
        //int[행][열]
        {
            {1,2,3,4}, 
            {5,6,7}, 
            {8,9,10},
            {11,12,13, 67, 77},
            {14,15,16},
            {17,18,19},
        };
        int rows = numbers.length;
        for (int i=0; i< rows; i++){
            System.out.println(i + "행 열의 수: " + numbers[i].length);
        }
    }
}
