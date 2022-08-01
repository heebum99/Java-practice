import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Java100_algorithm_SortAlgorithmWithMethod2 {
    public static void main(String[] args) {

        //배열 선언 -> 성적 배열
        //내림차순으로 정렬 조건을 설정하려면 기본형의 배열에는 적용이 안되므로 래퍼 클래스로 만들어서 적용.
        Integer[] scores = {88, 55, 33, 100, 90, 99, 77, 66}; //내림차순 적용을 위해 int가 아닌 래퍼 클래스(Integer)로 적용

        //성적 배열 -> 내림차순 정렬 -> Arrays.sort() -> 추가 옵션 설정이 필요.
        //Collections 클래스의 reverseOrder() 메서드 사용
        System.out.println("--정렬 하기 전--");
        for (int i = 0; i < scores.length; i++) {
            System.out.print(scores[i] + " ");
        }
        System.out.println();

        //내림차순 정렬
        Arrays.sort(scores, Collections.reverseOrder());
        System.out.println("--정렬 한 후--");
        for (int i = 0; i < scores.length; i++) {
            System.out.print(scores[i] + " ");
        }
        System.out.println();

        //향상된 for문 사용
        for(int i:scores){
            System.out.print(i+" ");
        }
    }
}

