package baseball.model;

import java.util.List;

public class RandomNumberModel {

    private List<Integer> computerNumber;

    public List<Integer> getComputerNumber() {
        return computerNumber;
    }

    public void addComputerNumber(List<Integer> computerNumber) {
        this.computerNumber = computerNumber;
    }

}
