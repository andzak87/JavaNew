package Pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class MainPage {
    private SelenideElement splashScreenButton = $("[data-testid='splashscreen-button-yes']");
    public void openMainPage(){
        open("https://stag.vrbangers.com");
        //$("[data-testid='splashscreen-button-yes']").click();
    }
    public void clickSplashScreen(){
        splashScreenButton.click();
    }


}
