public class Java100_algorithm_MinAlgorithm {
    public static void main(String[] args) {

        //배열 선언
        int [] ar = {4,-13,150,17,-2};
        
        //배열의 첫번째 요소가 가장 작다고 가정하고 초기화
        int min = ar[0];
        //int min = Integer.MAX_VALUE;

        //반복문을 돌면서 비교해 출력
        for(int i=0;i<ar.length;i++){
            if(min>ar[i]){
                min = ar[i];
            }
        }
        System.out.println("현재 배열내 가장 작은 값은:"+min);
    }
}
