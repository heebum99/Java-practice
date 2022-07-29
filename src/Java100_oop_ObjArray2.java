class Person5{
    //필드
    private String name;
    private int age;

    //생성자
    Person5(){}
    Person5(String name, int age){
        this.name = name;
        this.age = age;
    }

    //메서드
    //getter, setter
    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }
}
public class Java100_oop_ObjArray2 {
    public static void main(String[] args) {

        //객체 배열 생성
        Person5 [] pa;
        pa = new Person5[5];

        //반복문을 통한 Person5() 객체 생성
        for(int i=0;i<pa.length;i++){
            pa[i] = new Person5(i+"번 후보자",i+20);

            //getter, setter 메서드 사용해서 출력
            System.out.println(pa[i].getName()+"-->나이:"+pa[i].getAge());

            //System.out.println(pa[i].name+pa[i].age); => 배열 인덱스 사용해서 출력 => private 선언을 삭제하고 써야함.

            //printf()
            System.out.printf("%s 후보자의 나이는 %d살 입니다.\n",pa[i].getName(),pa[i].getAge());
        }
    }
}
