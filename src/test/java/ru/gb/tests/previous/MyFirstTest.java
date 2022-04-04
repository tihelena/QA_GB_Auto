package ru.gb.tests.previous;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.IAttributes;
import org.testng.annotations.Test;
import ru.gb.base.BaseTest;

import java.net.URL;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Selectors.byAttribute;
import static com.codeborne.selenide.files.DownloadActions.click;

public class MyFirstTest extends BaseTest {

    @Test
    public void checkEmptyEmail() throws Exception {

   /*     // Устанавливаем capabilities.
        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName", "Pixel");
        capabilities.setCapability("platformVersion", "10");
        capabilities.setCapability("udid", "emulator-5554");
        capabilities.setCapability("automationName", "UiAutomator2");
//      Проверьте актуальность пути до приложения на своём компьютере.
        capabilities.setCapability("app", "/Users/elenatihonova/Downloads/Android-NativeDemoApp-0.2.1.apk");
//        Пример для предустановленного приложения.
//        capabilities.setCapability("appPackage", "com.google.android.apps.maps");
//        capabilities.setCapability("appActivity", "com.google.android.maps.MapsActivity");
//        capabilities.setCapability("noReset", true);

//      Устанавливаем и открываем приложение.
        MobileDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        Thread.sleep(2000);
        //      Нажимаем Login в меню
        MobileElement loginMenuButton = (MobileElement) driver.findElementByAccessibilityId("Login");
        loginMenuButton.click();
        Thread.sleep(2000);
//      Нажимаем Login на странице логин/пароль.
        MobileElement loginButton = (MobileElement) driver.findElementByAccessibilityId("button-LOGIN");
        loginButton.click();
        Thread.sleep(2000);
//      Проверяем текст ошибки.
        MobileElement errorText = (MobileElement) driver.findElementByXPath("//android.widget.ScrollView[@content-desc=\"Login-screen\"]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.TextView[1]");
        Assert.assertEquals(errorText.getText(), "Please enter a valid email address");
    }

*/
//        openApp()
//                .clickLoginMenuButton()
//                .clickLoginButton()
//                .checkLoginErrorText("Please enter a valid email address");
        openApp();

        Selenide.$x("//android.view.ViewGroup[@content-desc=\"Swipe\"]/android.view.ViewGroup/android.widget.TextView").click();
        Selenide.$x("//android.view.ViewGroup[@content-desc=\"Carousel\"]");
       //Selenide.$$(".android.view.ViewGroup").shouldHave(size(7));


    }

}

