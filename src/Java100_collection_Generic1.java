class Sample{
    //필드
    private Object obj;

    //생성자
    Sample(Object x){
        this.obj = x;
    }

    //메서드
    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj){
        this.obj = obj;
    }

    void printinfo(){
        System.out.println(obj.getClass().getName()); //객체가 속하는 클래스의 정보를 출력
    }
}
public class Java100_collection_Generic1 {
    public static void main(String[] args) {

        //객체 생성 -> 문자열
        Sample sample1 = new Sample("안녕하세요");
        System.out.println(sample1.getObj());
        sample1.printinfo();
        System.out.println("-------------------");

        //객체 생성 -> 숫자
        Sample sample2 = new Sample(100);
        System.out.println(sample2.getObj());
        sample2.printinfo();
        System.out.println("--------------------");

        //객체 생성 -> Object
        Sample sample3 = new Sample(new Object());
        System.out.println(sample3.getObj());
        sample3.printinfo();
        System.out.println("-------------------");

        //위와 같이 사용시 단점:
        //sample1 -> 문자열
        //String str = sample1.getObj(); => 에러발생, getObj()의 리턴타입이 Object이기 때문에 형변환이 필요.
        Object str = sample1.getObj();
        String str2 = (String)sample1.getObj();
        System.out.println(str);
        //System.out.println(str.length()); => 에러발생, String 타입이 아님.
        System.out.println(str2.length());
        System.out.println("-------------------");

        //sample2 -> 숫자
        Object num = sample2.getObj();
        int num2 = (int)sample2.getObj();
        System.out.println(num);
        //System.out.println(num+100); => 에러발생
        System.out.println(num2);
        System.out.println(num2+100);
        System.out.println("--------------------");
    }
}
