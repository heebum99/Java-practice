public class Java100_method_Exam003 {

    public static int returnMethod(){ //반환값이 있으므로 return 필요.
        int res = 100;
        res *= 100;
        return res;
    }
    public static void main(String[] args) {

        //반환값 o, 인자값 x
        //반환값이 있다는 것 => 함수 호출시 리턴값을 받는 변수를 정의한다.
        int res;
        res = returnMethod();

        //출력
        System.out.println("메서드 호출에 따른 리턴된 값은 = "+res);
    }
}
