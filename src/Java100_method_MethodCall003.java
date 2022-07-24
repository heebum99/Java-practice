class TestNumber{
    int num;
    TestNumber(int num){this.num=num;} //생성자 => 클래스가 호출될때 가장 먼저 실행되는 부분
    //this.num의 num은 TestNumber 클래스의 변수 num, 그 뒤의 num은 매개 변수 num의 num
}
public class Java100_method_MethodCall003 {

    //Call by reference => 주소에 의한 호출
    //원본 값에 영향을 준다.
    public static void sum(TestNumber a){
        //a.num => 객체 a의 값
        a.num += 400; //100+400 => 500
        System.out.println(a); //주소 값 출력
        System.out.println(a.num); //a의 값인 500 출력
    }
    public static void main(String[] args) {

        //객체 변수 선언
        TestNumber a = new TestNumber(100); //new -> 객체 생성 후 객체 a에 주소 값을 넘긴다.
        sum(a);

        System.out.println("-------------------");
        System.out.println(a.num); //sum()메서드에서 a값을 500으로 바꿔줬기에 500이 출력
    }
}
