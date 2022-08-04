import java.util.Arrays;

public class Java100_license_SolutionVoteSortMax {
    public static void main(String[] args) {
        //반복문 사용없이 정렬함수 sort()를 이용해 최대, 최솟값 구하기.

        //정수형 배열 선언
        int[] vote_box = {4, 7, 5, 9, 3, 6, 8};

        //오름차순 정렬
        Arrays.sort(vote_box);

        //출력
        System.out.println(Arrays.toString(vote_box)); //[3,4,5,6,7,8,9]

        //최솟값, 최댓값
        System.out.println("최솟값 = "+vote_box[0]); //3
        System.out.println("최댓값 = "+vote_box[vote_box.length-1]); //9
    }
}

