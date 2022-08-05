class Sample2 <T>{ //클래스명 뒤에 <> 제네릭 셋팅.
    //필드
    private T obj;

    //생성자
    Sample2(T x){
        this.obj = x;
    }

    //메서드
    T getObj(){
        return obj;
    }

    void printinfo(){
        System.out.println(obj.getClass().getName());
    }
}
public class Java100_collection_Generic3 {
    public static void main(String[] args) {

        //객체 생성 -> String
        Sample2<String> sample = new Sample2<String>("안녕하세요"); //클래스명 뒤에 <> 타입명 입력.
        System.out.println(sample.getObj());
        sample.printinfo();
        System.out.println("----------------------");

        //객체 생성 -> Integer
        Sample2<Integer> sample2 = new Sample2<Integer>(100);
        System.out.println(sample2.getObj());
        sample2.printinfo();
        System.out.println("----------------------");

        //형변환 없이 사용
        String str = sample.getObj();
        System.out.println(str);
        System.out.println(str.length());

        int num = sample2.getObj();
        System.out.println(num+100);
    }
}
