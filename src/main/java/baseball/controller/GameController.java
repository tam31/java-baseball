package baseball.controller;

import baseball.RandomNumber;
import baseball.model.RandomGameNumber;
import baseball.view.Output;

public class GameController {

    Output output = new Output();
    RandomNumber randomNumber = new RandomNumber();
    RandomGameNumber computer = new RandomGameNumber();
    public void proceedGame() {
        output.printStartGame();
        computer.addComputerNumber(randomNumber.selectRandomNumber());
        output.printEndGame();
    }
}
