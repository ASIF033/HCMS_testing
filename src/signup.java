import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class signup {
    public static void main(String[] args) {
        //Open  the Edge browser
        System.setProperty("webdriver.edge.driver", "C://Users//Asif//Downloads//selenium jars and drivers//drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();

        //navigate to the URl
        driver.get("http://localhost/s/view/signup.php");

        //Max the window
        driver.manage().window().maximize();

        //Enter valid username
        driver.findElement(By.name("name")).sendKeys("sample input");

        driver.findElement(By.name("username")).sendKeys("sample123");

        driver.findElement(By.name("email")).sendKeys("sample123@gmail.com");

        driver.findElement(By.name("contact")).sendKeys("01879665538");

        //enter valid password
        driver.findElement(By.name("password")).sendKeys("S@mple1010");

        //click on login
        driver.findElement(By.name("submit")).click();
    }
}