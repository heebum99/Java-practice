public class Java100_if_ThreeOperator {
    public static void main(String[] args) {

        //변수 선언
        int hour =12;

        //삼항 연산자 테스트, ex)조건식 ? true : false
        int test = hour <= 10 ? hour*100:hour;
        //10보다 작거나 같으면 100을 곱하시오.
        System.out.println(test);

        //삼항 연산자 => 12시 보다 작으면 오전, 크면 오후 출력
        String ampm = hour < 12 ? "오전" : "오후";
        System.out.println(ampm);

        //삼항 연산자 결과 값을 변수로 설정가능 
        String str1 = "오전";
        String str2 = "오후";

        ampm = hour < 12 ? str1 : str2;
        System.out.println(ampm);
    }
}
