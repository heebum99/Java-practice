import java.util.Arrays;

public class Java100_method_TwoReturn001 {

    public static int [] testMethod(){
        int num1 = 100, num2 = 200;
        //return num1, num2; => 이런 방식으로 2가지를 리턴하는 것은 불가능 => 배열 형태로 넘겨준다.
        return new int [] {num1,num2};
    }
    public static void main(String[] args) {

        //배열 변수 선언 => 메서드로부터 반환받을 값이 배열이기 때문
        int [] res = testMethod();

        //출력
        System.out.println(res); //res는 참조 변수, 배열명 자체는 => 주소 값 출력
        System.out.println(res[0]+", "+res[1]);
        System.out.println(Arrays.toString(res)); //반복문 사용 없이 배열의 모든 값 출력 => Arrays.toString()메서드
    }
}
