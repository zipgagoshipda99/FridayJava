public class ArrayExam2 {
    public static void main(String[] args) {
        //2차원 배열 초기화 방법 중 하나
        int[][] arr = new int[5][4];
        int count = 1;
        for(int i = 0; i<arr.length; i++){//행에 길이 조건
            for(int j = 0; j<arr[i].length; j++){//열에 길이 조건
                arr[i][j] = count++;
            }
        }
        for(int i = 0; i<arr.length; i++){//행에 길이 조건
            for(int j = 0; j<arr[i].length; j++){//열에 길이 조건
                //System.out.print(arr[i][j] + " ");
                System.out.printf("%3d", arr[i][j]);
            }
        }
    }   
}
