import java.util.Arrays;

public class Java100_array_Basic009 {
    public static void main(String[] args) {

        //arraycopy() 메서드 => 배열 복사
        //System.arraycopy(원본 배열명,원본 배열의 복사 시작 구간,복사 배열명,복사한 것을 덮어쓸 구간,길이);

        //배열 선언
        int[] ar = {1, 2, 3, 4, 5};
        int[] ar2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        //배열 복사하기 => System.arraycopy()
        System.arraycopy(ar,2,ar2,4,3); //1,2,3,4,3,4,5,8,9,10
        System.out.println(Arrays.toString(ar));
        System.out.println(Arrays.toString(ar2));
    }
}

