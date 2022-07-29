class Person4{
    //필드
    private String name;
    private int age;

    //생성자
    Person4(){}
    Person4(String name, int age){
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
public class Java100_oop_ObjArray {
    public static void main(String[] args) {

        //객체 생성
        int [] ar1 = {1,2,3,4,5}; //정수형 배열
        char [] ar2 = {'A','B','C','D','E'}; //문자형 배열
        Person4 [] pa = new Person4[5]; //Person4 객체의 참조값을 원소로 가지는 배열 공간을 5개 생성
        pa[0] = new Person4("홍길동",20);
        pa[1] = new Person4("박길동",21);
        pa[2] = new Person4("김길동",22);
        pa[3] = new Person4("장길동",23);
        pa[4] = new Person4("고길동",24);

        //출력
        for(int i=0;i< ar1.length;i++){
            System.out.print(ar1[i]+" ");
        }
        System.out.println();

        for(int i=0;i< ar2.length;i++){
            System.out.print(ar2[i]+" ");
        }
        System.out.println();

        for(int i=0;i< pa.length;i++){
            System.out.print(pa[i]+"  "); //각 객체의 주소 값 출력
        }
        System.out.println();

        for(int i=0;i< pa.length;i++){
            System.out.print(pa[i].getName()+" "); //각 객체의 이름 출력
        }
        System.out.println();

        for(int i=0;i< pa.length;i++){
            System.out.print(pa[i].getAge()+" "); //각 객체의 주소 값 출력
        }
        System.out.println();
    }
}
