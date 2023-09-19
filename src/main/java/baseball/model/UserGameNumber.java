package baseball.model;

import java.util.ArrayList;
import java.util.List;

public class UserGameNumber {

    private String inputNumber;
    private List<Integer> userNumber;

    public String getInputNumber() {
        return inputNumber;
    }

    public void addInputNumber(String inputNumber) {
        this.inputNumber = inputNumber;
    }

    public List<Integer> getUserNumber() {
        return userNumber;
    }

    public void addUserNumber(String number) {
        List<Integer> numberList = new ArrayList<>();
        for(int i=0; i<3; i++){
            numberList.add(number.charAt(i)-'0');
        }
        this.userNumber = numberList;
    }
}
