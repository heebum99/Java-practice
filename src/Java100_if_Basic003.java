public class Java100_if_Basic003 {
    public static void main(String[] args) {

        //변수 선언
        int kor=70,eng=70,math=70;
        int total_score;
        total_score = kor+eng+math;

        //if ~else if ~else 조건문 사용
        if(total_score>=270){
            System.out.println("당신의 토탈 점수는"+total_score+"입니다.");
            System.out.println("축하합니다~");
        }
        else if(total_score>=240){ //else if()는 여러개 사용 가능.
            System.out.println("당신의 토탈 점수는"+total_score+"입니다.");
            System.out.println("잘했어요.");
        }
        else if(total_score>=210){
            System.out.println("당신의 토탈 점수는"+total_score+"입니다.");
            System.out.println("아쉽네요.");
        }
        else{
            System.out.println("당신의 토탈 점수는"+total_score+"입니다.");
            System.out.println("노력하세요.");
        }
    }
}
