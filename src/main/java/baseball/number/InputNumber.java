package baseball.number;

import baseball.exception.DataException;
import camp.nextstep.edu.missionutils.Console;
public class InputNumber {

    public String inputUserNumber(){
        String inputUser =  Console.readLine();
        DataException exception = new DataException();
        exception.checkException(inputUser);
        return inputUser;
    }
}
