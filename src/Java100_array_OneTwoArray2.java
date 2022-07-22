import java.util.Arrays;

public class Java100_array_OneTwoArray2 {
    public static void main(String[] args) {

        //String 2차원 배열 => 2x3 형태
        //아시아 -> 동북(한,중,일)/동남아시아(태국,베트남,필리핀)

        //String [] [] asia_nations = {{"한국","중국","일본"},{"태국","베트남","필리핀"}}; //아래와 동일.
        String [] [] asia_nations = {
                {"한국","중국","일본"},
                {"태국","베트남","필리핀"}
        }; //2차원 배열에 대해 직관적.

        System.out.println(asia_nations[0]); //동북아시아 국가를 저장하고 있는 1차원 배열의 주소 값이 출력
        System.out.println(asia_nations[1]); //동남아시아 주소 값

        System.out.println(asia_nations[0][1]); //실제 요소값 출력 => 중국
        System.out.println(asia_nations[1][0]); //태국

        System.out.println(asia_nations.length); //2 => 1차원 배열 2개
        System.out.println(asia_nations[0].length); //3 => 한,중,일 3개

    }
}
