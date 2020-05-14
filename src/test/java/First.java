import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class First {

    String SITE_URL = "https://mvnrepository.com/";

    WebDriver driver;

    @BeforeEach
     public void start (){
        WebDriverManager.operadriver().setup();
        System.out.println("before each test");
    }

    @Test
    public void firstTest (){

    }

    @Test
    public void secondTest (){

    }
}
