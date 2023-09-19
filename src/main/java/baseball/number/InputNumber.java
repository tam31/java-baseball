package baseball.number;

import baseball.exception.DataException;
import camp.nextstep.edu.missionutils.Console;
public class InputNumber {

    DataException exception = new DataException();
    public String inputUserNumber(){
        String inputUser =  Console.readLine();
        exception.checkException(inputUser);
        return inputUser;
    }
}
