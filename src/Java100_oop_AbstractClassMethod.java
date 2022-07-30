abstract class Animal{ //추상클래스는 명시적으로 abstract 키워드를 사용.
    //구체적인 내용 작성x, 공통적인 특징을 추상적으로 선언, 메서드명만 선언
    abstract void cry(); //추상 메서드
    void eat(){
        System.out.println("먹다.");
    }

}

class Dog extends Animal{ //추상 클래스 상속
    void cry(){ //부모 클래스의 메서드를 오버라이딩
        System.out.println("멍멍~"); 
    }
}

class Cat extends Animal{
    void cry() {
        System.out.println("야옹야옹~");
    }
}

class Cow extends Animal{
    void cry(){
        System.out.println("음메~");
    }
}

class Animal2{
    void fly(){
        System.out.println("날다.");
    }
}

public class Java100_oop_AbstractClassMethod {
    public static void main(String[] args) {

        //추상 클래스는 구체적인 내용이 없기에 객체 생성x
        //Animal dog = new Animal(); => 추상 클래스기 때문에 에러 발생

        Animal2 dragonfly = new Animal2();
        dragonfly.fly();

        //추상 클래스 사용 => 상속을 받아서 사용
        //추상 클래스를 상속받은 자식 클래스에서 해당 메서드를 오버라이딩해 재정의 후 사용.
        Dog dog = new Dog();
        dog.cry();

        Cat cat = new Cat();
        cat.cry();

        Cow cow = new Cow();
        cow.cry();
    }
}

