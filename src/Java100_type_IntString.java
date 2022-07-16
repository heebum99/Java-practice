public class Java100_type_IntString {
    public static void main(String[] args) {

        //정수 선언
        int a =12345;
        String str = "12345";

        System.out.println(str.length()); //문자열 자릿수 구하기
        //a는 문자열이 아닌 정수이기 때문에 .length()를 통해 자릿수를 구할 수 없음.

        //정수 --> 문자열 변환 --> 자릿수 구하기
        String stra = String.valueOf(a); //String.valueOf() => 문자열로 변환

        System.out.println(stra); // 정수가 아닌 문자열로 출력
        System.out.println(stra.length());

        //문자열+정수형
        System.out.println(12345+1); //정수+정수 => 12346
        System.out.println(str+1); //문자열+정수 => 123451
        
        //문자열 --> 정수로 변환
        int b = Integer.valueOf(str); //Integer.valueOf() => 정수로 변환
        System.out.println(b+1); //12346

        System.out.println("문자열-->정수 변환 "+b+1);
        //문자열+정수+정수 => 123451 출력
        System.out.println("문자열-->정수 변환 "+(b+1));
        //()먼저 계산, 정수+정수 => 12346
    }
}
