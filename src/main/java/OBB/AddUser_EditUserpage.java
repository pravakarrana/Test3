package OBB;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;
 
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;

 
public class AddUser_EditUserpage {
	//Locators
	@FindBy(xpath="//img[contains(@src,'QRcode')]")
	private WebElement QRCode;
	
	
	//Methods
	public void GenerateQR()   {
    	boolean QR=QRCode.isDisplayed();
    	Assert.assertEquals(true, QR);
    	Reporter.log(QR + " QR Generate Automatically Sucessfully",true);
	} 
	public void VarifyQR() throws IOException, NotFoundException   {
		String Qrcode=QRCode.getAttribute("src");
		System.out.println("QR image url is : "+Qrcode);
		URL QRurlOfImage =new URL(Qrcode);
		BufferedImage QRbufferedImage =ImageIO.read(QRurlOfImage);
		LuminanceSource source =new BufferedImageLuminanceSource(QRbufferedImage);
		BinaryBitmap bitmap =new BinaryBitmap(new HybridBinarizer(source));
		Result result=new MultiFormatReader().decode(bitmap);
		String textPresentInImage = result.getText();
		System.out.println("Text Present in QR: "+textPresentInImage);
		//Assert.assertEquals(textPresentInImage, "BEGIN:VCARD");(if single word present,then use this)
	 
	}
	
	
	
	
	

}
