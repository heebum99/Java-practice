public class Java100_license_CosPattern1 {
    public static void main(String [] args){

        //배열 선언
        int [] target = {1,3,3,2,1,1,3,0,1,2};

        //배열 내 각 숫자들의 빈도 수 출력하기
        //1.빈 정수형 배열 ar을 하나 만들어놓고 초깃값은 모두 0으로 셋팅
        //2.target 배열 내 숫자가 빈 배열의 인덱스로 적용해 배열 요소의 값을 1씩 증가.
        //3.빈 배열 ar의 요소 개수는 target 배열 내 숫자들의 종류만큼 지정.
        //ar 배열의 각 요소의 값은 빈도 수를 나타냄. ex)ar[0] => 0이 나온 빈도수.

        int [] ar = new int [4]; //0~3 총 4개
        for(int i =0; i< target.length;i++){
            ar[target[i]]++;
            //=>target 배열의 요소값과 같은 ar 배열의 인덱스의 요소 값을 증가시킴으로 빈도수 체크.
        }

        for(int i=0;i<ar.length;i++){
            System.out.println(i+"번 숫자->"+ar[i]+" ");
        }
        
    }
}
