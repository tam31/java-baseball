package baseball.controller;

import baseball.view.Output;

public class GameController {

    Output output = new Output();
    public void proceedGame() {
        output.printStartGame();

        output.printEndGame();
    }
}
