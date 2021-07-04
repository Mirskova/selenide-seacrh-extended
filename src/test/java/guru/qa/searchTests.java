package guru.qa;

import jdk.internal.org.jline.utils.InfoCmp;
import org.junit.jupiter.api.Test;

import java.beans.PropertyEditor;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static jdk.internal.org.jline.utils.InfoCmp.Capability.byName;

public class SearchTests {

    @Test
    void selenideSearchTest() {
        open("https://www.google.com/");

        $(byName("q")).setValue("selenide").pressEnter();

        $("#search").shouldHave(text("selenide.org"));
    }