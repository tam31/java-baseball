package baseball.controller;

import baseball.model.UserGameNumber;
import baseball.number.InputNumber;
import baseball.number.RandomNumber;
import baseball.model.RandomGameNumber;
import baseball.view.InputView;
import baseball.view.OutputView;

import java.util.List;

public class GameController {

    OutputView outputView = new OutputView();
    InputView inputView = new InputView();
    RandomNumber randomNumber = new RandomNumber();
    InputNumber inputNumber = new InputNumber();
    RandomGameNumber computer = new RandomGameNumber();
    UserGameNumber user = new UserGameNumber();
    public void proceedGame() {
        outputView.printStartGame();
        boolean restart = true;
        while(restart){
            computer.addComputerNumber(randomNumber.selectRandomNumber());
            getAnswerUserNumber(computer.getComputerNumber());
            outputView.printEndGame();
            restart = getAnswerRestart();
        }
    }

    private boolean getAnswerRestart() {
        inputView.isRestartGame();
        return inputNumber.getUserAnswerRestart();
    }

    public void getAnswerUserNumber(List<Integer> computerNumber){
        boolean isDuplicateNumber = false;
        while(!isDuplicateNumber){
            inputView.enterGameNumber();
            user.addUserNumber(inputNumber.inputUserNumber());
            isDuplicateNumber = isCompareTwoList(computerNumber, user.getUserNumber());
        }
    }

    private boolean isCompareTwoList(List<Integer> computerNumber, List<Integer> userNumber) {
        int strike = isStrikeCount(computerNumber, userNumber);
        int ball = isBallCount(computerNumber, userNumber);
        return isCountStrikeAndBall(strike, ball);
    }

    public int isStrikeCount(List<Integer> computerNumber, List<Integer> userNumber){
        int strikeCount = 0;
        for(int i=0; i<3; i++){
            if(computerNumber.get(i)==userNumber.get(i)){
                strikeCount +=1;
            }
        }
        return strikeCount;
    }

    public int isBallCount(List<Integer> computerNumber, List<Integer> userNumber){
        int ballCount = 0;
        for(int i=0; i<3; i++){
            if(userNumber.get(i) != computerNumber.get(i) &&
            userNumber.contains(computerNumber.get(i))){
                ballCount +=1;
            }
        }
        return ballCount;
    }

    public boolean isCountStrikeAndBall(int strike, int ball){
        if (isThreeStrike(strike)) return true;
        getZeroStrikeAndBall(strike,ball);
        getZeroStrike(strike,ball);
        getZeroBall(strike,ball);
        getStrikeAndBall(strike,ball);
        return false;
    }

    public boolean isThreeStrike(int strike) {
        if(strike ==3){
            outputView.ThreeStrike();
            return true;
        }
        return false;
    }

    public void getZeroStrikeAndBall(int strike, int ball) {
        if(strike==0 && ball == 0){
            outputView.isZeroStrikeAndBall();
        }
    }

    public void getZeroStrike(int strike, int ball) {
        if(strike==0 && ball !=0){
            outputView.isZeroStrike(ball);
        }
    }

    public void getZeroBall(int strike, int ball) {
        if(ball==0 && strike !=0){
            outputView.isZeroBall(strike);
        }
    }

    public void getStrikeAndBall(int strike, int ball) {
        if(strike !=0 && ball !=0){
            outputView.isStrikeAndBall(strike, ball);
        }
    }
}
