package baseball.view;

public class InputView {
    private static final String INPUT_NUMBER = "숫자를 입력해주세요 : ";
    private static final String INPUT_RESTART = "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.";

    public void enterGameNumber(){
        System.out.print(INPUT_NUMBER);
    }

    public void isRestartGame() {
        System.out.println(INPUT_RESTART);
    }
}
