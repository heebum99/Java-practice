abstract class Car2{
    abstract void run();
}

class Ambulance2 extends Car2{
    void run(){
        System.out.println("엠블런스 지나가요~ 삐뽀삐뽀~");
    }
}

class Cultivator2 extends Car2{
    void run() {
        System.out.println("경운기 지나가요~ 덜컹덜컹~");
    }
}

class SportsCar2 extends Car2{
    void run(){
        System.out.println("스포츠카 지나가요~ 씽~");
    }
}
public class Java100_oop_Polymorphism3 {
    public static void main(String[] args) {

        //배열 길이가 3인 Car 객체 배열 선언
        Car2 [] cars = new Car2[3];
        System.out.println(cars[0]); //null
        
        //cars 배열 초기화
        cars = new Car2[] {new Ambulance2(),new Cultivator2(),new SportsCar2()};

        System.out.println(cars[0]);
        System.out.println(cars[1]);
        System.out.println(cars[2]);

        //자식 클래스로 객체 생성 -> 타입은 부모 타입으로 -> 바로 배열 초기화
        Car2 [] cars2 = {new Ambulance2(),new Cultivator2(),new SportsCar2()};

        //반복문 돌면서 각 객체의 run() 메서드 호출
        for(int i=0;i<cars2.length;i++){
            System.out.println(cars2[i]);
            cars2[i].run();
        }
        System.out.println("----------------------------");

        //향상된 for문
        for(Car2 obj:cars2){
            System.out.println(obj);
            obj.run();
        }
    }
}
