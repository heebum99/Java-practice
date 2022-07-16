public class Java100_operator_ArithmeticOperators {
    public static void main(String[] args) {

        //수치 연산자 -->+,-,*,/(몫),%(나머지 연산자)
        int a,b;
        a=60;b=8;

        System.out.println(a+b);
        System.out.println("a+b="+a+b); //문자열+정수+정수 => a+b=608
        System.out.println("a+b="+(a+b)); //a+b=68
        System.out.println("a-b"+(a-b)); //a-b=52
        System.out.println("a*b"+(a*b)); //a*b=480
        System.out.println("a/b="+(a/b)); //a/b=7
        System.out.println("a%b="+(a%b)); //a%b=4
    }
}
