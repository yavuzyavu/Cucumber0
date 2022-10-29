package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class OrnekSoruPage {
    public OrnekSoruPage() {

        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy (xpath = "//*[@src=\"/static/images/home/logo.png\"]")
    public WebElement sayfa;

    @FindBy (xpath = "//body[1]/header[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[4]")
    public WebElement SignUpLoginButton;

    @FindBy (xpath = "//body/section[@id='form']/div[1]/div[1]/div[1]/div[1]/form[1]/input[2]")
    public WebElement emailKutusu;


    @FindBy (xpath = "//body/section[@id='form']/div[1]/div[1]/div[1]/div[1]/form[1]/input[3]")
    public WebElement passwordKutusu;

    @FindBy (xpath = "//button[contains(text(),'Login')]")
    public WebElement emailLogin;

    @FindBy (xpath = "//body[1]/header[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[10]/a[1]")
    public WebElement usernameismi;


    @FindBy (xpath = "//header/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[5]/a[1]")
    public WebElement deleteAccount;

    @FindBy (xpath = "//b[contains(text(),'Account Deleted!')]")
    public WebElement deleteAccountYazisi;


}
