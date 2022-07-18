public class Java100_switch_Basic001 {
    public static void main(String[] args) {

        //변수 선언
        int age=14;

        //사용자 입력 예외처리
        /*if(age>10 && age<20){ 이런식으로도 활용 가능.
            age=10;
        }*/
        if(age>10 && age<20){ //11~19
            System.out.println("10이라고 다시 입력해주세요. 프로그램을 종료합니다.");
            System.exit(0); //프로그램 종료.
        }
        else if(age>20 && age<30){ //21~29
            System.out.println("20이라고 다시 입력해주세요. 프로그램을 종료합니다.");
            System.exit(0);
        }
        else if(age>30 && age<40){ //31~39
            System.out.println("30이라고 다시 입력해주세요. 프로그램을 종료합니다.");
            System.exit(0);
        }
        else if(age>40 && age<50){ //41~49
            System.out.println("40이라고 다시 입력해주세요. 프로그램을 종료합니다.");
            System.exit(0);
        }
        else if(age>50 && age<60){ //51~59
            System.out.println("50이라고 다시 입력해주세요. 프로그램을 종료합니다.");
            System.exit(0);
        }
        else{
            if(age<10){
                System.out.println("최소 10이상만 입력해주세요. 프로그램을 종료합니다.");
                System.exit(0);
            }
        }

        //switch 조건문
        //변수 조건은 정수형만 가능 => int, short, byte, char만 가능
        //break, default 빼먹지 않도록 주의!!
        switch (age){ //해당되는 case의 블록을 실행.
            case 10:
                System.out.println(age+"대 입니다. 참고서 코너는 A구역 입니다.");
                break;
            case 20:
                System.out.println(age+"대 입니다. 취업 서적 코너는 B구역 입니다.");
                break;
            case 30:
                System.out.println(age+"대 입니다. 자기 계발 코너는 C구역 입니다.");
                break;
            case 40:
                System.out.println(age+"대 입니다. 재테크 코너는 D구역 입니다.");
                break;
            case 50:
                System.out.println(age+"대 입니다. 재취업 코너는 E구역 입니다.");
                break;
            default:
                System.out.println("60대 이상입니다. 건강/장수 코너는 F구역 입니다.");
                break;
        }
    }
}
