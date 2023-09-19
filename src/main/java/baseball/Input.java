package baseball;

import baseball.model.UserGameNumber;
import camp.nextstep.edu.missionutils.Console;
public class Input {
    UserGameNumber userGameNumber = new UserGameNumber();
    Exception exception = new Exception();
    public void enterGameNumber(){
        System.out.print("숫자를 입력해주세요 : ");
        String number = Console.readLine();
        exception.checkException(number);
        userGameNumber.addUserNumber(number);
    }
}
