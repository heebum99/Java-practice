class Solution{
    //필드

    //생성자
    Solution(){}

    //메서드
    public void solutionMethod(int n,int [] vote_box){

        //ar 카운트(득표수) 배열 선언 -> 정수형 배열은 0으로 초기화 되는 점을 활용
        //후보자 1~3번, 0번 후보자는 없기에 후보자 수보다 1크게 배열의 크기를 설정
        int [] ar = new int[n+1];

        //전달된 vote_box 배열을 반복문을 돌면서 각 후보자별로 받은 득표수 계산
        for(int i=0;i< vote_box.length;i++){
            ar[vote_box[i]]++;
        }

        //각 후보자 득표수 출력
        for(int i=1;i< ar.length;i++){
            System.out.println(i+"번 후보자의 득표 수 -> "+ar[i]);
        }

        //ar 카운트 배열에서 가장 많은 득표를 한 후보 출력 -> 최댓값 알고리즘 문제
        int rst_candidate=0, rst_max=ar[0];
        for(int i=1;i<ar.length;i++){
            if(ar[i]>rst_max){
                rst_max=ar[i];
                rst_candidate=i;
            }
        }
        System.out.println("가장 많은 득표 수 -> "+rst_max+"표 이고, 그때의 후보자는 "+rst_candidate+"번 후보자 입니다.");

        //과반수 여부 체크
        boolean majority = rst_max > (vote_box.length/(double)2);
        if(majority){
            System.out.println("과반수 이상 득표했습니다. -> 당선");
        }
        else {
            System.out.println("과반수 이상 실패했습니다. -> 미당선");
        }
    }
}
public class Java100_license_SolutionVote {
    public static void main(String[] args) {
        /*3명의 후보자를 두고 7명의 사람이 투표, 1~3번까지의 후보자 중 과반수 이상 득표하면 당선
        투표 박스는 배열 리스트로 제공, 1~3번의 번호가 기표되어 있다.*/
        //1.각 후보자 득표 수 출력
        //2.가장 많은 득표수와 그 후보자 번호 출력
        //3.가장 많은 득표를 한 후보자의 득표수가 과반수 이상인지 체크 => 당선, 미당선 출력

        //객체 생성
        Solution s1 =new Solution();

        //득표한 표 수를 저장하는 정수형 배열 선언
        int [] vote_box = {1,3,1,3,3,2,2};

        //solutionMethod() 호출 -> 2개 입력 파라미터 값 전달 -> 후보자 수, 투표 박스 배열
        s1.solutionMethod(3,vote_box);
    }
}
