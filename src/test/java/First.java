import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;

public class First {

    String SITE_URL = "https://mvnrepository.com/";

    WebDriver driver;

    @BeforeEach
     public void start (){
        WebDriverManager.operadriver().setup();
        driver = new OperaDriver();

//        System.out.println("before each test");
    }

    @AfterEach
    public void finish(){
        driver.quit();
    }

    @Test
    public void firstTest (){
        driver.get(SITE_URL);

    }

    @Test
    public void secondTest (){

    }
}
