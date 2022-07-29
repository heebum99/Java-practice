class Person3{ //부모 클래스
    //필드
    //접근제한자 private으로 설정해두면 외부에서 함부로 필드에 접근해 수정,변경 불가 => 클래스 내에서만 가능.
    //그래서 getter, setter가 필요.
    private String name;
    private int age;
    private int height;
    private int weight;

    //생성자
    Person3(){}
    Person3(String name, int age, int height, int weight){
        this.name=name;
        this.age=age;
        this.height=height;
        this.weight=weight;
    }

    //메서드
    public void move(){
        System.out.println("이동중...");
    }

    //getter, setter 작성
    public void setName(String name){ //필드 name의 setter
        this.name = name;
    }

    public String getName(){ //필드 name의 getter
        return name;
    }

    public void setAge(int age){ //필드 age의 setter
        this.age = age;
    }

    public int getAge(){ //필드 age의 getter
        return age;
    }

    public void setHeight(int height){ //필드 height의 setter
        this.height=height;
    }

    public int getHeight(){ //필드 height의 getter
        return height;
    }

    public void setWeight(int weight){ //필드 weight의 setter
        this.weight = weight;
    }

    public int getWeight(){ //필드 weight의 getter
        return weight;
    }
}

class Villain extends Person3{ //자식 클래스
    //필드
    private String unique_key;
    private int weapon; //1~9 숫자로 무기 분류 => 1:창, 2:방패, 3:총 ....
    private double power;

    //생성자
    Villain(){}
    Villain(String name, int age, int height, int weight, String unique_key, int weapon, double power){
        super(name, age, height, weight); //입력받은 인자값들을 부모 클래스의 생성자 인자값으로 전달 후 호출
        this.unique_key=unique_key;
        this.weapon=weapon;
        this.power=power;
    }
    //메서드
    public void printPerson(){
        System.out.println("------------------------");
        System.out.println("악당 이름:"+getName());
        System.out.println("악당 나이:"+getAge());
        System.out.println("악당의 키:"+getHeight());
        System.out.println("악당의 체중:"+getWeight());
        System.out.println("악당 넘버:"+getUnique_key());
        System.out.println("악당 무기:"+getWeaponName(getWeapon()));
        System.out.println("악당 파워:"+getPower());
        System.out.println("------------------------");
    }

    public String getWeaponName(int a){
        String weapon;
        switch (a){
            case 1:
                weapon = "창";
                break;
            case 2:
                weapon = "방패";
                break;
            case 3:
                weapon = "총";
                break;
            default:
                weapon="---";
                break;
        }
        return weapon;
    }

    public String getUnique_key() {
        return unique_key;
    }

    public void setUnique_key(String unique_key) {
        this.unique_key = unique_key;
    }

    public int getWeapon() {
        return weapon;
    }

    public void setWeapon(int weapon) {
        this.weapon = weapon;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }
}

class Hero2 extends Person3{}

public class Java100_oop_InheritanceSample2 {
    public static void main(String [] args){

        //객체 생성
        Person3 person3 = new Person3();
        //person3.name = "홍길동"; => private 필드이기때문에 외부에서 접근불가 => 에러 발생
        person3.setName("홍길동"); //setter를 이용해 필드에 접근해 값을 세팅
        System.out.println(person3.getName()); //getter를 통해 필드의 값을 가져옴

        //객체 생성
        Villain villain = new Villain("좀비",20,180,80,"15001231",2,99.5);
        //7개의 멤버 필드를 가지는 villain 객체가 생성
        villain.printPerson();
        System.out.print(villain.getName()+" ");
        villain.move(); //부모 클래스의 move() 메서드를 호출
        
        //객체생성
        Villain villain2 = new Villain("도깨비",30,175,70,"11001121",1,77.5);
        villain2.printPerson();
        System.out.print(villain2.getName()+" ");
        villain2.move();

        //객체생성
        Villain villain3 = new Villain("몽달귀신",40,150,40,"10001010",3,27.5);
        villain3.printPerson();
        System.out.print(villain3.getName()+" ");
        villain3.move();
    }
}
