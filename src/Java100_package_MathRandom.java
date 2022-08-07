public class Java100_package_MathRandom {
    public static void main(String[] args) {

        //반복문 -> 랜덤 숫자 생성
        //랜덤 숫자 생성중 0을 제외 => 나오는 결과 값에 +1
        for(int i=0;i<10;i++){ //Math.random() => double 타입으로 반환
            //System.out.println(Math.random());
            System.out.print((int)((Math.random()*10)+1)+" ");
        }
    }
}
