package baseball;

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


    public RandomGameNumber(){
        List<Integer> randomNumberList = new ArrayList<>();
        while (randomNumberList.size() < 3) {
            int randomNumber = Randoms.pickNumberInRange(1, 9);
            if (!randomNumberList.contains(randomNumber)) {
                randomNumberList.add(randomNumber);
            }
        }
        addComputerNumber(randomNumberList);
    }
}
