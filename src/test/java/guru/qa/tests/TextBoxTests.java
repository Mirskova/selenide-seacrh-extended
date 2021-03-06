package guru.qa.tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxTests {

    @BeforeAll
    static void setup() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.startMaximized = true;
    }

    @Test
    void positiveFillTest() {
        open("/text-box");
        $("#userName").setValue("Anna");
        $("#userEmail").setValue("anna@mail.org");
        $("#currentAddress").setValue("city street house");
        $("#permanentAddress").setValue("city street house apt");
        $("#submit").click();

        $("p#name").shouldHave(text("Anna"));
        $("p#email").shouldHave(text("anna@mail.org"));
        $("p#currentAddress").shouldHave(text("city street house"));
        $("p#permanentAddress").shouldHave(text("city street house apt"));

    }

}
