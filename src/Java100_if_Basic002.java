public class Java100_if_Basic002 {
    public static void main(String[] args) {

        //변수 선언
        int kor=80,eng=90,math=100;

        //if ~else 조건문 사용하기
        if(eng>90){ //조건식에 포함되는 블록이 2줄 이상일때는 {} 생략 불가!!
            System.out.println("A학점 입니다.");
            System.out.println("축하합니다.");
        }
        else{
            System.out.println("90점 미만입니다.");
        }

    }
}
