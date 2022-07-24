public class Java100_method_MethodCall001 {

    //Call by value => 값에 의한 호출
    //메서드로 인자값을 넘길 때 해당 값을 복사해 넘기는 방식
    //=> sum() 메서드 내부에서는 복사된 값을 처리.
    public static void sum(int a){
        a += 400; //a=a+400
        System.out.println(a); //500
    }
    public static void main(String[]args){

        //변수 선언 및 메서드 호출
        int a = 100;
        sum(a);

        //출력
        System.out.println(a); //100
    }
}
