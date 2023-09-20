package baseball.exception;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DataExceptionTest {

    DataException exception = new DataException();
    @Test
    public void 문자_숫자_검증() throws Exception{
        //given 이런게 주어졋을때
        String input = "aaa";
        //when 이걸 실행하면
        //then 결과가 예외가 발생함으로 성공
        Assertions.assertThrows(IllegalArgumentException.class,()-> exception.checkNumber(input));
    }

    @Test
    public void 크기검증() throws Exception{
        //given 이런게 주어졋을때
        String input = "1234";
        //when 이걸 실행하면
        //then 크기가 3이 아니므로 예외발생
        assertThrows(IllegalArgumentException.class, ()-> exception.isSizeTree(input));
    }
}