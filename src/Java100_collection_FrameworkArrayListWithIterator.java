import java.util.ArrayList;
import java.util.Iterator;

public class Java100_collection_FrameworkArrayListWithIterator {
    public static void main(String[] args) {

        //객체 생성
        ArrayList<String> list = new ArrayList<>(); //뒤의 <>에는 타입 생략가능.

        //요소 추가 -> add()
        list.add("Alligator");
        list.add("Hippo");
        list.add("Ostrich");
        list.add("Donkey");

        //Iterator 객체 생성
        //List, Set 인터페이스를 상속받아 구현한 클래스 객체를 통해서 iterator() 메서드를 사용할 수 있다.
        Iterator<String> iter = list.iterator();

        //Iterator 메서드 사용 -> hasNext(), next(), remove()
//        System.out.println(iter.hasNext()); //첫번째 요소가 존재 -> true
//        System.out.println(iter.next()); //Alligator
//        System.out.println(iter.hasNext()); //true
//        System.out.println(iter.next()); //Hippo
//        System.out.println(iter.hasNext()); //true
//        System.out.println(iter.next()); //Ostrich
//        System.out.println(iter.hasNext()); //true
//        System.out.println(iter.next()); //Donkey
//        System.out.println(iter.hasNext()); //false
        //System.out.println(iter.next()); => hasNext()가 false이기에 에러 발생

        System.out.println("--------------------------");

        //요소 출력 -> 향상된 for문
        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("-------------------------");

        //요소 출력 -> while 반복문
        //위의 hasNext()에서 이미 false출력 -> while 반복문에서는 아무것도 출력되지 않는다.
        //Hippo 요소만 출력
//        while (iter.hasNext()) {
//            String str = iter.next();
//            if("Hippo".equals(str)){ //if(str=="Hippo")
//                System.out.println(str);
//            }
//        }
        
        //Hippo 요소만 제거
        while(iter.hasNext()){
            String str = iter.next();
            if(str.equals("Hippo")){
                iter.remove();
                System.out.println("Hippo 삭제");
            }
        }

        System.out.println("----------------------------");

        for(String s1 : list){
            System.out.println(s1);
        }

    }
}

