package task1;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;

public class Sampl extends Baseclasstask{
	
	@BeforeClass
	public static void beforeclass() {
		getdriver();
		EnterAppUrl("https://adactinhotelapp.com/");
		MaximizeWindow();
		}
	
	@Test
	public void booking() throws IOException, InterruptedException {
		
	WebElement txtusername = findelementbyid("username");	
	String name = readDataFromCell("sheet1", 1, 0);
	elementkeys(txtusername, name);
	
	WebElement txtpassword = findelementbyid("password");
	String pass = readDataFromCell("sheet1", 1,1);
	elementkeys(txtpassword, pass);
	
	WebElement btnlogin = findelementbyid("login");
	elementclick(btnlogin);
	
	WebElement txtloginsuccess = findelementbyid("username_show");
	String actloginsuccessmsg = elementgetattribute(txtloginsuccess);
	
	assertEquals("Verify after Login", "Hello vkrish1019!", actloginsuccessmsg);
	
	WebElement txtlocation = findelementbyid("location");
	String location = readDataFromCell("sheet1", 1, 2);
	sendKeysAndEnter(txtlocation, location);

	WebElement txthotels = findelementbyid("hotels");
	String hotels = readDataFromCell("sheet1", 1, 3);
	sendKeysAndEnter(txthotels, hotels);
	
	WebElement txtroomtype = findelementbyid("room_type");
	String roomtype = readDataFromCell("sheet1", 1, 4);
	sendKeysAndEnter(txtroomtype, roomtype);
	
	WebElement txtroomno = findelementbyid("room_nos");
	String roomno = readDataFromCell("sheet1", 1, 5);
	sendKeysAndEnter(txtroomno, roomno);
	
	WebElement txtdatepickin = findelementbyid("datepick_in");
	String datepickin = readDataFromCell("sheet1", 1, 6);
	sendKeysAndEnter(txtdatepickin, datepickin);
	
	WebElement txtdatepickout = findelementbyid("datepick_out");
	String datepickout = readDataFromCell("sheet1", 1, 7);
	sendKeysAndEnter(txtdatepickout, datepickout);
	
	WebElement txtadultroom = findelementbyid("adult_room");
	String adultroom = readDataFromCell("sheet1", 1, 8);
	sendKeysAndEnter(txtadultroom, adultroom);
	
	WebElement txtchildroom = findelementbyid("child_room");
	String childroom = readDataFromCell("sheet1", 1, 9);
	sendKeysAndEnter(txtchildroom, childroom);
	
	WebElement btnsubmit = findelementbyid("Submit");
    elementclick(btnsubmit);
    
    WebElement byselecthotel = findelementbyxpath("//td[@class='login_title']");
    String actsearchmsg = elementgettext(byselecthotel);
     assertEquals("Verify after search","Select Hotel",actsearchmsg);
 
    WebElement btnradio = findelementbyid("radiobutton_0");
    elementclick(btnradio);
 
    WebElement btncontinue = findelementbyid("continue");
    elementclick(btncontinue);
	
    WebElement txtfirstname = findelementbyid("first_name");
	String firstname = readDataFromCell("sheet1", 1, 10);
	sendKeysAndEnter(txtfirstname, firstname);
	
	WebElement txtlastname = findelementbyid("last_name");
	String lastname = readDataFromCell("sheet1", 1, 11);
	sendKeysAndEnter(txtlastname, lastname);
	
	WebElement txtaddress = findelementbyid("address");
	String address = readDataFromCell("sheet1", 1, 12);
	sendKeysAndEnter(txtaddress, address);
	
	WebElement txtccnum = findelementbyid("cc_num");
	String ccnum = readDataFromCell("sheet1", 1, 13);
	sendKeysAndEnter(txtccnum, ccnum);
	
	WebElement txtcctype = findelementbyid("cc_type");
	String cctype = readDataFromCell("sheet1", 1, 14);
	sendKeysAndEnter(txtcctype, cctype);
	
	WebElement txtexpmonth = findelementbyid("cc_exp_month");
	String expmonth = readDataFromCell("sheet1", 1, 15);
	sendKeysAndEnter(txtexpmonth, expmonth);
	
	WebElement txtccexpyear = findelementbyid("cc_exp_year");
	String ccexpyear = readDataFromCell("sheet1", 1, 16);
	sendKeysAndEnter(txtccexpyear, ccexpyear);
	
	WebElement txtcvv = findelementbyid("cc_cvv");
	String cvv = readDataFromCell("sheet1", 1, 17);
	sendKeysAndEnter(txtcvv, cvv);
	
	
	WebElement bybookhotel = findelementbyxpath("//td[text()='Book A Hotel ']");
	String actbookingmsg = elementgettext(bybookhotel);
	 assertEquals("Verify book hotel","Book A Hotel",actbookingmsg);
	
	
	WebElement btnbooknow = findelementbyid("book_now");
	elementclick(btnbooknow);
	
	Thread.sleep(10000);
	
	WebElement bookcnf =findelementbyxpath("//td[@class='login_title']");
	String actbookcnf = elementgettext(bookcnf);
	 assertEquals("Verify book confirm","Booking Confirmation",actbookcnf);
	
	
	
	WebElement txtorderno = findelementbyid("order_no");
	String orderno = elementgetattribute(txtorderno);
	System.out.println(orderno);	
	writeCellData("sheet1", 1, 18, orderno);
    quitwindow();
	
	}
	
	
	
	
	@AfterClass
	public static void afterclass() {
		
		

	}
	
}