import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class update {
    public static void main(String[] args) {
        //Open  the Edge browser
        System.setProperty("webdriver.edge.driver", "C://Users//Asif//Downloads//selenium jars and drivers//drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();

        //navigate to the URl
        driver.get("http://localhost/s/view/login.php");

        //Max the window
        driver.manage().window().maximize();

        driver.findElement(By.name("username")).sendKeys("asif23");

        //enter valid password
        driver.findElement(By.name("password")).sendKeys("H@sanasif1010");

        //click on login
        driver.findElement(By.name("submit")).click();

        driver.findElement(By.name("profile")).click();

        driver.findElement(By.name("name")).clear();

        driver.findElement(By.name("name")).sendKeys("asif hasan");


        driver.findElement(By.name("update")).click();
    }
}