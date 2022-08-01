import java.util.Arrays;

public class Java100_algorithm_SortAlgorithmWithMethod {
    public static void main(String[] args) {

        //배열선언 -> 성적배열
        int[] scores = {88, 55, 39, 100, 90, 100, 98, 67};

        //성적배열 -> 오름차순 정렬 -> Arrays.sort(배열명); -> 오름차순이 기본정렬
        System.out.println("--정렬하기 전--");
        for (int i = 0; i < scores.length; i++) {
            System.out.print(scores[i] + " ");
        }
        System.out.println();

        Arrays.sort(scores);
        System.out.println("--정렬한 후--");
        for (int i = 0; i < scores.length; i++) {
            System.out.print(scores[i] + " ");
        }
        System.out.println();

        //향상된 for문 사용
        for(int i:scores){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
