package task1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CancelBooking extends Baseclasstask {
	
	public CancelBooking() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="order_id_text")
	private WebElement txtsearchbox;
	
	@FindBy(id="search_hotel_id")
	private WebElement btnclickgo;
	
	@FindBy(id="ids[]")
	private WebElement selectcheckbox;
	
	@FindBy(id="btn_id_765796")
	private WebElement btnclickcancel;

	public WebElement getTxtsearchbox() {
		return txtsearchbox;
	}

	public WebElement getBtnclickgo() {
		return btnclickgo;
	}

	public WebElement getSelectcheckbox() {
		return selectcheckbox;
	}

	public WebElement getBtnclickcancel() {
		return btnclickcancel;
	}
	
	
	
	
	
	
	

	
	
}
