public class Java100_if_Basic004 {
    public static void main(String[] args) {

        int kor=70,eng=70,math=60;
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
            if(math>=60){ //중첩 if 조건문
                System.out.println("당신의 토탈 점수는"+total_score+"입니다. 수학 점수는"+math+"입니다.\n수학이 60점 이상이므로 재수강 대상자가 아닙니다.");
            }
            else{
                System.out.println("당신의 토탈 점수는"+total_score+"입니다. 수학 점수는"+math+"입니다.\n수학이 60점 미만이므로 재수강 대상자 입니다.");            }
        }
    }
}
