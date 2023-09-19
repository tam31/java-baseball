package baseball.controller;

import baseball.model.UserGameNumber;
import baseball.number.InputNumber;
import baseball.number.RandomNumber;
import baseball.model.RandomGameNumber;
import baseball.view.Input;
import baseball.view.Output;

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
        input.enterGameNumber();
        user.addUserNumber(inputNumber.inputUserNumber());
        output.printEndGame();
    }
}
