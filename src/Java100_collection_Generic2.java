class Person9{
    //필드
    public Object obj;

    //생성자
    Person9(Object obj){
        this.obj = obj;
    }

    //메서드

}

class Student3{
    //필드
    public int grade;

    //생성자
    Student3(int grade){
        this.grade = grade;
    }

    //메서드

}

public class Java100_collection_Generic2{
    public static void main(String[] args) {

        //객체 생성
        Person9 p1 = new Person9("홍길동");
        System.out.println(p1.obj);
        String str = (String)p1.obj;
        System.out.println(str.length());

        Person9 p2 = new Person9(100);
        System.out.println(p2.obj);

        Person9 p3 = new Person9(new Student3(2));
        System.out.println(p3.obj);
        Student3 s1 = (Student3) p3.obj;
        System.out.println(s1.grade);

        //String str2 = (String)p3.obj; =>컴파일 단계에선 오류x => 실행시 ClassCast 오류 발생, (잘못된 형변환)


    }
}
