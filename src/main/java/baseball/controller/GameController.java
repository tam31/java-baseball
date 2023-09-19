package baseball.controller;

import baseball.number.InputNumber;
import baseball.number.RandomNumber;
import baseball.model.RandomGameNumber;
import baseball.view.Input;
import baseball.view.Output;

public class GameController {

    Output output = new Output();
    Input input = new Input();
    RandomNumber randomNumber = new RandomNumber();
    RandomGameNumber computer = new RandomGameNumber();
    InputNumber inputNumber = new InputNumber();
    public void proceedGame() {
        output.printStartGame();
        computer.addComputerNumber(randomNumber.selectRandomNumber());
        input.enterGameNumber();
        inputNumber.inputUserNumber();
        output.printEndGame();
    }
}
