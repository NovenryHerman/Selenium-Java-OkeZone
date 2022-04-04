import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.ClickAndHoldAction;

public class DemoClass {

	public static void main(String[] args) {

		//ini adalah letak dimana ada file chrome drivernya
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\novenry.herman\\Documents\\09Selenium\\chromedriver.exe");

		//ini untuk manggil driver chromenya, kalo pake firefox download dulu driver firefoxnya
		ChromeDriver driver = new ChromeDriver();
		
		//ini untuk memanggil link web di page home
		driver.get("https://www.okezone.com/" );

		//ini untuk menu yg akan di klik klik kanan inspeck -> klik kanan Copy Xpath nya lalu masukkan di dalam kurung
		WebElement p = driver.findElement(By.xpath("//*[@id=\"OkzNavContents\"]/a[5]"));
		p.click();

		/* ketika klik menu lalu muncul popup apapun bisa di close tapi ingat pop up itu
		 muncul page apa, Fokus lihat link atasnya lalu panggil dengan ini */
		driver.get("https://bola.okezone.com/");

		//Setelah kita berada di page link yg kita pilih dan muncul pop up, inspeck button tidak atau tombol closenya, copy XPath
		driver.findElementByXPath("//*[@id=\"onesignal-slidedown-cancel-button\"]").click();
		Alert alertCancel = driver.switchTo().alert();
		alertCancel.dismiss();
		
	        
		// ini SIMPENAN KOMEN 
		//driver.navigate().to("https://travel.okezone.com/");
			
		//baut Klik Kanan
		//Actions action= new Actions(driver);
		 //PATH
		 //*[@id="OkzNavContents"]/a[5]
		//myAction.contextClick(driver.)
		//action.contextClick(WebElement).build().perform();
		
		
	}

}
