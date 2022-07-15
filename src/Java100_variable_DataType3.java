public class Java100_variable_DataType3 {
    public static void main(String[] args) {

        short a ='A'; //정수형으로 문자형 A를 초기화
        System.out.println(a); //A에 해당되는 아스키 값 65 출력
        //아스키 값 A=65 ~ Z=90, a=97 ~ z=122

        short b = 90;
        System.out.println((char)b);
        //90을 문자형으로 형변환을 하게되면 아스키 값 90에 해당되는 문자 Z를 출력.

        char c = 'a';
        System.out.println((short)c);
    }
}
