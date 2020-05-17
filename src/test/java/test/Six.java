package test;

import org.junit.jupiter.api.Test;

public class Six extends TestBase {

    @Test
    public void sixTest() throws InterruptedException {
        main.goTo()
                .chooseTask("6");

//        taskOne.checkPageIsCorrect();
        taskSix.fillInLogin("tester")
                .fillInPassword("123-xyz")
                .loginButtonClick()
                .isLoginCorrect();
    }

}
