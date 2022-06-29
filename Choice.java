import java.util.Scanner;

public class Choice extends Menu{

    public int start() {
        int num;

        while(true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("예약[1], 좌석 현황[2], 예약 취소[3], 나가기[4] -> ");
            num = scanner.nextInt();

            switch (num) {
                case 1 :
                    reserve(s,a,b);
                    break; // break가 없으면 밑에 조건식이 연달아 실행됨

                case 2 :
                    show(s,a,b);
                    break;

                case 3 :
                    cancel(s,a,b);
                    break;

                case 4 :
                    exit();
                    break;

                default:
                    System.out.println("잘못 입력하였습니다.");
                    break;
            }
        }
    }

}
