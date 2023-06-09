package Tests;

import Pages.LoginPage;
import Pages.MainPage;
import com.codeborne.selenide.Configuration;
import org.junit.Ignore;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class PageObjectTests {

    @BeforeAll
    static void beforeEach() {
        Configuration.baseUrl = "https://stag.vrbangers.com";
        Configuration.browserSize = "1920x1080";
        //new MainPage().clickSplashScreen();
    }

    @Test
    void authorization() {
        open("/login/");
        new MainPage().clickSplashScreen();
        new LoginPage().inputEmail("2023-06-07.12-43-10zl@mailto.plus")
                       .inputCorrectPassword("2023-06-07.12-43-10zl@mailto.plus");

    }


}

