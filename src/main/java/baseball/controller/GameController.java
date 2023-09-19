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
        }
    }
    
}
