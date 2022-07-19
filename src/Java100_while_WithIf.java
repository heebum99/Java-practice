public class Java100_while_WithIf {
    public static void main(String[] args) {

        //변수 선언
        int number = 1;

        //while 반복문 => 1~30 중 짝수 출력
        while(number<=30){
            if((number%2==0)){ //나머지 연산자%를 이용해 짝수만 출력
                System.out.println(number);
            }
            number++;
        }
    }
}
