package com.keyPoint.step_definitions;

        import com.keyPoint.utilities.Driver;
        import io.cucumber.java.After;
        import io.cucumber.java.Before;
        import io.cucumber.java.Scenario;
        import org.openqa.selenium.OutputType;
        import org.openqa.selenium.TakesScreenshot;

  public class Hooks {
    @Before
    public void setUp(){
        System.out.println("Empty hook before");
    }
    //create several before and after methods to run for specific scenario


    @After("@driver")
    public void specialTearDown(){
        System.out.println("Special empty after hook ");
    }
    @After
    public void teardown(Scenario scenario){
        if (scenario.isFailed()){
            final byte[]screenshot= ((TakesScreenshot)Driver.get()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image,png","screenshot");
        }
        Driver.closeDriver();
    }
}
