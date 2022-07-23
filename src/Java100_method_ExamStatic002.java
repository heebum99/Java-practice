public class Java100_method_ExamStatic002 {

    public void helloWorld(){ //static으로 선언하지 않고 사용 => 객체 생성
        System.out.println("Hello, World~");
    }

    public static void main(String[] args) {

        //메서드 호출
        //helloWorld(); => main 메서드는 static 메서드만 호출할 수 있기때문에 에러 발생.

        //객체 생성 후 메서드 호출
        Java100_method_ExamStatic002 jes = new Java100_method_ExamStatic002();
        jes.helloWorld();
    }
}
