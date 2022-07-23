public class Java100_method_Exam002 {

    public static void plusMethod(int a, int b){ //static 메서드에서 호출하므로 static 메서드로 선언
        System.out.println("인자로 넘겨받은 2개의 값은 "+a+","+b+"입니다.");
        int res = a+b;
        System.out.println("두 수를 더한 값은 = "+res+"입니다.");
    }
    public static void main(String[] args) {

        //2.반환값 x, 인자값 o
        //메서드가 받는 인자값이 있다는 것 => 호출부에서 파라미터값을 넘긴다는 뜻.
        int a=100, b=200;
        plusMethod(a,b);
    }
}
