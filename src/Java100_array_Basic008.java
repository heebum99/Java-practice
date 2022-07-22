import java.util.Arrays;

public class Java100_array_Basic008 {
    public static void main(String[] args) {

        //다중 배열 선언 1번 방식
        int [] a,b,c;

        //2번 방식
        int d[],e[],f[];


        int g[],h,i; //g는 정수형 배열, h,i는 정수형 변수

        //배열 사용이 가능한지 체크
        a = new int[3];
        b = new int[3];
        c = new int[3];
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(c));

        d = new int[6];
        e = new int[6];
        f = new int[6];
        System.out.println(Arrays.toString(d));
        System.out.println(Arrays.toString(e));
        System.out.println(Arrays.toString(f));

        g = new int[9];
        //h = new int[9]; => 배열이 아닌 변수이기 때문에 에러 발생
        //i = new int[9]; => 배열이 아닌 변수이기 때문에 에러 발생
        System.out.println(Arrays.toString(g));



    }
}
