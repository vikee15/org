package task1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingConfirmationPage extends Baseclasstask{
	
	public BookingConfirmationPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="Booked Itinerary")
	private WebElement txtbookeditinerary;

	public WebElement getTxtbookeditinerary() {
		return txtbookeditinerary;
	}
	
	public void Bookingconfirm() {
		elementclick(getTxtbookeditinerary());
		
		
	}
	
	
	
	
	

}
