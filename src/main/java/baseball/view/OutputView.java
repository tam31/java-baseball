package baseball.view;

public class OutputView {

    private static final String START_MESSAGE = "숫자 야구 게임을 시작합니다.";
    private static final String END_MESSAGE = "3개의 숫자를 모두 맞히셨습니다! 게임 종료";
    private static final String THREE_STRIKE_MESSAGE = "3스트라이크";
    private static final String ZERO_STRIKE_BALL_MESSAGE = "낫싱";
    private static final String STRIKE_MESSAGE = "스트라이크";
    private static final String BALL_MESSAGE = "볼";

    public void printStartGame(){
        System.out.println(START_MESSAGE);
    }

    public void printEndGame(){
        System.out.println(END_MESSAGE);
    }


    public void ThreeStrike() {
        System.out.println(THREE_STRIKE_MESSAGE);
    }

    public void isZeroStrikeAndBall() {
        System.out.println(ZERO_STRIKE_BALL_MESSAGE);
    }

    public void isZeroStrike(int ball) {
        System.out.println(ball+BALL_MESSAGE);
    }

    public void isZeroBall(int strike) {
        System.out.print(strike+STRIKE_MESSAGE);
    }

    public void isStrikeAndBall(int strike, int ball) {
        System.out.println(ball+BALL_MESSAGE+" "+strike+STRIKE_MESSAGE);
    }
}
