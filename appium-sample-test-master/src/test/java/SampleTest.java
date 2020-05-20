import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;

import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.PointOption.point;
import static java.time.Duration.ofSeconds;

public class SampleTest {

    public AndroidDriver<MobileElement> driver;
    public WebDriverWait wait;

    //Elements
    String MenuButton = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.ImageView[1]";
    String PiyasalarButton = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[3]/android.widget.TextView";
    String PiyasaTakipButton="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[5]/android.widget.TextView";
    String TarihsecButton="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ImageButton[3]";
    String TamamButton="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView[2]";
    String PaylasButton="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.ImageView";
    String PaylasButtonic="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]";
    String gmailButton="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.ListView/android.widget.LinearLayout[3]/android.widget.LinearLayout[2]/android.widget.ImageView";
    String kimeMail="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.MultiAutoCompleteTextView";
    String mailadresi="analyst.team@smartpulse.io";
    String subject="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.EditText";
    String gonderbutton="//android.widget.TextView[@content-desc='Send']";

    String Day="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.View[1]";
    String Ay="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.View[2]";

    @BeforeMethod
    public void setup () throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "SSilistre");
        caps.setCapability("udid", "emulator-5554");
        caps.setCapability("platformName", "Android");
        caps.setCapability("platformVersion", "10");
        caps.setCapability("autoGrantPermissions", "true");
        caps.setCapability("appPackage", "com.foreks.android.epias");
        caps.setCapability("appActivity","com.foreks.android.epias.view.splash.SplashActivity");
        driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
        wait = new WebDriverWait(driver, 10);
    }


    @Test
    public void basicTest () throws InterruptedException {
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(MenuButton)));
        driver.findElement(By.xpath(MenuButton)).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(PiyasalarButton)));
        driver.findElement(By.xpath(PiyasalarButton)).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(PiyasaTakipButton)));
        driver.findElement(By.xpath(PiyasaTakipButton)).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(TarihsecButton)));
        driver.findElement(By.xpath(TarihsecButton)).click();

        //Roll Tarih Seçim !


        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(TamamButton)));
        driver.findElement(By.xpath(TamamButton)).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(PaylasButton)));
        driver.findElement(By.xpath(PaylasButton)).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(PaylasButtonic)));
        driver.findElement(By.xpath(PaylasButtonic)).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(gmailButton)));
        driver.findElement(By.xpath(gmailButton)).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(kimeMail)));
        driver.findElement(By.xpath(kimeMail)).sendKeys(mailadresi);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(subject)));
        driver.findElement(By.xpath(subject)).sendKeys("Yapiyoruz biseyler semih silistre!");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(gonderbutton)));
        driver.findElement(By.xpath(gonderbutton)).click();
    }

    @AfterMethod
    public void teardown(){
        driver.quit();
    }
}
