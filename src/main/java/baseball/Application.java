package baseball;

import baseball.model.RandomGameNumber;

public class Application {
    public static void main(String[] args) {
        Output output = new Output();
        output.printStartGame();
        RandomGameNumber randomGameNumber = new RandomGameNumber();
        Input input = new Input();
        input.enterGameNumber();
        System.out.println(randomGameNumber.getComputerNumber());
        System.out.println(input.userGameNumber.getUserNumber());
        output.printEndGame();
    }
}
