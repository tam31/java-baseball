package baseball.exception;

public class DataException {

    public void checkException(String number){
        checkNumber(number);
        isSizeTree(number);
        isNotDuplicate(number);
    }
    private void checkNumber(String number) {
        if(isNotNumber(number)){
            throw new IllegalArgumentException(number +"는 숫자가 아닙니다. 숫자를 입력하시오. 잘못된 값으로 프로그램이 종료됩니다.");
        }
    }
    private boolean isNotNumber(String number){
        for(int i=0; i<number.length(); i++){
            if(Character.isAlphabetic(number.charAt(i))){
                return true;
            }
        }
        return false;
    }

    private void isSizeTree(String number){
        if(number.length() != 3){
            throw new IllegalArgumentException("입력하신 숫자가 3가지가 아닙니다. 잘못된 값으로 프로그램을 종료합니다.");
        }
    }

    private void isNotDuplicate(String number){
        if(number.charAt(0) == number.charAt(1) ||
                number.charAt(1) == number.charAt(2) ||
                number.charAt(0) == number.charAt(2)){
            throw new IllegalArgumentException(number+"중 중복되는 값이 있습니다. 잘못된 값으로 프로그램을 종료합니다.");
        }
    }

    public void isRestart(String answerUser) {
        if(!(answerUser.equals("1") || answerUser.equals("2"))){
            throw new IllegalArgumentException("잘못된 값으로 프로그램을 종료합니다.");
        }
    }
}
