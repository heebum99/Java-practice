public class Java100_method_Exam001 {

    public static void showMenu(){ //main에서 호출했기 때문에 static 메서드로 선언
        System.out.println("showMenu() 메서드가 호출되었습니다.");
    }
    public static void main(String[] args) {

        //1.반환값 x, 인자값 x
        showMenu(); //반환x => void, 인자x => ()안에 아무것도 x

    }
}
