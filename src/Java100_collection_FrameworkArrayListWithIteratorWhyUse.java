import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

public class Java100_collection_FrameworkArrayListWithIteratorWhyUse {
    public static void main(String[] args) {

        //객체 생성
        ArrayList<Integer> list = new ArrayList<>();

        //요소 추가 -> add()
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        //iterator 객체 생성
        Iterator<Integer> iter = list.iterator();

        //출력 -> 요소 삭제 전
        for(Integer num : list){
            System.out.print(num+" ");
        }
        System.out.println();

        //요소 삭제 -> 반복문 없이 한 개의 요소만 삭제
//        System.out.println(list.get(1)); //2
//        list.remove(1); //인덱스 1번값인 2 삭제
//        System.out.println(list.get(1)); //3

        //요소 삭제 -> 반복문 사용
        System.out.println("---------------------");
        for(Integer i :list){
            //list.remove(i); => java.util.ConcurrentModificationException 에러 발생
            //기존 list의 길이, 인덱스 정보가 변경되면서 순회시 정보가 맞지 않아 오류 발생.
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("---------------------");

        while(iter.hasNext()){
            Integer i = iter.next();
            if(i==2){
                iter.remove();
                System.out.println(i+" 삭제");
            }
        }
        System.out.println("---------------------");

        //출력 -> 요소 삭제 후
        for(Integer num:list){
            System.out.print(num+" ");
        }
    }
}
