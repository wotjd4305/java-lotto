package lotto.view;

import java.util.Scanner;

public class InputView {

    static Scanner scanner = new Scanner(System.in);

    public static void printLottoInput() {
        System.out.println("구매금액을 입력해 주세요.");
    }

    public static void printLottoWinningNumberInput() {
        System.out.println("지난 주 당첨 번호를 입력해 주세요.");
    }

    public static void printLottoWinningBonusNumberInput() {
        System.out.println("보너스 볼을 입력해 주세요.");
    }

    public static void printLottoManualCountInput() {
        System.out.println("수동으로 구매할 로또 수를 입력해 주세요.");
    }

    public static void printLottoManualNumberInput(int count) {
        if(count > 0) {
            System.out.println("수동으로 구매할 번호를 입력해 주세요.");
        }
    }

    public static int intInput() {
        return scanner.nextInt();
    }

    public static String stringInput() {
        return scanner.next();
    }
}
