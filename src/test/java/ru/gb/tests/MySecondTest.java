package ru.gb.tests;


import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.URL;


public class MySecondTest {

    //заполнение текстового поля ввода
    @Test
    public void checkFillingInputField() throws Exception {
        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName", "Pixel");
        capabilities.setCapability("platformVersion", "10");
        capabilities.setCapability("udid", "emulator-5554");
        capabilities.setCapability("automationName", "UiAutomator2");

        capabilities.setCapability("app", "/Users/elenatihonova/Downloads/Android-NativeDemoApp-0.2.1.apk");
        MobileDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

        //tap forms
        Thread.sleep(2000);
        MobileElement tabForms = (MobileElement) driver.
                findElementByXPath("//android.view.ViewGroup[@content-desc=\"Forms\"]/android.widget.TextView");
        tabForms.click();
        Thread.sleep(2000);

        //tap input field, send keys "hello world"
        MobileElement inputField = (MobileElement) driver.findElementByAccessibilityId("text-input");
        inputField.click();
        Thread.sleep(2000);
        inputField.sendKeys("hello world");

        //assertion
        MobileElement inputFieldText = (MobileElement) driver.findElementByAccessibilityId("input-text-result");
        Assert.assertEquals(inputFieldText.getText(), "hello world");


    }

}
