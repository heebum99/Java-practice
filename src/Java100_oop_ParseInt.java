public class Java100_oop_ParseInt {
    public static void main(String[] args) {

        //숫자끼리 연산
        int a = 1, b = 2;
        int c = a + b;
        System.out.println("a+b="+c); //3

        //문자열끼리 연산
        String a1="1";
        String b1="2";
        String c1=a1+b1;
        System.out.println("a1+b1="+c1); //12
        System.out.println(c1.getClass().getName());

        //문자열 --> 숫자로 변환 후 연산 => Integer.parseInt()
        //parseInt() => Integer클래스의 static으로 지정 => 따라서 객체 생성없이 클래스명.메서드()로 직접 사용 가능
        int a2 = Integer.parseInt(a1);
        int b2 = Integer.parseInt(b1);
        System.out.println("a2+b2="+(a2+b2));
    }
}
