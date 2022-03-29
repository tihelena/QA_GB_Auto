package ru.gb.tests.previous;


import io.appium.java_client.MobileBy;
import org.testng.annotations.Test;
import ru.gb.base.BaseTest;
import java.io.File;
import static com.codeborne.selenide.Selenide.$;

@Test
public class ScreenShotHelper extends BaseTest {

    public void createScreen() {
        openApp();
        File actualScreenShot =$(MobileBy.AccessibilityId("Home-screen")).screenshot();
    }


}
