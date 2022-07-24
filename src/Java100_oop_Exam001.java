class FarmMachine {

    //--속성--
    int price; //가격
    int year; //연식
    String color; //색상

    //--동작(기능)--
    void move() {
        System.out.println("Farm-machine is moving.");
    }

    void dig(){
        System.out.println("Farm-machine is digging.");
    }

    void grind(){
        System.out.println("Farm-machine is grinding.");
    }
}
public class Java100_oop_Exam001 {
    public static void main(String[] args) {

        //객체(참조형) 생성
        FarmMachine fm = new FarmMachine(); //new => 메모리 공간에 객체 생성 + 주소 값 리턴
        System.out.println(fm); //객체의 주소값 출력

        //생성된 객체에 속성 값 입력
        fm.price = 1000000;
        fm.year = 2020;
        fm.color = "red";

        //속성 값 출력
        String fm_price = String.format("%,d",fm.price); // %,d => 정수 값을 화폐단위로 표기(1000단위 마다 ,콤마로)
        System.out.println(fm.price);
        System.out.println(fm_price);
        System.out.println(fm.year);
        System.out.println(fm.color);

        //동작 수행하기
        fm.move();
        fm.dig();
        fm.grind();
    }
}
