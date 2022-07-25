public class Java100_oop_ParseInt2 {
    public static void main(String[] args) {

        //진수 지정
        //parseInt()의 두 번째 인자 값으로 진수를 지정 가능.
        System.out.println("------------진수지정---------");
        System.out.println(Integer.parseInt("2022")); //지정하지 않으면 10진수
        System.out.println(Integer.parseInt("2022",10));
        System.out.println(Integer.parseInt("1001",2)); //2진수의 1001 => 10진수로 9
        System.out.println(Integer.parseInt("1004",8)); //8진수의 1004 => 10진수로 516
        System.out.println(Integer.parseInt("A",16)); //16진수의 A => 10진수로 10
        System.out.println(Integer.parseInt("FF",16));
    }
}

