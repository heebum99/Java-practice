public class Java100_operator_RelationalOperators {
    public static void main(String[] args) {

        //관계 연산자 --> ==,!=,>,>=,<,<=
        //관계 연산자를 사용해 연산을 수행하면 결과는 ture,false --> 결과를 받는 타입은 boolean
        int kor=70,eng=40,math=70;
        boolean rst1,rst2,rst3,rst4,rst5,rst6;

        rst1 = kor == eng; //false
        rst2 = kor != eng; //true
        rst3 = kor > eng; //true
        rst4 = kor >= math; //true
        rst5 = kor < eng; //false
        rst6 = kor <= math; //true

        System.out.println(rst1);
        System.out.println(rst2);
        System.out.println(rst3);
        System.out.println(rst4);
        System.out.println(rst5);
        System.out.println(rst6);

    }
}
