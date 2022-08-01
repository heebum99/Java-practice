class Person8{

}

class Batman extends Person8{

}

class Human{

}

class Superman extends Human{

}

public class Java100_oop_Polymorphism4 {
    public static void main(String[] args) {

        //객체 배열에서 다형성을 사용하지 못한다면....
        Person8[] persons = new Person8[10]; //Person 전용
        persons[0] = new Person8();
        persons[1] = new Person8();
        persons[2] = new Batman(); //다형성 사용

        Batman [] batmen = new Batman[10]; //Batman 전용
        batmen[0] = new Batman();
        batmen[1] = new Batman();

        //객체 배열에서 다형성을 사용
        Human [] humans = new Human[10];
        humans[0] = new Human();
        humans[1] = new Superman(); //다형성 사용 => 자식 클래스의 객체에 부모 타입으로

        //매개 변수의 다형성
        //함수나 메서드를 호출할때 그에 맞는 적절한 파라미터를 보내줘야 한다.
        //System.out.println() 메서드의 경우 어떤 타입, 객체를 매개변수로 받더라도 에러없이 값을 출력 => 다형성을 활용하고 있기 때문
        //public void println(Object x)로 되어있기 때문에 어떤 객체 타입이 전달되도 에러없이 출력 가능
        System.out.println(new Person8());
        System.out.println(new Batman());
        System.out.println(new Human());
        System.out.println(new Superman());
    }
}
