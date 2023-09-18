package baseball;

public class Application {
    public static void main(String[] args) {
        Output output = new Output();
        output.printStartGame();
        Input input = new Input();
        input.enterGameNumber();
        output.printEndGame();
    }
}
