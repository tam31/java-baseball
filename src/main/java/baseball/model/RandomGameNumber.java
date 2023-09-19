package baseball.model;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class RandomGameNumber {

    private List<Integer> computerNumber;

    public List<Integer> getComputerNumber() {
        return computerNumber;
    }

    public void addComputerNumber(List<Integer> computerNumber) {
        this.computerNumber = computerNumber;
    }

}
