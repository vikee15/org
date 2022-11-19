package task1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotelPage extends Baseclasstask{
	
	public SelectHotelPage() {
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//td[@class='login_title']")
	private WebElement byselecthotel;
	
	@FindBy(id="radiobutton_0")
	private WebElement btnsubmit;
	
	@FindBy(id="continue")
	private WebElement btncontinue;

	public WebElement getByselecthotel() {
		return byselecthotel;
	}

	public WebElement getBtnsubmit() {
		return btnsubmit;
	}

	public WebElement getBtncontinue() {
		return btncontinue;
	}
	
	public void Selecthotel(String byselecthotel, String btnsubmit,String btncontinue) {
		
		elementclick(getBtnsubmit());
		elementclick(getBtncontinue());
	

	}
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
