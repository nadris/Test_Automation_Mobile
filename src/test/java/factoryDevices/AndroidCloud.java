package factoryDevices;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class AndroidCloud implements IDevice {
    @Override
    public AppiumDriver create() {
        DesiredCapabilities caps = new DesiredCapabilities();

        caps.setCapability("browserstack.user", "");
        caps.setCapability("browserstack.key", "");

        caps.setCapability("app", "bs://");

        caps.setCapability("device", "Google Pixel 3");
        caps.setCapability("os_version", "9.0");

        caps.setCapability("project", "Catolica");
        caps.setCapability("build", "1.0");
        caps.setCapability("name", "WhenDo");

        AndroidDriver<AndroidElement> driver;
        try {
            driver = new AndroidDriver<AndroidElement>(
                    new URL("http://hub.browserstack.com/wd/hub"), caps);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }

        return driver;
    }
}
