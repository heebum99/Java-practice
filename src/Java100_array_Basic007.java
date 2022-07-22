import java.util.Arrays;
public class Java100_array_Basic007 {
    public static void main(String[] args) {

        //배열 선언
        int [] ar = {238,483,239,442,487,239,873};

        //toString() 메서드 사용
        System.out.println(Arrays.toString(ar)); //[]괄호의 형태로 배열 표시를 보여주며 출력.
        System.out.println(ar[0]);

        //for 반복문
        for(int i=0; i<ar.length;i++){ //[] 괄호없이 값만 출력됨
            System.out.print(ar[i]+" ");
        }
    }
}
