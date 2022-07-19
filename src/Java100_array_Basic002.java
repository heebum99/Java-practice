public class Java100_array_Basic002 {
    public static void main(String[] args) {

        //배열 선언 및 크기 지정
        int [] scores = new int [10]; //인덱스 0~9까지

        //선언한 배열을 인덱스로 접근해 값 출력
        System.out.println(scores[0]);
        System.out.println(scores[9]);

        int s_size = scores.length; //배열 변수의 크기
        System.out.println(s_size); 
        System.out.println(s_size-1); //맨 마지막 인덱스 번호
    }
}
