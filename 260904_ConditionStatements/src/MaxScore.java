public class MaxScore {
    public static void main(String[] args) {
        int[] scores = {90, 85, 77, 92, 68};
        int max = scores[0];

        // for(int i = 1; i < scores.length; i++){
        //     if (scores[i] _____ max){
        //         max = _________;
        //     }
        // }
        //빈칸 1 : > 현재 scores[i]가 현재 max 보다 큰지 확인해야하기 때문.
        // 빈칸 2 : scores[i] 이유-> 현재 인덱스에 있는 scores 값이 현재 max 값보다 더 크면 그 scores[i] 값을 max로 지정해야하기 떄문.
        // 최대 점수를 구할려고 하니 ^^
        for(int i = 1; i < scores.length; i++){
            if (scores[i] > max){
                max = scores[i];
            }
        }
        System.out.println("최대값: " + max);
    }
}
