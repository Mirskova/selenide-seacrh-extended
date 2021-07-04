package guru.qa;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class textBoxTests {

    @BeforeAll
    static void setup() {
        Configuration.baseUrl = "https://demoqa.com/";
    }

    @Test
    void positiveFillTest() {
        open("/text-box");
        $("#userName").setValue("Anna");
        $("#userEmail").setValue("anna@mail.org");
        $("#currentAddress").setValue("city street house");
        $("#permanentAddress").setValue("city street house apt");
        $("#submit").click();

    }
}
