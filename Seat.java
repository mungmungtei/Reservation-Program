import java.util.Scanner;

public class Seat {

    String[][] s = new String[10][2];
    String[][] a = new String[15][2];
    String[][] b = new String[20][2];

    int i;

    public Seat() {
        for(i=0; i<10; i++) {
            s[i][0] = "___ ";
            s[i][1] = "0";
        }

        for(i=0; i<15; i++) {
            a[i][0] = "___ ";
            a[i][1] = "0";
        }

        for(i=0; i<20; i++) {
            b[i][0] = "___ ";
            b[i][1] = "0";
        }
    }

    void occupied(int seatType, int seatNum, String name) {
        switch (seatType) {
            case 1:
                s[seatNum][0] = name;
                s[seatNum][1] = "1";
                break;

            case 2:
                a[seatNum][0] = name;
                a[seatNum][1] = "1";
                break;

            case 3:
                b[seatNum][0] = name;
                b[seatNum][1] = "1";
                break;
        }
    }

    String getName() {
            System.out.print("이름>> ");
            Scanner scanner = new Scanner(System.in);
            String name = scanner.next();
            return name;
        }

    int getSeatNum() {
            System.out.print("좌석 번호>> ");
            Scanner scanner = new Scanner(System.in);
            int num = scanner.nextInt();
            return num;
        }

    String seatCheck(int seatType, int seatNum, String name) {
            String check = "";

            switch(seatType) {
                case 1 :
                    if(s[seatNum][1] == "1") {
                        System.out.println("이미 예약된 좌석입니다. 다른 좌석을 선택해주세요.");
                        check = "실패";
                    } else {
                        occupied(seatType, seatNum, name);
                        System.out.println("예약되었습니다!");
                        check = "성공";
                    }
                    break;

                case 2 :
                    if(a[seatNum][1] == "1") {
                        System.out.println("이미 예약된 좌석입니다. 다른 좌석을 선택해주세요.");
                        check = "실패";
                    } else {
                        occupied(seatType, seatNum, name);
                        System.out.println("예약되었습니다!");
                        check = "성공";
                    }
                    break;

                case 3 :
                    if(b[seatNum][1] == "1") {
                        System.out.println("이미 예약된 좌석입니다. 다른 좌석을 선택해주세요.");
                        check = "실패";
                    } else {
                        occupied(seatType, seatNum, name);
                        System.out.println("예약되었습니다!");
                        check = "성공";
                    }
                    break;
            }
            return check;
        }

    int cancelCheck(int seatType, String name) {

            switch (seatType) {
                case 1 :
                    while (true) {

                        for(i=0; i<10; i++) {
                            if(name.equals(s[i][0])) {
                                s[i][0] = "___ ";
                                s[i][1] = "0";
                                break;
                            }
                        }

                        if(i == 10) {
                            System.out.println("예약자명을 찾을 수 없습니다. 다시 입력해주세요.");
                            return 0;
                        } else {
                            System.out.println("예약이 취소되었습니다.");
                            break;
                        }
                    }
                    break;

                case 2 :
                    while (true) {

                        for(i=0; i<15; i++) {
                            if(name.equals(a[i][0])) {
                                a[i][0] = "___ ";
                                a[i][1] = "0";
                                break;
                            }
                        }

                        if(i == 15) {
                            System.out.println("예약자명을 찾을 수 없습니다. 다시 입력해주세요.");
                            return 0;
                        } else {
                            System.out.println("예약이 취소되었습니다.");
                            break;
                        }
                    }
                    break;

                case 3 :
                    while (true) {

                        for(i=0; i<20; i++) {
                            if(name.equals(b[i][0])) {
                                b[i][0] = "___ ";
                                b[i][1] = "0";
                                break;
                            }
                        }

                        if(i == 20) {
                            System.out.println("예약자명을 찾을 수 없습니다. 다시 입력해주세요.");
                            return 0;
                        } else {
                            System.out.println("예약이 취소되었습니다.");
                            break;
                        }
                    }
                    break;
            }
            return 1;
    }
}
