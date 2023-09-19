package baseball.view;

public class Output {

    public void printStartGame(){
        System.out.println("숫자 야구 게임을 시작합니다.");
    }

    public void printEndGame(){
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
    }


    public void ThreeStrike() {
        System.out.println("3스트라이크");
    }

    public void isZeroStrikeAndBall() {
        System.out.println("낫싱");
    }
}
