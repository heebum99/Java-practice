public class Java100_operator_LogicalOperators {
    public static void main(String[] args) {

        //논리 연산자 --> &&,|| (이항 연산자),!(단항 연산자)
        //&&(and)   ||(or)  !(not)
        //결과를 받는 타입은 boolean
        //&&(모두 true일 경우 true) ||(둘 중 하나라도 true일 경우 true) !(true면 false, false면 true)
        int a=10,b=20,c=30;

        boolean rst1 = a<b && c>b; //true && true => true
        System.out.println(rst1);
        rst1 = a>b && c>b; //false && true => false
        System.out.println(rst1);

        boolean rst2 = a<b || c<b; //true || false => true
        System.out.println(rst2);
        rst2 = a>b || c<b; //false || false => false
        System.out.println(rst2);

        boolean rst3 = a>c || b!=c; //false || true => true
        System.out.println(rst3);

        boolean rst4 = !rst3; //!true => false
        System.out.println(rst4);
        System.out.println(!rst4);
    }
}
