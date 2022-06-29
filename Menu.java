import java.util.Scanner;

public class Menu extends Seat{

    public Menu() {
    }

    public void reserve(String[][] s, String[][] a, String[][] b) {
        System.out.print("좌석 타입 S[1], A[2], B[3] -> ");
        Scanner scanner = new Scanner(System.in);

        int seatType;
        int seatNum;
        String name;

        seatType = scanner.nextInt();

        if(seatType != 1 && seatType != 2 && seatType != 3) {
            System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
            reserve(s,a,b);
        }

        switch(seatType) {

            case 1 :
                while(true) {
                    System.out.print("S >> ");
                    for (int i = 0; i < 10; i++)
                        System.out.print(s[i][0]);
                    System.out.println();
                    name = getName() + " ";
                    seatNum = getSeatNum() - 1;

                    if (seatNum >= 0 && seatNum < 10) {
                        if (seatCheck(seatType, seatNum, name).equals("성공"))
                            break;
                    } else {
                        System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
                    }
                }
                break;

            case 2 :
                while(true) {
                    System.out.print("A >> ");
                    for (int i = 0; i < 15; i++)
                        System.out.print(a[i][0]);
                    System.out.println();
                    name = getName() + " ";
                    seatNum = getSeatNum() - 1;

                    if (seatNum >= 0 && seatNum < 15) {
                        if (seatCheck(seatType, seatNum, name).equals("성공"))
                            break;
                    } else {
                        System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
                    }
                }
                break;

            case 3 :
                while(true) {
                    System.out.print("B >> ");
                    for (int i = 0; i < 20; i++)
                        System.out.print(b[i][0]);
                    System.out.println();
                    name = getName() + " ";
                    seatNum = getSeatNum() - 1;

                    if (seatNum >= 0 && seatNum < 20) {
                        if (seatCheck(seatType, seatNum, name).equals("성공"))
                            break;
                    } else {
                        System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
                    }
                }
                break;
        }
    }

    void show(String[][] s, String[][] a, String[][] b) {
        System.out.print("S>> ");
        for (int i = 0; i < 10; i++)
            System.out.print(s[i][0]);
        System.out.println();


        System.out.print("A>> ");
        for (int i = 0; i < 15; i++)
            System.out.print(a[i][0]);
        System.out.println();


        System.out.print("B>> ");
        for (int i = 0; i < 20; i++)
            System.out.print(b[i][0]);
        System.out.println();

        System.out.println("===조회 완료===");
    }

    void cancel(String[][] s, String[][] a, String[][] b) {
        System.out.print("좌석 타입 S[1], A[2], B[3] -> ");
        Scanner scanner = new Scanner(System.in);
        int seatType = scanner.nextInt();

        if(seatType != 1 && seatType != 2 && seatType != 3) {
            System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
            cancel(s,a,b);
        }

        switch (seatType) {
            case 1 :
                System.out.print("S>> ");
                for(int i=0; i<10; i++)
                    System.out.print(s[i][0]);
                System.out.println();
                break;

            case 2 :
                System.out.print("A>> ");
                for(int i=0; i<15; i++)
                    System.out.print(a[i][0]);
                System.out.println();
                break;

            case 3 :
                System.out.print("B>> ");
                for(int i=0; i<20; i++)
                    System.out.print(b[i][0]);
                System.out.println();
                break;
        }

        String name = getName() + " ";

        if(cancelCheck(seatType, name) == 0)
            cancel(s,a,b);
    }

    void exit() {
        System.out.println("이용해주셔서 감사합니다.");
        System.exit(0);
    }
}
