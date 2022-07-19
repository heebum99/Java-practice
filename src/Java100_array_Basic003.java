public class Java100_array_Basic003 {
    public static void main(String[] args) {

        //배열 선언
        int [] sales_table = new int [5];

        //선언한 배열 공간에 값 입력하기
        sales_table[0] = 3;
        sales_table[1] = 11;
        sales_table[2] = 22;
        sales_table[3] = 33;
        sales_table[4] = 44;
        //{3,11,22,33,44}

        //값 출력
        System.out.println(sales_table[0]);
        System.out.println(sales_table[1]);
        System.out.println(sales_table[2]);
        System.out.println(sales_table[3]);
        System.out.println(sales_table[4]);
        System.out.println(sales_table[sales_table.length-1]); //sales_table[4]와 똑같음.
    }
}
