public class Java100_array_OneTwoArray3 {
    public static void main(String[] args) {

        //2차원 배열 선언 및 초기화
        String [] [] asia_nations = {
                {"한국","중국","일본"},
                {"태국","베트남","필리핀"}
        };
        
        //반복문을 사용한 String 2차원 배열 값 출력
        for(int i=0;i<asia_nations.length;i++){
            for(int k=0;k<asia_nations[i].length;k++){
                System.out.print(asia_nations[i][k]+" ");
            }
            System.out.println();
        }

        //charAt()메서드 => 해당 인덱스에 있는 값을 반환 => 단어를 char 배열에 한 글자씩 저장 가능
        String [] strAr = {"hong","kim","park"};
        System.out.println(strAr[0].charAt(2)); //hong의 인덱스 2번째 값 출력 => n
        System.out.println(strAr[1].charAt(2)); //m
        System.out.println(strAr[2].charAt(2)); //r

        //반복문에서 charAt()메서드 사용
        //잘못된 예1
        for(int i=0;i<strAr.length;i++){
            System.out.print(strAr[i].charAt(i)); //hir
        }
        System.out.println();

        //잘못된 예2
        for(int k=0;k<strAr.length;k++){
            for(int j=0;j< strAr.length;j++){
                System.out.print(strAr[k].charAt(j)); //hon kim par
            }
            System.out.println();
        }

        //.length vs .length() 차이점
        //.length => 배열의 길이, .length() => 문자열의 길이
        System.out.println(strAr.length); //3
        //System.out.println(strAr[0].length); => 에러 발생
        System.out.println(strAr[0].length()); // 4 => h o n g

        int [] aaa = new int [10];
        System.out.println(aaa.length); //10 => 배열의 길이

        String bbb = "Welcome to Seoul";
        System.out.println(bbb.length()); //16 => 문자열의 길이
        
        //올바른 예
        for(int q=0;q<strAr.length;q++){
            for(int w=0;w<strAr[q].length();w++){
                System.out.print(strAr[q].charAt(w)); //hong kim park
            }
            System.out.println();
        }


    }
}
