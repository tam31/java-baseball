package baseball.controller;

import baseball.RandomNumber;
import baseball.view.Output;

public class GameController {

    Output output = new Output();
    RandomNumber randomNumber = new RandomNumber();
    public void proceedGame() {
        output.printStartGame();
        System.out.println(randomNumber.selectRandomNumber());
        output.printEndGame();
    }
}
