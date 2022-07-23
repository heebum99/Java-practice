import java.util.Locale;

public class Java100_method_Exam004 {

    public static String capitalMethod(String param){
        String res=param.toUpperCase(); //소문자->대문자로 바꿔주는 함수
        return res;
    }
    public static void main(String[] args) {

        //반환값 o, 인자값 o
        String res; //문자열 변수 선언
        res = capitalMethod("korea");

        //출력
        System.out.println("입력한 소문자의 대문자는 = "+res);
    }
}
