package baseball.controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GameControllerTest {

    GameController gameController = new GameController();
    @Test
    public void 스트라이크개수() throws Exception{
        //given 이런게 주어졋을때
        List<Integer> computer = List.of(1,2,3);
        List<Integer> user = List.of(1,3,2);
        //when 이걸 실행하면
        int strikeCount = gameController.isStrikeCount(computer, user);
        int strikeCount2 = gameController.isStrikeCount(List.of(1,2,3), List.of(1,2,4));
        int strikeCount3 = gameController.isStrikeCount(List.of(1,2,3), List.of(1,2,3));
        int strikeCount4 = gameController.isStrikeCount(List.of(1,2,3), List.of(4,5,6));
        //then 결과가 이렇게 된다
        Assertions.assertEquals(1,strikeCount);
        Assertions.assertEquals(2,strikeCount2);
        Assertions.assertEquals(3,strikeCount3);
        Assertions.assertEquals(0,strikeCount4);
    }

    @Test
    public void 볼개수() throws Exception{
        //given 이런게 주어졋을때
        List<Integer> computer = List.of(1,2,3);
        List<Integer> user = List.of(1,3,4);
        //when 이걸 실행하면
        int ballCount = gameController.isBallCount(computer, user);
        int ballCount2 = gameController.isBallCount(List.of(1,2,3), List.of(1,3,2));
        int ballCount3 = gameController.isBallCount(List.of(1,2,3), List.of(3,1,2));
        int ballCount4 = gameController.isBallCount(List.of(1,2,3), List.of(4,5,6));
        //then 결과가 이렇게 된다
        Assertions.assertEquals(1,ballCount);
        Assertions.assertEquals(2,ballCount2);
        Assertions.assertEquals(3,ballCount3);
        Assertions.assertEquals(0,ballCount4);

    }


    @Test
    public void 스트라이크개수에따른결과검증() throws Exception{
        //given 이런게 주어졋을때
        boolean strike1 = gameController.isThreeStrike(1);
        boolean strike2 = gameController.isThreeStrike(2);
        boolean strike3 = gameController.isThreeStrike(3);
        boolean strike4 = gameController.isThreeStrike(4);
        //when 이걸 실행하면
        //then 결과가 이렇게 된다
        Assertions.assertEquals(false, strike1);
        Assertions.assertEquals(false, strike2);
        Assertions.assertEquals(true, strike3);
        Assertions.assertEquals(false, strike4);

    }
}