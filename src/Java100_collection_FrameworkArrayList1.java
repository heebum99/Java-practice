import java.util.ArrayList;

class Person10{

}

public class Java100_collection_FrameworkArrayList1 {
    public static void main(String[] args) {

        //ArrayList를 제네릭이 아닌 Object타입으로 사용하는 경우
        ArrayList list1 = new ArrayList();

        //데이터 추가하기 -> add() 메서드
        list1.add("홍길동"); //문자열 자료형 저장
        list1.add(20); //정수 자료형 저장
        list1.add("이순신");
        list1.add(20); //데이터 중복 가능
        list1.add(new Person10());

        //데이터 가져오기 -> get() 메서드 -> 이때 해당 데이터 자료형으로 형변환 필요
        System.out.println(list1.get(0)); //홍길동
        String str = (String)list1.get(0);
        System.out.println(str.length());

        int num = (int)list1.get(1);
        System.out.println(num+100);

        Person10 p1 = (Person10)list1.get(4);
        System.out.println(p1);

        //결론 -> 제네릭 문법을 사용하지 않으면 ArrayList는 Object타입으로 처리된다.
        //get() 메서드 사용시 형변환에 주의해야한다.

        //출력 -> 반복문 -> 배열의 크기(size) -> 객체명.size();
        System.out.println(list1.size());
        for(int i=0;i<list1.size();i++) {
            System.out.println(list1.get(i));
        }
    }
}
