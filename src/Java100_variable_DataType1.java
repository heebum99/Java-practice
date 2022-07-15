public class Java100_variable_DataType1 {
    public static void main(String[]args){

        //변수선언
        int a;
        int b; int c=90; //나란히 변수 선언 및 초기화 가능
        double d;
        char e;

        //선언된 변수에 값을 대입(초기화)
        a=10;
        b=20;
        d=3.14;
        e='A'; //문자형에는 ''따옴표로, ""쌍따옴표 사용시 에러

        //출력
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        
        //여러 개 변수 선언 및 초기화
        int w;
        //System.out.println(w); => 에러발생, 변수 w를 초기화하지 않고 사용.
        int x,y,z=900; //z만 초기화가 되고 x,y는 선언만 되고 초기화는 되지않은 상태.
        int x1=300,y1=200,z1=500; //여러 변수를 동시에 선언하면서 초기화 가능.

        System.out.println(x1);
        System.out.println(y1);
        System.out.println(z1);

        //여러 변수를 같은 값으로 초기화
        String str1,str2,str3;
        str1=str2=str3="korea";

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
    }
}
