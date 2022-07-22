import java.util.Arrays;

public class Java100_array_OneTwoArray {
    public static void main(String[] args) {

        //String 1차원 배열 --> 3개의 문자열을 담을 수 있는 배열 생성
        //String 타입의 참조 변수 3개를 저장하기 위한 공간 생성 => 기본값 null로 초기화
        String [] province = new String [3];
        System.out.println(province[0]); //null출력

        //String 배열 직접 초기화
        province[0] = "강원도";
        province[1] = "전라도";
        province[2] = "경상도";
        System.out.println(province[0]);
        System.out.println(province[1]);
        System.out.println(province[2]);

        //String 배열 초기화 => 배열 선언 및 생성시 {}로 동시에 초기화
        String [] nation = new String [] {"한국","미국","중국"};
        System.out.println(Arrays.toString(nation));

        String [] flower = {"무궁화","해바라기","개나리"};
        //반복문을 사용해 배열값 모두 출력
        for(int i=0;i<flower.length;i++){
            System.out.print(flower[i]+" ");
        }
        System.out.println();

        //향상된 for문으로 배열 요소 출력
        for(String s:nation){
            System.out.print(s+" ");
        }
    }
}
