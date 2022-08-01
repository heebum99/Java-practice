public class Java100_algorithm_MaxMin {
    public static void main(String[] args) {

        //정수 배열 선언
        int [] ar = new int[10];

        //반복문을 돌면서 랜덤으로 10개 정수 값 셋팅 -> Math.random()
        for(int i=0;i<ar.length;i++){
            ar[i]=(int)(Math.random()*100); //Math.random() =>double형이기 때문에 int형으로 형변환 필요
            System.out.print(ar[i]+" ");
            //System.out.println((int)(Math.random()*10));
        }
        System.out.println();

        //최댓값, 최솟값 변수 선언 및 초기화
        int max = ar[0], min = ar[0];

        //반복문을 돌면서 최댓값, 최솟값 비교
        for(int i=0;i<ar.length;i++){
            //최댓값 비교
            if(max<ar[i]){
                max = ar[i];
            }

            //최솟값 비교
            if(min>ar[i]){
                min = ar[i];
            }
        }
        System.out.println("ar 배열내 최댓값:"+max);
        System.out.println("ar 배열내 최솟값:"+min);
    }
}
