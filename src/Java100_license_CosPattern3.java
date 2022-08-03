public class Java100_license_CosPattern3 {
    public static void main(String[] args) {

        //이중 반복문
        for(int i=0;i<=3;i++){
            for(int j=0;j<10;j++){
                //출력값
                int output = i*10+j;
                
                //홀수, 짝수 구분
                if(output%2!=0) { //홀수면 아래 코드는 실행하지않고 continue에 의해 안쪽 반복문으로 이동
                    continue;
                }
                else { //짝수면 출력
                    System.out.print(output + " ");
                }
            }
            System.out.println();
        }

        //각 열의 1행의 값만 출력 => 0, 10, 20, 30
        outerloop: //j가 1이면 여기로 이동.
        for(int i=0;i<=3;i++){
            for(int j=0;j<10;j++){
                int output = i*10+j;

                if(output%2!=0) {
                    if(j==1){ //j가 1이면 outerloop label이 선언된 바깥쪽 반복문으로 이동.
                        System.out.println();
                        continue outerloop; //continue label
                    }
                    continue;
                }
                else { //짝수면 출력
                    System.out.print(output + " ");
                }
            }
            System.out.println();
        }
    }
}
