public class Java100_algorithm_MaxAlgorithm {
    public static void main(String[] args) {

        //배열선언
        int [] ar ={4,13,15,17,-2};

        //max, min함수
        System.out.println(Math.max(10,4)); //10
        System.out.println(Math.min(10,4)); //4

        //배열의 첫번째 원소 값이 제일 크다고 가정하고 초기화
        int max = ar[0];
        //int max = Integer.MIN_VALUE; => 정수 범위중 가장 작은 값으로 초기화

        //반복문을 돌면서 비교하여 출력
        for(int i=0;i<ar.length;i++){
            if(max<ar[i]){
                max = ar[i];
            }
        }
        System.out.println("현재 배열내 가장 큰 값은:"+max);
    }
}
