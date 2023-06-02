import com.codeborne.selenide.Configuration;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static com.codeborne.selenide.Selenide.open;

public class TestClassTest {

    @Test
    void successfullSearchTest(){
        open("https://www.google.com/");
        open("https://www.google.com/");
        open("https://www.google.com/");

    }
    void newTest (){
        Configuration.browser="safari";
        Assertions.assertEquals(3,3);

    }
}
