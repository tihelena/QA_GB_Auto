package ru.gb.locators.Android;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import ru.gb.locators.interfaces.SwipePageLocators;

public class AndroidSwipePageLocators implements SwipePageLocators {
    @Override
    public By swipeCard() {
        return MobileBy.xpath("//android.view.ViewGroup[@content-desc=\"Swipe\"]/android.view.ViewGroup/android.widget.TextView");
    }
}
