package baseball;

public class Exception {

    public void checkException(String number){
        checkNumber(number);
        isSizeTree(number);
    }
    private void isSizeTree(String number){
        if(number.length() != 3){
            throw new IllegalArgumentException("입력하신 숫자가 3가지가 아닙니다. 잘못된 값으로 프로그램을 종료합니다.");
        }
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
}
