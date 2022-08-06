import java.util.ArrayList;
import java.util.Arrays;

public class Java100_collection_FrameworkArrayListTwoArr {
    public static void main(String[] args) {

        //객체 생성
        ArrayList<Integer []> arr = new ArrayList<Integer []>(); //정수형 배열

        //요소 추가 -> add()
        arr.add(new Integer[] {11,12,13,14});
        arr.add(new Integer[] {21,22,23,24});
        arr.add(new Integer[] {31,32,33,34});
        arr.add(new Integer[] {41,42,43,44});

        //요소 출력
        for(int i=0;i< arr.size();i++){
            System.out.println(arr.get(i)[0]); //11,21,31,41 => 배열의 첫번째 값 출력
        }

        //전체 요소 출력 -> 이중 반복문
        //size(), length(), length 차이점
        //size -> 컬렉션 프레임워크 타입의 길이를 구할 때 사용
        //length() -> 문자열의 길이를 구할때 사용
        //length -> 배열의 길이를 구할때 사용
        for(int i=0;i<arr.size();i++){
            for(int j=0;j<arr.get(i).length;j++){
                System.out.print(arr.get(i)[j]+" ");
            }
            System.out.println();
        }

        //전체 요소 출력
        for(int i=0;i< arr.size();i++){
            System.out.println(Arrays.toString(arr.get(i)));
        }

    }
}
