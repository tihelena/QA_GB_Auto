package ru.gb.tests.previous;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.URL;

public class MyThirdTest {
    //регистрация: валидный email и пароль

    @Test
    public void checkValidSignUp() throws Exception {

        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName", "Pixel");
        capabilities.setCapability("platformVersion", "10");
        capabilities.setCapability("udid", "emulator-5554");
        capabilities.setCapability("automationName", "UiAutomator2");
        capabilities.setCapability("unicodeKeyboard",true);

        capabilities.setCapability("app", "/Users/elenatihonova/Downloads/Android-NativeDemoApp-0.2.1.apk");
        MobileDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

        //tap Login
        Thread.sleep(2000);
        MobileElement loginMenuButton = (MobileElement) driver.findElementByAccessibilityId("Login");
        loginMenuButton.click();
        Thread.sleep(2000);

        //tap sign up
        MobileElement signUp = (MobileElement) driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"button-sign-up-container\"]/android.view.ViewGroup/android.widget.TextView");
        signUp.click();
        Thread.sleep(2000);

        //input email
        MobileElement inputEmail = (MobileElement) driver.findElementByAccessibilityId("input-email");
        inputEmail.click();
        inputEmail.sendKeys("elena@mail.ru");
        Thread.sleep(2000);

        //input password
        MobileElement inputPassword = (MobileElement) driver.findElementByAccessibilityId("input-password");
        inputPassword.click();
        inputPassword.sendKeys("qwerty12345");
        Thread.sleep(2000);

        //confirm password
        MobileElement inputRepeatPassword = (MobileElement) driver.findElementByAccessibilityId("input-repeat-password");
        inputRepeatPassword.click();
        inputRepeatPassword.sendKeys("qwerty12345");
        Thread.sleep(2000);

        //submit
        ((AndroidDriver)driver).pressKey(new KeyEvent(AndroidKey.ENTER));
        Thread.sleep(2000);

        //assert that successfully signed up
        MobileElement message = (MobileElement) driver.findElementById("android:id/message");
        message.click();
        Assert.assertEquals(message.getText(), "You successfully signed up!");



    }
}
