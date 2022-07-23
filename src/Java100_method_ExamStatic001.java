public class Java100_method_ExamStatic001 {

    public static void helloWorld(){ //main에서 호출하기 위해 static으로 선언
        System.out.println("Hello, World~");
    }

    public static void main(String[] args) {

        //메서드 호출 => main은 static 메서드이기 때문에 static 메서드만 호출 가능.
        helloWorld();
    }
}
