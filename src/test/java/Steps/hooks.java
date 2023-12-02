package Steps;

import Base.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class hooks extends BaseClass {
    @Before
    public void runsBeforeAnyScenarios(){
        System.out.println("before");
    }
    @After
    public void runsAfterAnyScenarios(){

    }
}
