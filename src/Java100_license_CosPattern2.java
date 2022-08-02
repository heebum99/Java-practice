public class Java100_license_CosPattern2 {
    public static void main(String[] args) {

        //while 반복문과 continue를 사용해 1~30까지 짝수만 출력

        //변수 선언
        int number=1;

        //반복문을 돌면서 홀수인지 체크 -> 홀수면 continue
        while(number<=30){
            if(number%2!=0){
                number++; //증감식이 빠지면 무한루프에 빠짐.
                continue;
            }
            System.out.print(number+" ");
            number++;
        }
    }
}
