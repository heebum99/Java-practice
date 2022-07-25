class Person{
    //속성
    int age;
    String name;

    //생성자 => 생성자명 = 클래스명
    //생성자는 오버로딩이 가능하다
    Person(){} //default 생성자(인자값x)

    Person(int age, String name){
        //인자값 o 생성자
        this.age = age; //this = self => 객체 자신을 의미
        this.name = name;
    }

    //메서드
    void printPerson(){
        System.out.println("나이:"+age+",이름:"+name);
    }
}
public class Java100_oop_Exam002 {
    public static void main(String[] args) {

        //객체 생성
        Person p1 = new Person(); //new 키워드로 객체가 생성될때 생성자 자동 호출 => 인자 값이 없으므로 default 생성자 호출
        Person p2 = new Person(20,"홍길동"); //인자값 2개인 생성자인 2번 생성자가 호출됨.

        System.out.println(p2);
        System.out.println(p2.age); //20
        System.out.println(p2.name); //홍길동
        p2.printPerson();

        Person p3 = new Person(30,"이순신");
        p3.printPerson();

        Person p4 = new Person(40,"을지문덕");
        p4.printPerson();
    }
}
