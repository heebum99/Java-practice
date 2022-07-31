class Person6{
    //필드
    String name;
    int age;
    int weight;

    //생성자
    Person6(){}
    Person6(String name, int age, int weight){
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    //메서드
    void wash(){
        System.out.println("씻다.");
    }

    void study(){
        System.out.println("공부하다.");
    }

    void play(){
        System.out.println("놀다.");
    }
}

interface Allowance{ //인터페이스에는 추상메서드만 작성가능(일반 메서드, 필드 작성x)
    //필드 => 변수는 안되나 상수는 되므로 상수로 지정해주면 된다.
    //public static final을 붙여주면 된다.
    //인터페이스 내 모든 멤버 필드(변수)는 public static final 이어야한다.(생략가능)
    public static final String aaa = "코리아";
    int bbb = 100; //public static final 생략

    //추상 메서드
    //인터페이스 내 모든 메서드는 public abstract 이어야한다.(생략가능)
    public abstract void in(int price, String name);
    void out(int price, String name); //public abstract 생략
}

interface Train{
    //추상 메서드
    abstract void train(int trainning_pay, String name);
}

class Student extends Person6 implements Allowance,Train{ //extends가 implements보다 항상 먼저 온다. => 다중상속 (,)로 구분
    //필드

    //생성자
    Student(){}
    Student(String name,int age,int weight){
        super(name,age,weight); //super()로 부모 클래스의 생성자를 인자를 넣어서 호출.
    }

    //메서드
    public void in(int price,String name){
        System.out.printf("%s에게서 %d원 용돈을 받았습니다.\n",name,price);
    }

    public void out(int price,String name){
        System.out.printf("%d원 금액을 지출했습니다. [지출용도 --> %s]\n",price,name);
    }

    public void train(int trainning_pay,String name){
        System.out.printf("[%s --> %d원 입금완료]\n",name,trainning_pay);
    }
}

public class Java100_oop_Interface {
    public static void main(String[] args) {

        //객체 생성
        Student s1 = new Student("홍길동",20,85);

        //클래스와 인터페이스로부터 상속(Person6)과 구현(Allowance,Train)을 한 메서드들 호출하기
        //상속
        s1.wash();
        s1.study();
        s1.play();
        
        //구현
        s1.in(10000,"엄마");
        s1.out(5000,"편의점");
        s1.train(50000,"아빠");

        //상수 필드 사용하기
        System.out.println(s1.aaa);
        System.out.println(s1.bbb);
        //static으로 선언한 필드이기 때문에 객체생성없이 사용가능.(클래스명.필드명)
        System.out.println(Allowance.aaa);
        System.out.println(Allowance.bbb);
    }
}
