public class Java100_array_Basic006 {
    public static void main(String[] args) {

        //정수형과 실수형 배열 변수 선언
        int [] ar;
        ar = new int[] {3,3,3,3,4};
        double [] ar2 = {9.8,2.45,5.98,5.11,3.14};

        //마지막 배열 요소 값 출력
        System.out.println(ar[ar.length-1]); //4
        System.out.println(ar2[ar2.length-1]); //3.14

        //배열명 자체를 출력 => 주소 값 => I:정수형 배열, D:실수형 배열을 의미
        System.out.println(ar);
        System.out.println(ar2);
    }
}
