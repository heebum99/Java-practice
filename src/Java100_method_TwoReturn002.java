import java.util.Arrays;
import java.util.Locale;

public class Java100_method_TwoReturn002 {

    //소문자는 대문자로, 대문자는 소문자로 출력되는 코드 구현
    public static String [] capitalMethod(String a, String b){
        String a_ = a.toUpperCase(); //소문자 => 대문자 변환
        String b_ = b.toLowerCase(); //대문자 => 소문자 변환
        String [] res ={a_,b_}; //문자열 배열 생성
        return res; //문자열 배열로 리턴
    }
    public static void main(String[] args) {

        //반환값 o, 인자값 o
        String [] res = capitalMethod("korea","USA");

        //출력
        System.out.println(res); //배열명 자체는 주소 값 출력
        System.out.println(res[0]+", "+res[1]); //KOREA, usa
        System.out.println(Arrays.toString(res));
    }
}
