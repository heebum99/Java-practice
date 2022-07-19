public class Java100_array_Basic001 {
    public static void main(String[] args) {

        //배열 선언 및 크기 지정 첫 번째 방식
        int [] sales_table = new int[4]; //정수형 sales_table 배열에 4개의 배열 공간이 생성

        //두 번째 방식
        double sales_table2[];
        sales_table2 = new double[100]; //실수형 sales_table2 배열에 100개의 배열 공간 생성

        //선언된 배열 사용
        System.out.println(sales_table[0]); //인덱스 번호는 0부터 시작
        System.out.println(sales_table2[0]);
        //배열의 모든 값들이 0, 0.0으로 자동 초기화.
    }
}
