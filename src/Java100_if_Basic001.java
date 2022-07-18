public class Java100_if_Basic001 {
    public static void main(String[]args){

        //변수 선언
        int kor=80, eng=90, math=100;

        //if 조건문 사용
        if(kor>=80){ //if 조건문에서 {}를 사용하지 않아도 되는 경우가 있다.
            System.out.println("당신의 국어점수는 B 학점입니다.");
        }
        System.out.println("학점이 안나왔다면 80점 미만입니다.");
    }
}
