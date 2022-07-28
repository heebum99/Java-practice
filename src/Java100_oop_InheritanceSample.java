class Person2{ //부모 클래스
    //필드
    int gender;
    int power;

    //생성자
    Person2(){
        this.gender = 1; //1:남성, 2:여성
        this.power = 100; //기본파워
    }

    //메서드
    void walk(){
        System.out.println("걸어가고 있어요~");
    }
}

class Hero extends Person2{
    //필드
    String name;
    int age;

    //생성자
    Hero(){} //인자값이 없는 생성자
    Hero(String name, int age){ //인자값이 2개인 생성자
        //자식클래스의 생성자가 실행되기전에 부모클래스의 생성자가 먼저 실행됨.
        //super(); => 명시적으로 부모클래스의 생성자를 먼저 실행하라, 아무것도 쓰지않아도 컴파일러가 자동 실행.
        this.name = name;
        this.age = age;
    }

    //메서드
    void walk(){ //오버라이딩 (재정의) => 부모클래스의 메서드를 오버라이딩 함.
        System.out.println("2배로 빨리 걸어가고 있어요~");
    }//따로 정의하지 않으면 부모클래스의 메서드를 그대로 사용.

    void eat(){
        System.out.println("밥먹고 있어요~");
    }

    void displayPerson(){
        System.out.println("이름:"+name+",나이:"+age+",성별:"+gender+",파워:"+power);
    }
}

public class Java100_oop_InheritanceSample {
    public static void main(String[] args) {

        //객체 생성
        Person2 person2 = new Person2();
        person2.walk();

        //상속을 통한 슈퍼맨 객체 생성
        Hero hero = new Hero("슈퍼맨",20);
        System.out.println(hero.name);
        System.out.println(hero.age);
        System.out.println(hero.gender); //부모 클래스 필드(변수)
        System.out.println(hero.power); //부모 클래스 필드(변수)
        hero.walk(); //메서드 오버라이딩
        hero.eat();
        hero.displayPerson();

        //원더우먼 객체 생성
        Hero hero2 = new Hero("원더우먼",30);
        hero2.displayPerson();
        hero2.gender = 2;
        hero2.power = 300;
        hero2.displayPerson();
        hero2.walk();
    }
}
