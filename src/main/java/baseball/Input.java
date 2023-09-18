package baseball;

import camp.nextstep.edu.missionutils.Console;
public class Input {
    User user = new User();
    Exception exception = new Exception();
    public void enterGameNumber(){
        System.out.print("숫자를 입력해주세요 : ");
        String number = Console.readLine();
        exception.checkException(number);
        user.addInputNumber(number);
    }
}
