public class Java100_method_MethodCall002 {

    public static void sum(Integer a){
        System.out.println(a); //Wrapper클래스를 사용해도 주소값이 아닌 a의 값 100이 출력됨.
    }
    public static void main(String[] args) {

        //변수 선언 및 메서드 호출
        //new => 객체 생성 후 주소 값을 리턴해준다.
        Integer a = new Integer(100);
        //Wrapper클래스의 Integer클래스 타입으로 변수 a를 선언
        sum(a);

        //출력
        System.out.println(a);
    }
}
