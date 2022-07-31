class Person7{
    String str1 = "난 부모 클래스";
    void method1(){
        System.out.println("에이에이에이");
    }
    void ppp(){
        System.out.println("ppp");
    }
}

class Student2 extends Person7{
    String str2 = "난 자식 클래스";
    void method1(){
        System.out.println("오버라이딩 - AAA");
    }
    void sss(){
        System.out.println("sss");
    }
    void x(){
        method1(); //오버라이딩 된 자식 클래스의 메서드를 호출
        super.method1(); //부모 클래스의 원본 메서드를 호출
    }
}

public class Java100_oop_Polymorphism {
    public static void main(String [] args){

        //객체 생성 --> 자식 클래스의 객체 -> 자식의 타입으로 생성
        //부모 + 자식 클래스의 모든 자원을 다 쓸 수 있다.
        Student2 s1 = new Student2(); //가능
        System.out.println(s1.str1);
        System.out.println(s1.str2);
        s1.method1(); //오버라이딩된 method1()이 호출됨.
        // 부모 클래스의 원본 메서드를 호출하려면 super 키워드 사용.
        s1.x();
        s1.sss();
        s1.ppp();

        //객체 생성 --> 자식 클래스의 객체 -> 타입은 부모의 타입으로 생성
        //부모의 자원만 쓸 수 있다.
        Person7 s2 = new Student2(); //가능
        System.out.println(s2.str1);
        //System.out.println(s2.str2); => 자식 클래스의 자원은 쓸 수 없다 => 에러 발생
        s2.ppp();
        //s2.sss(); => 자식 클래스의 자원이므로 에러 발생.
        //자식의 메서드를 바로 호출하고 싶다면 캐스트 필요
        ((Student2)s2).sss(); //캐스트
        s2.method1(); //오버라이딩 - AAA => 오버라이딩한 메서드는 자식의 메서드로 실행된다.


        //객체 생성 --> 부모 클래스의 객체 -> 타입은 부모의 타입으로 생성
        //부모의 자원만 쓸 수 있다.
        Person7 p1 = new Person7(); //가능
        p1.method1(); //에이에이에이
        //p1.sss(); => 에러발생

        //객체 생성 --> 부모 클래스의 객체 -> 자식의 타입으로 생성
        //Student2 p2 = new Person7(); => 불가능 => 에러 발생
    }
}
