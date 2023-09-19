package baseball.controller;

import baseball.model.UserGameNumber;
import baseball.number.InputNumber;
import baseball.number.RandomNumber;
import baseball.model.RandomGameNumber;
import baseball.view.Input;
import baseball.view.Output;

import java.util.List;

public class GameController {

    Output output = new Output();
    Input input = new Input();
    RandomNumber randomNumber = new RandomNumber();
    InputNumber inputNumber = new InputNumber();
    RandomGameNumber computer = new RandomGameNumber();
    UserGameNumber user = new UserGameNumber();
    public void proceedGame() {
        output.printStartGame();
        computer.addComputerNumber(randomNumber.selectRandomNumber());
        getAnswerUserNumber(computer.getComputerNumber());
        output.printEndGame();
    }

    public void getAnswerUserNumber(List<Integer> computerNumber){
        boolean isDuplicateNumber = false;
        while(!isDuplicateNumber){
            input.enterGameNumber();
            user.addUserNumber(inputNumber.inputUserNumber());
            isDuplicateNumber = isCompareTwoList(computerNumber, user.getUserNumber());
        }
    }

    private boolean isCompareTwoList(List<Integer> computerNumber, List<Integer> userNumber) {
        int strike = isStrikeCount(computerNumber, userNumber);
        int ball = isBallCount(computerNumber, userNumber);
        return isCountStrikeAndBall(strike, ball);
    }

    private int isStrikeCount(List<Integer> computerNumber, List<Integer> userNumber){
        int strikeCount = 0;
        for(int i=0; i<3; i++){
            if(computerNumber.get(i)==userNumber.get(i)){
                strikeCount +=1;
            }
        }
        return strikeCount;
    }

    private int isBallCount(List<Integer> computerNumber, List<Integer> userNumber){
        int ballCount = 0;
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                if(computerNumber.get(i) == userNumber.get(j)){
                    ballCount +=1;
                }
            }
        }
        return ballCount;
    }

    private boolean isCountStrikeAndBall(int strike, int ball){
        if (isThreeStrike(strike)) return true;
        getZeroStrikeAndBall(strike,ball);
        getZeroStrike(strike,ball);
        getZeroBall(strike,ball);
        getStrikeAndBall(strike,ball);
        return false;
    }

    private boolean isThreeStrike(int strike) {
        if(strike ==3){
            output.ThreeStrike();
            return true;
        }
        return false;
    }
}
