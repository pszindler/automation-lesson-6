import io.github.bonigarcia.seljup.SeleniumJupiter;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import org.openqa.selenium.WebDriver;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(SeleniumJupiter.class)
public class SiteTest {

    @ParameterizedTest
    @EnumSource(value = Titles.class, names = {"SII"})
    @DisplayName("Check the title of sii.pl")
    @Tag("regression")
    @Tag("booking")
    void checkTitleForBookingCom(Titles title, WebDriver driver) {
        driver.get("https://sii.pl/");
        String actualTitle = driver.getTitle();
        assertThat(actualTitle).isEqualTo(title.toString());
    }

    @ParameterizedTest
    @EnumSource(value = Titles.class, names = {"ONET"})
    @DisplayName("Check the title of onet.pl")
    @Tag("regression")
    @Tag("onet")
    void checkTitleForOnetPl(Titles title, WebDriver driver) {
        driver.get("https://www.onet.pl");
        String actualTitle = driver.getTitle();
        assertThat(actualTitle).isEqualTo(title.toString());
    }

    @ParameterizedTest
    @EnumSource(value = Titles.class, names = {"KOTUSZKOWO"})
    @DisplayName("Check the title of kotuszkowo.pl")
    @Tag("regression")
    @Tag("kotuszkowo")
    void checkTitleForKotuszkowoPl(Titles title, WebDriver driver) {
        driver.get("http://kotuszkowo.pl/");
        String actualTitle = driver.getTitle();
        assertThat(actualTitle).isEqualTo(title.toString());
    }

    @ParameterizedTest
    @EnumSource(value = Titles.class, names = {"FILMWEB"})
    @DisplayName("Check the title of filmweb.pl")
    @Tag("regression")
    @Tag("filmweb")
    void checkTitleForFilmwebPl(Titles title, WebDriver driver) {
        driver.get("https://www.filmweb.pl");
        String actualTitle = driver.getTitle();
        assertThat(actualTitle).isEqualTo(title.toString());
    }

    @ParameterizedTest

    @EnumSource(value = Titles.class, names = {"SELENIUM"})
    @DisplayName("Check the title of selenium.dev")
    @Tag("regression")
    @Tag("selenium")
    void checkTitleForSeleniumDev(Titles title, WebDriver driver) {
        driver.get("https://www.selenium.dev/documentation/en/webdriver/");
        String actualTitle = driver.getTitle();
        assertThat(actualTitle).isEqualTo(title.toString());
    }
}