package task1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotelPage extends Baseclasstask {
	
	public SearchHotelPage() {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id="location")
	private WebElement txtlocation;
	
	@FindBy(id="username_show")
	private WebElement txtwelcomemsg;
	
	@FindBy(id="hotels")
	private WebElement ddnhotels;
	
	@FindBy(id="room_type")
	private WebElement ddnroomtype;
	
	@FindBy(id="room_nos")
	private WebElement ddnroomno;
	
	@FindBy(id="datepick_in")
	private WebElement txtdatepickin;
	
	@FindBy(id="datepick_out")
	private WebElement txtdatepickout;
	
	@FindBy(id="adult_room")
	private WebElement txtadultroom;
	
	@FindBy(id="child_room")
	private WebElement txtchildroom;
	
	@FindBy(id="Submit")
	private WebElement btnsubmit;

	public WebElement getDdnlocation() {
		return getDdnlocation();
	}

	public WebElement getTxtwelcomemsg() {
		return txtwelcomemsg;
	}

	public WebElement getDdnhotels() {
		return ddnhotels;
	}

	public WebElement getDdnroomtype() {
		return ddnroomtype;
	}

	public WebElement getDdnroomno() {
		return ddnroomno;
	}

	public WebElement getTxtdatepickin() {
		return txtdatepickin;
	}

	public WebElement getTxtdatepickout() {
		return txtdatepickout;
	}

	public WebElement getTxtadultroom() {
		return txtadultroom;
	}

	public WebElement getTxtchildroom() {
		return txtchildroom;
	}

	public WebElement getBtnsubmit() {
		return btnsubmit;
	}
	
	public void SearchHotel(String location, String Hotels, String roomtype, String noofrooms, String checkindate, String checkoutdate, String adultdperroom, String childrenperroom  ) {
		
		sendKeysAndEnter(getDdnlocation(), location);
		sendKeysAndEnter(getDdnhotels(), Hotels);
		sendKeysAndEnter(getDdnroomtype(), roomtype);
		sendKeysAndEnter(getDdnroomno(), noofrooms);
		
		sendKeysAndEnter(getTxtdatepickin(), checkindate);
		sendKeysAndEnter(getTxtdatepickout(), checkoutdate);
		
		sendKeysAndEnter(getTxtadultroom(), adultdperroom);
		sendKeysAndEnter(getTxtchildroom(), childrenperroom);
		elementclick(getBtnsubmit());
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
}
