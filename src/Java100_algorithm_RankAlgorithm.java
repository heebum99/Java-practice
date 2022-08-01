public class Java100_algorithm_RankAlgorithm {
    public static void main(String[] args) {

        //배열 선언 -> 성적배열, 랭킹배열
        int [] scores = {88,50,38,100,90,100,99,75};
        int s_len = scores.length;
        int [] ranking = new int[s_len];

        //반복문을 돌면서 랭킹 처리
        for(int i=0;i<s_len;i++){
            //랭킹 초기화 -> 일단 전부 1등으로 초기화
            ranking[i] = 1;

            //중첩 반복문
            for(int j=0;j<s_len;j++){
                if(scores[i]<scores[j]){
                    ranking[i]++;
                }
            }

            //출력
            System.out.print(scores[i]+" ");

        }
        System.out.println();
        for(int i=0;i< scores.length;i++){
            System.out.print(ranking[i]+"  ");
        }

    }
}
