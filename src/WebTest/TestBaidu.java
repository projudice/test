package WebTest;

import java.io.File;
import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBaidu {
  private WebDriver driver;
  private String baseUrl;
//  private boolean acceptNextAlert = true;
//  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
	  String driverPath = System.getProperty("user.dir") + "/src/geckodriver.exe";
	  System.setProperty("webdriver.gecko.driver", driverPath);
	  driver = new FirefoxDriver();
	  baseUrl = "http://121.193.130.195:8800";
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testBaidu() throws Exception {
    driver.get(baseUrl + "/");

    File src = new File("./files/»Ìº˛≤‚ ‘√˚µ•.xlsx");
	FileInputStream fis = new FileInputStream(src);
	
	@SuppressWarnings("resource")
	XSSFWorkbook wb=new XSSFWorkbook(fis);
	XSSFSheet sh1= wb.getSheetAt(0);

	for(int i=2;i<sh1.getPhysicalNumberOfRows()-1;i++) {
		String number = sh1.getRow(i).getCell(1).getRawValue();
		String password = number.substring(number.length()-6,number.length());
		String name = sh1.getRow(i).getCell(2).getStringCellValue();
		String gitUrl = sh1.getRow(i).getCell(3).getStringCellValue();

		driver.findElement(By.name("id")).sendKeys(number);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.id("btn_login")).click();
		
		assertEquals(number, driver.findElement(By.id("student-id")).getText());
	    assertEquals(name, driver.findElement(By.id("student-name")).getText());
	    assertEquals(gitUrl, driver.findElement(By.id("student-git")).getText());
	    
	    driver.findElement(By.id("btn_logout")).click();
	    driver.findElement(By.id("btn_return")).click();
	}
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
//    String verificationErrorString = verificationErrors.toString();
//    if (!"".equals(verificationErrorString)) {
//      fail(verificationErrorString);
//    }
  }


}

