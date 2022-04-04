package ru.gb.tests.swipe;

import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import ru.gb.base.BaseTest;
import ru.gb.listeners.AllureListener;

@Listeners(AllureListener.class)
public class CheckSwipeCardVisible extends BaseTest {

    @Test
    @Description("Проверяем отображение карточки на экране")
    public void isCardVisible(){
        openApp()
                .clickSwipeMenuButton()
                .isSwipeCardVisible();
    }



}
