public class Java100_variable_002 {
    public static void main(String[] args) {
        //정수,문자형 타입의 바이트, 비트 크기
        //byte,short,int,long,char

        System.out.println("byte:"+Byte.BYTES+"바이트"+"-->"+Byte.SIZE+"비트");
        System.out.println("short:"+Short.BYTES+"바이트"+"-->"+Short.SIZE+"비트");
        System.out.println("int:"+Integer.BYTES+"바이트"+"-->"+Integer.SIZE+"비트");
        System.out.println("long:"+Long.BYTES+"바이트"+"-->"+Long.SIZE+"비트");
        System.out.println("char:"+Character.BYTES+"바이트"+"-->"+Character.SIZE+"비트\n");

        //정수,문자형 타입의 최대, 최솟값

        System.out.println("byte:"+Byte.MIN_VALUE+"~"+Byte.MAX_VALUE);
        System.out.println("short:"+Short.MIN_VALUE+"~"+Short.MAX_VALUE);
        System.out.println("int:"+Integer.MIN_VALUE+"~"+Integer.MAX_VALUE);
        System.out.println("long:"+Long.MIN_VALUE+"~"+Long.MAX_VALUE);
        System.out.println("char:"+(int)Character.MIN_VALUE+"~"+(int)Character.MAX_VALUE);
        //char는 문자형이기에 최대, 최솟값을 알기 위해서 int형으로 형변환 필요!!
    }
}
