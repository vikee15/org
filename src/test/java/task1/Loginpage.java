package task1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage extends Baseclasstask {
	
	public Loginpage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id= "username")
	private WebElement txtusername;
	
	@FindBy(id= "password")
	private WebElement txtpassword;
	
	@FindBy(id= "login")
	private WebElement btnlogin;

	public WebElement getTxtusername() {
		return txtusername;
	}

	public WebElement getTxtpassword() {
		return txtpassword;
	}

	public WebElement getBtnlogin() {
		return btnlogin;
	}
	
	public void login(String username,String password) {
		elementkeys(getTxtusername(), username);
		elementkeys(getTxtpassword(), password);
		elementclick(getBtnlogin());
	}

}
