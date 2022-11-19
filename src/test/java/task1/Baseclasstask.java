package task1;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclasstask {
	public static WebDriver driver;
	public static void getdriver() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	public static void EnterAppUrl(String url) {
		driver.get(url);
	}
	public static void MaximizeWindow() {
		driver.manage().window().maximize();
	}
	public void elementkeys(WebElement element,String data) {
	element.sendKeys(data);
	}
	public void elementkeysJs(WebElement element, String data) {
		JavascriptExecutor executor=(JavascriptExecutor) driver;
		executor.executeScript("arguments[0].setattribute('value','"+data+"')",element);
	}
	public void elementclick(WebElement element) {
		element.click();
	}
	public String gettitle() {
		String title = driver.getTitle();
		return title;
	}
	public WebElement findelementbyid(String attributevalue) {
		WebElement element = driver.findElement(By.id(attributevalue));
		
		return element;	
	}
	public WebElement findelementbyname(String attributevalue) {
		WebElement element = driver.findElement(By.name(attributevalue));
		System.out.println(element);
		return element;	
	}
	public WebElement findelementbyclassName(String attributevalue) {
		WebElement element = driver.findElement(By.className(attributevalue));
		System.out.println(element);
		return element;	
	}
	public WebElement findelementbyxpath(String expression) {
		WebElement element = driver.findElement(By.xpath(expression));
		System.out.println(element);
		return element;	
	}
	public String geturl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}
	public String elementgettext(WebElement element) {
		String text = element.getText();
		return text;
     }
	public void closewindow() {
		driver.close();
	}
	public void quitwindow() {
		driver.quit();
	}
	public String elementgetattribute(WebElement element) {
		String attribute = element.getAttribute("value");
		System.out.println(attribute);
		return attribute;
	}
	public String elementgetattribute(WebElement element,String attributename) {
		String attribute = element.getAttribute(attributename);
		return attribute;
	}
	public void selectoptionbytext(WebElement element,String text) {
		Select select=new Select(element);
		select.selectByVisibleText(text);
	}
	public void selectoptionbyattribute(WebElement element,String value) {
		Select select=new Select(element);
		select.selectByValue(value);
	}
	public void selectoptionbyindex(WebElement element,int index) {
		Select select=new Select(element);
		select.selectByIndex(index);
	}
	public void dragAndDrop(WebElement s, WebElement d) {
		Actions action = new Actions(driver);	
		action.dragAndDrop(s, d).perform();
	}
	public void rightClick() {
		Actions action = new Actions(driver);
		action.contextClick().perform();
	}
	public void doubleClick() {		
		Actions action = new Actions(driver);
		action.doubleClick().perform();		
	}
	public String getFirstSelect(WebElement element) {		
		Select s= new Select(element);
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		String text = firstSelectedOption.getText();
		System.out.println(text);		
		return text;
	}
	public File screenShot() {
		TakesScreenshot screenshot = (TakesScreenshot)driver;
		File file = screenshot.getScreenshotAs(OutputType.FILE);
		return file;
	}
	public void screenShotCopy(String path) throws IOException {
		TakesScreenshot screenshot = (TakesScreenshot)driver;
		File src = screenshot.getScreenshotAs(OutputType.FILE);
		File dest= new File(path);
		FileUtils.copyFile(src, dest);	
	}	
	public void mouseMoveToElement(WebElement element) {
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
	}
	public void refereshPage() {
		driver.navigate().refresh();
	}
	public void sendKeysAndEnter(WebElement element, String data) {
		element.sendKeys(data);
		element.click();
	}
	public void switchToFrameByWebElement(WebElement frameElement) {
		driver.switchTo().frame(frameElement);
	}
	public void switchToFrameIndex(int index) {
		driver.switchTo().frame(index);
	}
	public void switchToFrameName(String title) {
		driver.switchTo().frame(title);
	}
	public void frameToWindow() {
		driver.switchTo().defaultContent();
	}
	public void frame2ToFrame1() {
		driver.switchTo().parentFrame();
	}
	public void childToParentFrame(String value) {
		driver.switchTo().window(value);
	}
	public void clear(WebElement element) {
		element.clear();
	}
	public boolean isDisplayed(String attribueValue) {
		boolean displayed = driver.findElement(By.id(attribueValue)).isDisplayed();
	return displayed;
	}
	public boolean isDisplayedByName(String attribueValue) {
		boolean displayed = driver.findElement(By.name(attribueValue)).isDisplayed();
	return displayed;
	}
	public boolean isDisplayedByxpath(String expression) {
		boolean displayed = driver.findElement(By.xpath(expression)).isDisplayed();
	return displayed;
	}
	public boolean isSelected(String attribueValue) {
		boolean selected = driver.findElement(By.id(attribueValue)).isSelected();
		return selected;
	}
	public boolean isSelectedByName(String attribueValue) {
		boolean selected = driver.findElement(By.name(attribueValue)).isSelected();
		return selected;
	}
	public boolean isSelectedByXpath(String expression) {
		boolean selected = driver.findElement(By.xpath(expression)).isSelected();
		return selected;
	}
	
	public boolean isEnabled(String attributeValue) {
		boolean enabled = driver.findElement(By.id(attributeValue)).isEnabled();
		return enabled;
	}
	public boolean isEnabledByName(String attributeValue) {
		boolean enabled = driver.findElement(By.name(attributeValue)).isEnabled();
		return enabled;
	}
	public boolean isEnabledByxpath(String expression) {
		boolean enabled = driver.findElement(By.id(expression)).isEnabled();
		return enabled;
	}
	public void alertOk() {
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}
	public void alertCancel() {
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
	}
	public void deSelectAll(WebElement element) {
		Select select= new Select(element);
		select.deselectAll();
	}
	public void deSelectByIndex(WebElement element, int index) {
		Select select= new Select(element);
		select.deselectByIndex(index);
	}
	public void deSelectByAttribute(WebElement element,String value) {
		Select select= new Select(element);
		select.deselectByValue(value);
	}
	public void deSelectbyVisibleText(WebElement element,String text) {
		Select select= new Select(element);
		select.deselectByVisibleText(text);
	}
	public boolean isMultipleSelected(WebElement element) {
		Select select= new Select(element);
		boolean multiple = select.isMultiple();
		return multiple;
	}
	public void sendKeysAlert(String data) {
		Alert alert = driver.switchTo().alert();
		alert.sendKeys(data);
	}
	public void enterKey() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
	public void downKey() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
	}
	public void upKey() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_UP);
		r.keyRelease(KeyEvent.VK_UP);
	}
	public void spaceKey() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_SPACE);
		r.keyRelease(KeyEvent.VK_SPACE);
	}
	public void filePath(String path) {
		File f = new File(path);
		File[] listFiles = f.listFiles();
		for (File file : listFiles) {
			System.out.println(file);	
	}
	}
	public void copyToFile(String src,String dest) throws IOException {
		File f = new File(src);
		FileUtils.copyFile(f, f);
	}
	public void jsscrolldown(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeAsyncScript("arguments[0].Scrollintoview(true)",element);
	}
	public void jsscrollup(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeAsyncScript("arguments[0].Scrollintoview(false)",element);
	}
	public void childWindow() {
		String parent = driver.getWindowHandle();
		Set<String>both = driver.getWindowHandles();
		for (String x : both) {
		if(!parent.equals(x)) {
		driver.switchTo().window(x);
		}
	}
	}
	public void backToParentWindow() {
		String parent = driver.getWindowHandle();
		Set<String>both = driver.getWindowHandles();
		for (String x : both) {
		if(parent.equals(x)) {
		driver.switchTo().window(x);
	    }
	}
	}
   
	public String readDataFromCell(String sheetName,int rownum,int cellnum) throws IOException {
		String res="";
		File file=new File("C:\\Users\\91960\\eclipse-workspace\\Baseclass\\sheet\\Book1.xlsx");
		FileInputStream fileInputStream=new FileInputStream(file);
		Workbook workbook=new XSSFWorkbook(fileInputStream);
		Sheet sheet = workbook.getSheet(sheetName);
		Row row = sheet.getRow(rownum);
		Cell cell = row.getCell(cellnum);
		CellType cellType = cell.getCellType();
		switch (cellType) {
		case STRING:
			res = cell.getStringCellValue();
			break;
		case NUMERIC:
			if (DateUtil.isCellDateFormatted(cell)) {
				Date dateCellValue = cell.getDateCellValue();
				SimpleDateFormat dateFormat=new SimpleDateFormat("dd/MM/yyyy");
				res = dateFormat.format(dateCellValue);
			} else {
				double numericCellValue = cell.getNumericCellValue();
				long check = Math.round(numericCellValue);
				if (check==numericCellValue) {
				res = String.valueOf(check);
				} else {
					res = String.valueOf(numericCellValue);
				}

			}
			break;
		default:
			break;
		}
		return res;
	}
	
	public void updateCellData(String sheetName,int rownum,int cellnum, String olddata,String newdata) throws IOException {
		File file=new File("C:\\Users\\91960\\eclipse-workspace\\Baseclass\\sheet\\Book1.xlsx");
		FileInputStream fileInputStream=new FileInputStream(file);
		Workbook workbook=new XSSFWorkbook(fileInputStream);
		Sheet sheet = workbook.getSheet(sheetName);
		Row row = sheet.getRow(rownum);
		Cell cell = row.getCell(cellnum);
		String value = cell.getStringCellValue();
		if (value.equals(olddata)) {
			cell.setCellValue(newdata);
		}
		FileOutputStream fileOutputStream=new FileOutputStream(file);
		workbook.write(fileOutputStream);
			
		}
	
	public void writeCellData(String sheetName,int rownum,int cellnum,String data) throws IOException {
		File file=new File("C:\\Users\\91960\\eclipse-workspace\\Baseclass\\sheet\\Book1.xlsx");
		FileInputStream fileInputStream=new FileInputStream(file);
		Workbook workbook=new XSSFWorkbook(fileInputStream);
		Sheet sheet = workbook.getSheet(sheetName);
		Row row = sheet.getRow(rownum);
		Cell cell = row.createCell(cellnum);
		cell.setCellValue(data);
		FileOutputStream fileOutputStream=new FileOutputStream(file);
		workbook.write(fileOutputStream);	
		
	}
}
