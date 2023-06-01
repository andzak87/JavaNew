import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;

public class TestClassTest {

    @Test
    void successfullSearchTest(){
        open("https://www.google.com/");

    }
}
