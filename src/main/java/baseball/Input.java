package baseball;

import camp.nextstep.edu.missionutils.Console;
public class Input {
    User user = new User();
    public void enterGameNumber(){
        System.out.print("숫자를 입력해주세요 : ");
        String number = Console.readLine();
        user.addInputNumber(number);
    }
}
