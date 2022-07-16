public class Java100_operator_ArithmeticOperators3 {
    public static void main(String[] args) {

        //연산의 결과 --> 정수끼리 나누기의 경우에도 소숫점 형태가 나올 수 있음.
        int a=60,b=8;
        int rst1;
        double rst2,rst3,rst4;

        rst1=a/b;
        System.out.println(rst1); //7.5가 아닌 7이 출력(타입이 정수형이기 때문)
        System.out.println((double)rst1); //7.5가 아닌 7.0이 출력(정수 7을 실수로 형태로 바꿔줬기 때문)

        rst2=a/b;
        System.out.println(rst2); //위의 (double)rst1과 차이가 없음.
        //7.5가 나오기 위해서 정수형 변수 a,b 중 어느 한쪽의 값을 double로 바꿔줘야함.

        rst2=(double)a/b; // a/(double)b와 동일
        System.out.println(rst2); //7.5

        rst3=100/3;
        System.out.println(rst3); //33.0

        rst4=(double)100/3; // 100/3.0으로 해도 동일.
        System.out.println(rst4); //33.33333....

        rst4=250/3.0;
        System.out.println("세 과목의 평균은 "+rst4+"입니다.");
    }
}
