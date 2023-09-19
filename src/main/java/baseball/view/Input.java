package baseball.view;

import baseball.exception.DataException;
import baseball.model.UserGameNumber;
import camp.nextstep.edu.missionutils.Console;
public class Input {
    UserGameNumber userGameNumber = new UserGameNumber();
    DataException dataException = new DataException();
    public void enterGameNumber(){
        System.out.print("숫자를 입력해주세요 : ");
        String number = Console.readLine();
        dataException.checkException(number);
        userGameNumber.addUserNumber(number);
    }
}
