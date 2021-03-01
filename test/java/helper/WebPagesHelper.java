package helper;

import org.openqa.selenium.WebDriver;

import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Nicolas Pansardi
 */

public class WebPagesHelper {
    Pattern p;
    Matcher m;

    /**
     * Switch's to a window that is already in existance.
     *
     * @param regex Regex enabled. Url of the window, or title.
     * @return
     */
    public Boolean switchToWindow(WebDriver driver, String regex) {
        Boolean found = Boolean.FALSE;
        Set<String> windows = driver.getWindowHandles();

        for (String window : windows) {
            driver.switchTo().window(window);
            System.out.println(String.format("#switchToWindow() : title=%s ; url=%s",
                    driver.getTitle(),
                    driver.getCurrentUrl()));

            p = Pattern.compile(regex);
            m = p.matcher(driver.getTitle());

            if (m.find()) return found = Boolean.TRUE;
            else {
                m = p.matcher(driver.getCurrentUrl());
                if (m.find()) return found = Boolean.TRUE;
            }
        }

        return found;
    }
}
