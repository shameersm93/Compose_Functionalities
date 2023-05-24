package com.Base_Class;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;

	public static WebDriver browser(String browsername) {
		try {
			if (browsername.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\eclipse-workspace\\Compose_Functionality\\Driver\\chromedriver.exe");
				driver = new ChromeDriver();
				WebDriverManager.chromedriver().setup();

			} else if (browsername.equalsIgnoreCase("ie")) {
				System.setProperty("webdriver.ie.driver",
						"C:\\Users\\Lenovo\\eclipse-workspace\\Cproject1\\Driver\\chromedriver.exe");
				// driver = new InternetExplorerDriver();
				// WebDriverManager.chromedriver().setup();

			} else {
				System.out.println("Invalid Browser");
			}
			driver.manage().window().maximize();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return driver;

	}

	public static void getUrl(String url) {
		driver.get(url);
	}

	public static void actions(WebElement a, String s) {
		try {
			if (s.equalsIgnoreCase("moveToElement")) {
				Actions ac = new Actions(driver);
				ac.moveToElement(a).perform();
			} else if (s.equalsIgnoreCase("contextclick")) {
				Actions ac = new Actions(driver);
				ac.contextClick(a).perform();
			} else if (s.equalsIgnoreCase("click")) {
				Actions ac = new Actions(driver);
				ac.click().perform();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void currenturl() {
		String currenturl = driver.getCurrentUrl();
		System.out.println(currenturl);
	}

	public static void forward() {
		driver.navigate().forward();

	}

	public static void backward() {
		driver.navigate().back();
	}

	public static void refresh() {
		driver.navigate().refresh();
	}

	public static void navigateTo(String url) {
		driver.navigate().to(url);
	}

	public static void close() {
		driver.close();
	}

	public static void quit() {
		driver.quit();
	}

	public static void getTitle() {
		String title = driver.getTitle();
		System.out.println();
	}

	public static void isEnabled(WebElement element) {
		element.isEnabled();
	}

	public static void isDisplayed(WebElement element) {
		element.isEnabled();
	}

	public static void selected(WebElement element) {
		element.isSelected();
	}

	public static void Screenshot(String filename) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destinate = new File(System.getProperty("screenshot.dir") + "\\screenshot" + filename + ".png");
		FileUtils.copyFileToDirectory(source, destinate);
	}

	public static void Selection(WebElement element, String Option, String value) {
		Select sc = new Select(element);

		try {
			if (Option.equalsIgnoreCase("byIndex")) {
				int parseInt = Integer.parseInt(value);
				sc.selectByIndex(parseInt);
			} else if (Option.equalsIgnoreCase("byValue")) {
				sc.selectByValue(value);
			}

			else if (Option.equalsIgnoreCase("byVisibleText")) {
				sc.selectByVisibleText(value);
			} else {
				System.out.println("Invalid Option");
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
	}

	public static void Sendkeys(WebElement element, String value) {
		try {
			element.sendKeys(value);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void Click(WebElement element) {
		element.click();
	}

	public static void Clear(WebElement element) {
		try {
			element.clear();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void SimpleAlert(WebElement element) {
		driver.switchTo().alert().accept();
	}

	public static void ConfirmAlert(String ok, String Cancel) {
		if (ok.equalsIgnoreCase("ok")) {
			driver.switchTo().alert().accept();
		} else if (Cancel.equalsIgnoreCase("Cancel")) {
			driver.switchTo().alert().dismiss();
		}
	}

	public static void PromptAlert(String ok, String Value, String Cancel) {
		if (ok.equalsIgnoreCase("ok")) {
			driver.switchTo().alert().sendKeys(Value);
			driver.switchTo().alert().accept();

		} else if (Cancel.equalsIgnoreCase("Cancel")) {
			driver.switchTo().alert().dismiss();
		}
	}

	public static void Robo() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

	public static void Scrollup(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", element);

	}

	public static void ScrollDown(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", element);
	}

	public static void FrameMethod(String option, String value, WebElement element) {
		try {
			if (option.equalsIgnoreCase("byIndex")) {
				int index = Integer.parseInt(value);
				driver.switchTo().frame(index);
			} else if (option.equalsIgnoreCase("byElement")) {
				driver.switchTo().frame(element);
			} else if (option.equalsIgnoreCase("byString")) {
				driver.switchTo().frame(value);
			} else {
				System.out.println("Invalid Selection");
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
	}

	public static void ElementClear(WebElement element) {
		element.clear();
	}

	public static void WindowHandles() {
		Set<String> element = driver.getWindowHandles();

		for (String st : element) {
			String title = driver.switchTo().window(st).getTitle();
			System.out.println(title);

		}

	}


}
