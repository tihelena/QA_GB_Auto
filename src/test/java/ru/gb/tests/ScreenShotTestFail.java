package ru.gb.tests;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import ru.gb.base.BaseTest;
import ru.gb.listeners.AllureListener;

@Listeners(AllureListener.class)
public class ScreenShotTestFail extends BaseTest {

    @Test
   // @Description("Проверяем UI главной страницы с помощью скриншота.")

    public void checkMainPageScreen(){
        openApp()
                .checkFailScreenshot();
    }
}
