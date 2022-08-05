import java.util.ArrayList;

public class Java100_collection_FrameworkArrayList2 {
    public static void main(String [] args){

        //ArrayList 객체 생성 --> 제네릭 사용
        ArrayList<String> ar = new ArrayList<String>();

        //추가 -> add()
        ar.add("홍길동");
        ar.add("이순신");
        ar.add("강감찬");
        ar.add("을지문덕");
        ar.add("김유신");
        System.out.println(ar.get(0)); //홍길동

        String str = ar.get(1); //형변환 없이 사용 가능 -> 타입 안정성이 높아짐
        //int num = (int)ar.get(1); => 컴파일 단계에서 에러 발생

        //수정 -> set(인덱스,수정값)
        ar.set(3,"징기스칸"); //을지문덕->징기스칸
        System.out.println(ar.get(3));
        
        //삭제 -> 하나만 삭제/전부 삭제 -> remove(인덱스)
        ar.remove(3); //징기스칸 삭제, 인덱스 4번의 값이 3번으로 이동.
        System.out.println(ar.get(3)); //김유신
        System.out.println("-------------------------");

        //향상된 for문으로 출력
        for(String list:ar){
            System.out.println(list);
        }
        System.out.println("-------------------------");

        //for 반복문 사용해 출력
        for(int i=0;i<ar.size();i++){
            System.out.println(ar.get(i));
        }
        System.out.println("-------------------------");

        //printf() 사용해 출력
        for(int i=0;i<ar.size();i++){
            System.out.printf("%d번 학생의 이름은 %s입니다.\n",i,ar.get(i));
        }
        System.out.println("-------------------------");

        //전부 삭제 -> removeAll(배열명)
        ar.removeAll(ar);
        System.out.println(ar.size());
    }
}
