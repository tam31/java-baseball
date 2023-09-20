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
        Assertions.assertThrows(IllegalArgumentException.class,()-> exception.checkNumber("12a"));
        Assertions.assertThrows(IllegalArgumentException.class,()-> exception.checkNumber("3a="));
    }

    @Test
    public void 크기검증() throws Exception{
        //given 이런게 주어졋을때
        String input = "1234";
        //when 이걸 실행하면
        //then 크기가 3이 아니므로 예외발생
        assertThrows(IllegalArgumentException.class, ()-> exception.isSizeTree(input));
        assertThrows(IllegalArgumentException.class, ()-> exception.isSizeTree("1"));
        assertThrows(IllegalArgumentException.class, ()-> exception.isSizeTree("12"));
        assertThrows(IllegalArgumentException.class, ()-> exception.isSizeTree(""));
    }

    @Test
    public void 중복검사() throws Exception{
        //given 이런게 주어졋을때
        String input = "333";
        //when 이걸 실행하면
        //then 결과가 중복이 발생함으로 예외처리
        assertThrows(IllegalArgumentException.class, ()-> exception.isNotDuplicate(input));
        assertThrows(IllegalArgumentException.class, ()-> exception.isNotDuplicate("112"));
    }

    @Test
    public void 재시작_1_Or_2 () throws Exception{
        //given 이런게 주어졋을때
        String input = "3";
        //when 이걸 실행하면
        //then 결과가 1,2에 벗어남으로 예외발생
        assertThrows(IllegalArgumentException.class, ()->exception.isRestart(input));
    }
}