public class Java100_variable_DataType2 {
    public static void main(String[] args) {

        //기본형 타입 (8개) 변수 선언과 동시에 초기화
        byte b = 100;
        short s = 30000;
        int i = 210000;
        long l = 700000l; //long 타입 뒤에는 L을 붙여야한다.
        float f = 9.8f; //float 타입 뒤에 F를 붙여야한다.
        double d = 3.14;
        char c = 'A';
        boolean bl = false; //true 나 false로 입력해줘야한다.
        //각 타입의 범위값을 넘어가게 되면 에러 발생

        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(c);
        System.out.println(bl);
    }
}
