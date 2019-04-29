package web.testrty.devrabbittest.webpageclasses;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import com.utilities.BaseClass;import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

@SuppressWarnings("unused")
public class HomeScreen extends BaseClass {
	
	public static String primaryInfo  = "{\"user_id\":7,\"is_generate\":false,\"is_execute\":false,\"is_web\":true,\"project_url\":\"https://www.devrabbit.com/\",\"report_upload_url\":\"http://192.168.1.142:80/UploadReportFile\",\"project_name\":\"Testrty\",\"project_description\":\"ds\",\"project_id\":261,\"module_name\":\"DevrabbitTest\",\"module_description\":\"dsc\",\"sub_module_id\":0,\"module_id\":405,\"testcase_name\":\"TC_UTR\",\"testcase_id\":449,\"testset_id\":0,\"executed_timestamp\":1752151285,\"browser_type\":\"chrome\"}";

	public static String projectName = "testrty";
	public WebDriver driver;
	public ExtentReports reports;
	public ExtentTest test;
	public static final int datasetsLength = 1;

	public HomeScreen(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//LI[@id='menu-item-1476']/A[1]")	
	private WebElement	Contact_303690A;
	public String clkAContact_303690() {
		waitForExpectedElement(driver, Contact_303690A);		
		String text = Contact_303690A.getText();
		Contact_303690A.click();
		return text;
	}

}