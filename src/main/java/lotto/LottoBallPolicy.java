package lotto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LottoBallPolicy {

    private static List<Number> numberList;
    private static final int MAX_NUMBER = 45;

    private static void init() {
        List<Number> list = new ArrayList<>();
        for (int i = 1; i < MAX_NUMBER; i++) {
            list.add(Number.createNumber(i));
        }
        numberList = list;
    }

    public LottoBallPolicy() {
        init();
    }

    public LottoBallPolicy(List<Number> list) {
        numberList = new ArrayList<>(list);
    }

    private void shuffleLottoNumber(){
        Collections.shuffle(numberList);
    }

    public ArrayList<Number> getLottoNumber(int size) {
        shuffleLottoNumber();
        return new ArrayList<>(numberList.subList(0, size));
    }
}
