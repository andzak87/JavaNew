package Pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {

    private SelenideElement inputEmail = $("[data-testid='element_000182']");
    private SelenideElement loginContinueButton = $("[data-testid='login-page-continue']");
    private SelenideElement inputPassword = $("[data-testid='element_000182']");
    private SelenideElement loginSubmit = $("[data-testid='login-button']");
    private SelenideElement incorrectMessage = $("[data-testid='element_000176']");
    private SelenideElement loginHeadingText = $("[data-testid='login-page-header']");
    private SelenideElement invalidLoginText = $("[data-testid='element_000176'] i");



    public LoginPage inputEmail(String email){       //можно использовать void вместо LoginPage ,но тогда
        inputEmail.setValue(email);                   // каждый раз создаем объект класса PAge
        loginContinueButton.click();
        return this;

    }
    public LoginPage inputCorrectPassword (String password) {
        inputPassword.setValue(password);
        loginSubmit.submit();
        return this;
    }
}
