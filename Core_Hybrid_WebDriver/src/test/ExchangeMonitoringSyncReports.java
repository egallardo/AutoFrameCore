package test;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.poc.util.CsvReader;
import com.poc.util.Utils;


public class ExchangeMonitoringSyncReports {
	WebDriverWait wait;
	WebDriver driver;
	Utils Utils = new Utils();

	List<String> results = new ArrayList<String>();


	@DataProvider
	public Object[][] importedData(){
		CsvReader csvUtil = new CsvReader();
		Object[][] data = new Object[16][3];

		//		System.out.println(ListOfCompanys.size());
		/**
		 * device div options
		 * 1,3,5,7
		 * 
		 * task div options
		 * 2,4,6,8
		 * 
		 * device[div], task[div]
		 */

		// Device 1 
		//device, task
		data[0][0] = "1";
		data[0][1] = "2";
		data[0][2] = "1";

		data[1][0] = "1";
		data[1][1] = "2";
		data[1][2] = "2";

		data[2][0] = "1";
		data[2][1] = "2";
		data[2][2] = "3";

		data[3][0] = "1";
		data[3][1] = "2";
		data[3][2] = "4";

		// Device 2
		//device, task
		data[4][0] = "3";
		data[4][1] = "4";
		data[4][2] = "1";

		data[5][0] = "3";
		data[5][1] = "4";
		data[5][2] = "2";

		data[6][0] = "3";
		data[6][1] = "4";
		data[6][2] = "3";

		data[7][0] = "3";
		data[7][1] = "4";
		data[7][2] = "4";

		// Device 3
		data[8][0] = "5";
		data[8][1] = "6";
		data[8][2] = "1";

		data[9][0] = "5";
		data[9][1] = "6";
		data[9][2] = "2";

		data[10][0] = "5";
		data[10][1] = "6";
		data[10][2] = "3";

		data[11][0] = "5";
		data[11][1] = "6";
		data[11][2] = "4";

		// Device 4
		data[12][0] = "7";
		data[12][1] = "8";
		data[12][2] = "1";

		data[13][0] = "7";
		data[13][1] = "8";
		data[13][2] = "2";

		data[14][0] = "7";
		data[14][1] = "8";
		data[14][2] = "3";

		data[15][0] = "7";
		data[15][1] = "8";
		data[15][2] = "4";

		return data;
	}
	@Test(dataProvider="importedData")
	public void generateReports(String device, String task, String item) throws InterruptedException{
		// Initializing driver use Chrome or Firefox.
		driver = Utils.configureWebDriver(driver, "Firefox");

		wait = new WebDriverWait(driver, 30);
		driver.manage().window().maximize(); 

		login("", "" ,driver);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='templates']/div[1]/div[2]/div[1]/ul/li[1]/i[1]")));
		WebElement serverViewMonitoring = driver.findElement(By.xpath("//*[@id='templates']/div[1]/div[2]/div[1]/ul/li[1]/i[1]"));


		serverViewMonitoring.click();
		Thread.sleep(5000);
		WebElement device1 = driver.findElement(By.xpath("//*[@id='templates']/div[1]/div[2]/div[2]/div[2]/div["+device+"]/div/ul/li[1]/ul/li[1]/i[1]"));

		device1.click();
		Thread.sleep(3000);

		WebElement actions = driver.findElement(By.xpath("//*[@id='templates']/div[1]/div[2]/div[2]/div[2]/div["+task+"]/div[2]/div/ul/li["+item+"]/div/ul/li[3]/div[1]/i"));
		actions.click();
		Thread.sleep(5000);

		WebElement option = driver.findElement(By.xpath("html/body/div[7]/div/ul/li[10]/a"));
		option.click();

		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE, -1);
		Date dateBeforeToday = cal.getTime();


		String newstring1 = new SimpleDateFormat("MM/dd/yyyy").format(dateBeforeToday);
		String newstring2 = new SimpleDateFormat("MM/dd/yyyy").format(new Date());

		String stdate = newstring1 + " 8:00";
		String eddate = newstring2 + " 20:00";

		Thread.sleep(3000);

		WebElement startDate = driver.findElement(By.xpath("//*[@id='Filter']/fieldset/div/dl/dd[6]/input"));
		startDate.clear();;
		startDate.sendKeys(stdate);
		WebElement endDate = driver.findElement(By.xpath("//*[@id='Filter']/fieldset/div/dl/dd[7]/input"));
		endDate.clear();;
		endDate.sendKeys(eddate);
		WebElement submit = driver.findElement(By.xpath("//*[@id='Filter']/fieldset/div/dl/dd[8]/input"));

		submit.click();

		String path = "//*[@id='overall']/tbody/tr[1]/td[2]";
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(path)));
		Thread.sleep(3000);

		String numberOfSuccess = driver.findElement(By.xpath("//*[@id='overall']/tbody/tr[1]/td[2]")).getText();
		System.out.println(numberOfSuccess);
		String numberOfFailures = driver.findElement(By.xpath("//*[@id='overall']/tbody/tr[2]/td[2]")).getText();
		System.out.println(numberOfFailures);
		String aveRespTime = driver.findElement(By.xpath("//*[@id='overall']/tbody/tr[3]/td[2]")).getText();
		System.out.println(aveRespTime);

		results.add(numberOfSuccess);
		results.add(numberOfFailures);
		results.add(aveRespTime);
		Thread.sleep(2000);

		List<WebElement> tr_collection=driver.findElements(By.xpath("//*[@id='lastErrors']/table[1]/tbody/tr[2]/td/table[1]/tbody/tr"));
		ArrayList<String> errors = new ArrayList<String>();
		//System.out.println("NUMBER OF ROWS IN THIS TABLE = "+tr_collection.size());
		int row_num,col_num;
		row_num=1;
		for(WebElement trElement : tr_collection)
		{
			List<WebElement> td_collection=trElement.findElements(By.xpath("td"));
			//System.out.println("NUMBER OF COLUMNS="+td_collection.size());
			col_num=1;
			for(WebElement tdElement : td_collection)
			{

				if (row_num % 3 == 0 && col_num == 4) {
					//row_num j is an exact multiple of 3
					errors.add(tdElement.getText());
					results.add(tdElement.getText());
					System.out.println("row # "+row_num+", col # "+col_num+ "text="+tdElement.getText());
				}
				col_num++;
			}
			row_num++;
		}

		results.add("-------------");

		FileWriter writer;
		try {
			writer = new FileWriter("../Core_Hybrid_WebDriver/src/com/poc/csv/sto1.csv");
			
		    String collect = results.stream().collect(Collectors.joining(","));
		    System.out.println(collect);

		    writer.write(collect);
		    writer.close();
		    
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//System.out.println("Error No 1: " + row.getText());
		driver.close();
	}

	private void login(String user, String password, WebDriver driver) throws InterruptedException{
		driver.get("https://www.dotcom-monitor.com/");

		WebElement clientSignIn = driver.findElement(By.xpath(".//*[@id='main-nav']/li[6]/a/span"));
		Thread.sleep(5000);
		clientSignIn.click();
		Thread.sleep(5000);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("UserName")));
		WebElement loginName = driver.findElement(By.id("UserName"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Password")));
		WebElement loginPassword = driver.findElement(By.id("Password"));

		loginName.sendKeys(user);
		loginPassword.sendKeys(password);

		WebElement logonButton = driver.findElement(By.xpath("html/body/div[4]/section/div/form/div/div[3]/button"));
		logonButton.click();
		Thread.sleep(15000);
	}
}
