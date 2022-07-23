import java.util.Arrays;
import java.util.Scanner;

public class Java100_array_TwoArrayUserInput {
    public static void main(String[] args) {

        //사용자 입력을 위한 객체 선언
        Scanner sc = new Scanner(System.in);

        //2차원 배열의 행(가로줄)과 열(세로줄) 선언 => 사용자 입력으로 처리
        System.out.print("행의 갯수를 입력하고 [Enter] 치세요=");
        int R = sc.nextInt(); //정수를 입력받는 메서드
        System.out.print("열의 갯수를 입력하고 [Enter] 치세요=");
        int C = sc.nextInt();

        //char 2차원 배열 선언 => 사용자로부터 R,C를 입력받아 처리 => gameMap[R][C]생성
        char[][] gameMap = new char[R][C];

        //사용자 입력을 받아서 저장할 String 배열 선언
        //=> 이때 크기를 [R](행 갯수)로 해주도록 한다. 중요!!
        //크기를 R만틈 해주면 되는 이유 => 사용자가 입력하는 값은 안쪽 for 반복문을 돌면서 2차원 배열에 입력하기 때문.
        String [] strAr = new String[R];

        //2차원 배열 요소 => 사용자가 입력하는 값으로 셋팅
        for(int i=0;i<R;i++){
            System.out.print((i+1)+"번째 행에 입력할 문자 "+C+"개를 차례대로 입력하고 [Enter] 치세요=");
            strAr[i] = sc.next();
            for(int j=0;j<C;j++){
                gameMap[i][j] = strAr[i].charAt(j); //j 인덱스에 있는 값을 하나씩 가져와서 gameMap 좌표에 셋팅
            }
        }

        System.out.println(strAr);
        System.out.println(strAr[0]);
        System.out.println(strAr[1]);
        System.out.println("------------------------------");

        //2차원 배열에 들어있는 값 출력
        for(int i =0;i<R;i++){
            for(int j=0;j<C;j++){
                System.out.print(gameMap[i][j]);
            }
            System.out.println();
        }
    }
}
