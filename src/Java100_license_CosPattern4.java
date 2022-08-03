import java.util.Scanner;

public class Java100_license_CosPattern4 {
    public static void main(String[] args) {

        //2차원 배열의 행과 열 선언
        int R=5, C=5;

        //char 2차원 배열 선언 및 요소 값 입력 셋팅
        char[][] ar = new char[][]{
                {'□','□','□','□','□'},
                {'□','□','□','□','□'},
                {'□','□','★','□','□'},
                {'□','□','□','□','□'},
                {'□','□','□','□','□'},
        };

        //2차원 배열에 들어있는 요소값들을 출력 -> 반복문
        for(int i=0;i<R;i++){
            for(int j=0;j<C;j++){
                System.out.print(ar[i][j]+" ");
            }
            System.out.println();
        }
    }
}
