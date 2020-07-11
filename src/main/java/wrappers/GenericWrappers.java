package wrappers;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.ElementNotSelectableException;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.SessionNotCreatedException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.ScreenshotException;
import org.openqa.selenium.remote.UnreachableBrowserException;
import org.openqa.selenium.support.ui.Select;

public class GenericWrappers implements Wrappers{

	RemoteWebDriver driver;
int count=1;
	public void invokeApp(String browser, String url) {
		// TODO Auto-generated method stub

		try {
			if(browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
				driver = new ChromeDriver();
			}else if(browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", "./Drivers/geckdriver.exe");
				driver = new FirefoxDriver();
			}else if(browser.equalsIgnoreCase("ie")) {
				System.setProperty("webdriver.ie.driver", "./Drivers/IEDriverServer.exe");
				driver = new InternetExplorerDriver();
			}
			driver.manage().window().maximize();
			driver.get(url);
			System.out.println("The broswet "+browser+" got launched with url: "+url+" successfully");
		} catch (SessionNotCreatedException e) {
			// TODO Auto-generated catch block
			System.err.println("The browser "+browser+" is not launched due to session not created error");
		} catch (WebDriverException e) {
			// TODO: handle exception
			System.err.println("The browser "+browser+" is not launched due to unknown error");
		}finally {
			takeSnap();
		}

	}
	public void enterTabByXpath(String xpath)
	{
		try {
			driver.findElementByXPath(xpath).sendKeys(Keys.TAB);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void enterById(String idValue, String data) {
		// TODO Auto-generated method stub
		try {
			driver.findElementById(idValue).sendKeys(data);
			System.out.println("The element with id "+idValue+" is entered with data "+data);
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.err.println("The element with id "+idValue+" is not present in DOM");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			System.err.println("The element with id "+idValue+" is not visible in application");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			System.err.println("The element with id "+idValue+" is not interactable in application");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			System.err.println("The element wiht id "+idValue+" is not stable in application");
		} catch (WebDriverException e) {
			// TODO: handle exception
			System.err.println("The element with id "+idValue+" is not entered with data "+data+" due to unknown error");
		} finally {
			takeSnap();
		}
	}
	
	public void selectByxpath(String xpath, int value) {
		// TODO Auto-generated method stub
		try {
			WebElement dropdown = driver.findElementByXPath(xpath);
			Select obj = new Select(dropdown);
			obj.selectByIndex(value);
			System.out.println("The Element with "+xpath+" is selected with the value "+value);
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.err.println("The Element with id "+xpath+" is not present in DOM");
		}
	}
	public void selectVisibiletextByXpathValue(String xpath, String val)
	{
	
			try {
				WebElement drop=driver.findElementByName(xpath);
				Select select=new Select(drop);
				select.selectByVisibleText(val);
				System.out.println("The element with name "+xpath+" is selected with visible text is "+val);
			} catch (NoSuchElementException e) {
				// TODO Auto-generated catch block
				System.err.println("The element with name "+xpath+" is not present in DOM");
			} catch (ElementNotVisibleException e) {
				// TODO: handle exception
				System.err.println("The element with name "+xpath+" is not visible in application");
			} catch (ElementNotInteractableException e) {
				// TODO: handle exception
				System.err.println("The element with name "+xpath+" is not interactable in application");
			} catch (StaleElementReferenceException e) {
				// TODO: handle exception
				System.err.println("The element wiht name "+xpath+" is not stable in application");
			}catch(ElementNotSelectableException e)
			{
				System.err.println("the element with name "+xpath+"is not selectable in the application");
			} catch (WebDriverException e) {
				// TODO: handle exception
				System.err.println("The element with name"+xpath+" is not selected due to unknown error");
			} finally {
				takeSnap();
			}

		}
	public void selectByxpathVal(String xpath, String value) {
		// TODO Auto-generated method stub
		try {
			WebElement dropdown = driver.findElementByXPath(xpath);
			Select obj = new Select(dropdown);
			obj.selectByValue(value);
			System.out.println("The Element with "+xpath+" is selected with the value "+value);
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.err.println("The Element with id "+xpath+" is not present in DOM");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			System.err.println("The Element with id "+xpath+" is not present in application");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			System.err.println("The Element with id "+xpath+" is not interactable in application");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			System.err.println("The Element with id "+xpath+" is not stable in application");
		}catch (WebDriverException e) {
			// TODO: handle exception			
			System.err.println("The Element with id "+xpath+" is not entered with data "+value+" due to unknown error");
		} finally { takeSnap();
		}
	}
	public void selectByXpathValue(String xpath, String secQ)
	{
	
			try {
				WebElement drop=driver.findElementByName(xpath);
				Select select=new Select(drop);
				select.selectByValue(secQ);
				System.out.println("The element with name "+xpath+" is selected with visible text is "+secQ);
			} catch (NoSuchElementException e) {
				// TODO Auto-generated catch block
				System.err.println("The element with name "+xpath+" is not present in DOM");
			} catch (ElementNotVisibleException e) {
				// TODO: handle exception
				System.err.println("The element with name "+xpath+" is not visible in application");
			} catch (ElementNotInteractableException e) {
				// TODO: handle exception
				System.err.println("The element with name "+xpath+" is not interactable in application");
			} catch (StaleElementReferenceException e) {
				// TODO: handle exception
				System.err.println("The element wiht name "+xpath+" is not stable in application");
			}catch(ElementNotSelectableException e)
			{
				System.err.println("the element with name "+xpath+"is not selectable in the application");
			} catch (WebDriverException e) {
				// TODO: handle exception
				System.err.println("The element with name"+xpath+" is not selected due to unknown error");
			} finally {
				takeSnap();
			}

		}
	
	public void enterByName(String nameValue, String data) {
		// TODO Auto-generated method stub

		try {
			driver.findElementByName(nameValue).sendKeys(data);
			System.out.println("The element with Name "+nameValue+" is entered with data "+data);
		}  catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.err.println("The element with Name "+nameValue+" is not present in DOM");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			System.err.println("The element with Name "+nameValue+" is not visible in application");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			System.err.println("The element with Name "+nameValue+" is not interactable in application");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			System.err.println("The element wiht Name "+nameValue+" is not stable in application");
		} catch (WebDriverException e) {
			// TODO: handle exception
			System.err.println("The element with Name "+nameValue+" is not entered with data "+data+" due to unknown error");
		} finally {
			takeSnap();
		}

	}

	public void enterByXpath(String xpathValue, String data) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByXPath(xpathValue).sendKeys(data);
			System.out.println("The element with xpath "+xpathValue+" is entered with data "+data);
		}  catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.err.println("The element with xpath "+xpathValue+" is not present in DOM");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			System.err.println("The element with xpath "+xpathValue+" is not visible in application");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			System.err.println("The element with xpath "+xpathValue+" is not interactable in application");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			System.err.println("The element wiht xpath "+xpathValue+" is not stable in application");
		} catch (WebDriverException e) {
			// TODO: handle exception
			System.err.println("The element with xpath "+xpathValue+" is not entered with data "+data+" due to unknown error");
		} finally {
			takeSnap();
		}
	}

	public void verifyTitle(String title) {
		// TODO Auto-generated method stub
		try {
			String actualtitle=driver.getTitle();
			if(actualtitle.equals(title))
			{
				System.out.println("The given title is "+title+" is equal to actual title "+actualtitle);
			}
			else{
				System.out.println("The given title is "+title+"is not equal to actual title"+actualtitle);
			}

		} catch (WebDriverException e) {
			// TODO: handle exception
			System.err.println("The given title is "+title+"is not able to verify due to unknown error");
		} finally {

			takeSnap();
		}

	}
	public void verifyTextById(String id, String text){


		try {
			String actualtext=driver.findElementById(id).getText();
			if(actualtext.equals(text))
			{
				System.out.println("The actual text"+actualtext+" with id "+id+" is equal to given text "+text);
			}
			else
			{
				System.out.println("The actual text"+actualtext+" with id "+id+" is not equal to given text "+text);
			}
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.err.println("The element with id "+id+" is not present in DOM");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			System.err.println("The element with id "+id+" is not visible in application");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			System.err.println("The element with id "+id+" is not interactable in application");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			System.err.println("The element wiht id "+id+" is not stable in application");
		} catch (WebDriverException e) {
			// TODO: handle exception
			System.err.println("The element with id "+id+" is not entered due to unknown error");
		} finally {
			takeSnap();
		}

	}



	public void verifyTextByXpath(String xpath, String text){

		try {
			String actualtext=driver.findElementByXPath(xpath).getText();

			if(actualtext.equals(text))
			{
				System.out.println("The actual text"+actualtext+" with id "+xpath+" is equal to given text "+text);
			}
			else
			{
				System.out.println("The actual text"+actualtext+" with id "+xpath+" is not equal to given text "+text);
			}
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.err.println("The element with id "+xpath+" is not present in DOM");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			System.err.println("The element with id "+xpath+" is not visible in application");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			System.err.println("The element with id "+xpath+" is not interactable in application");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			System.err.println("The element wiht id "+xpath+" is not stable in application");
		} catch (WebDriverException e) {
			// TODO: handle exception
			System.err.println("The element with id "+xpath+" is not entered due to unknown error");
		} finally {
			takeSnap();
		}

	}
	public void verifyTextContainsByXpath(String xpath, String text){

		try {
			String actualtext=driver.findElementByXPath(xpath).getText();

			if(actualtext.contains(text))
			{
				System.out.println("The actual text"+actualtext+" with id "+xpath+" is equal to given patial text "+text);
			}
			else
			{
				System.out.println("The actual text"+actualtext+" with id "+xpath+" is not equal to given partial text "+text);
			}
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.err.println("The element with id "+xpath+" is not present in DOM");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			System.err.println("The element with id "+xpath+" is not visible in application");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			System.err.println("The element with id "+xpath+" is not interactable in application");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			System.err.println("The element wiht id "+xpath+" is not stable in application");
		} catch (WebDriverException e) {
			// TODO: handle exception
			System.err.println("The element with id "+xpath+" is not entered due to unknown error");
		} finally {
			takeSnap();
		}
	}



	public void clickById(String id) {

		try {
			driver.findElementById(id).click();
			System.out.println("The element with id "+id+"is clicked");
		}  catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.err.println("The element with id "+id+" is not present in DOM");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			System.err.println("The element with id "+id+" is not visible in application");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			System.err.println("The element with id "+id+" is not interactable in application");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			System.err.println("The element wiht id "+id+" is not stable in application");
		} catch (WebDriverException e) {
			// TODO: handle exception
			System.err.println("The element with id "+id+" is not clicked due to unknown error");
		} finally {
			takeSnap();
		}
	}

	public void clickByName(String name) {
		// TODO Auto-generated method stub

		try {
			driver.findElementByName(name).click();
			System.out.println("The element with name "+name+"is clicked");
		}  catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.err.println("The element with name "+name+" is not present in DOM");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			System.err.println("The element with name "+name+" is not visible in application");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			System.err.println("The element with name "+name+" is not interactable in application");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			System.err.println("The element wiht name "+name+" is not stable in application");
		} catch (WebDriverException e) {
			// TODO: handle exception
			System.err.println("The element with name "+name+" is not clicked due to unknown error");
		} finally {
			takeSnap();
		}
	}

	public void clickByLink(String name) {
		// TODO Auto-generated method stub

		try {
			driver.findElementByLinkText(name).click();


			System.out.println("The element with link "+name+"is clicked");
		}  catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.err.println("The element with link "+name+" is not present in DOM");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			System.err.println("The element with link "+name+" is not visible in application");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			System.err.println("The element with link "+name+" is not interactable in application");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			System.err.println("The element wiht link "+name+" is not stable in application");
		} catch (WebDriverException e) {
			// TODO: handle exception
			System.err.println("The element with link "+name+" is not clicked due to unknown error");
		} finally {
			takeSnap();
		}
	}



	public void clickByLinkNoSnap(String name) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByLinkText(name).click();


			System.out.println("The element with Link "+name+"is clicked");
		}  catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.err.println("The element with Link "+name+" is not present in DOM");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			System.err.println("The element with Link "+name+" is not visible in application");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			System.err.println("The element with Link "+name+" is not interactable in application");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			System.err.println("The element wiht Link "+name+" is not stable in application");
		} catch (WebDriverException e) {
			// TODO: handle exception
			System.err.println("The element with Link "+name+" is not clicked due to unknown error");
		} 


	}
	public void clickByXpath1(String xpathVal) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByXPath(xpathVal).sendKeys(Keys.ENTER);;


			System.out.println("The element with xpath "+xpathVal+"is clicked");
		}  catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.err.println("The element with xpath "+xpathVal+" is not present in DOM");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			System.err.println("The element with xpath "+xpathVal+" is not visible in application");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			System.err.println("The element with xpath "+xpathVal+" is not interactable in application");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			System.err.println("The element wiht xpath "+xpathVal+" is not stable in application");
		} catch (WebDriverException e) {
			// TODO: handle exception
			System.err.println("The element with xpath "+xpathVal+" is not clicked due to unknown error");
		} finally {
			takeSnap();
		}

	}

	public void clickByXpath(String xpathVal) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByXPath(xpathVal).click();


			System.out.println("The element with xpath "+xpathVal+"is clicked");
		}  catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.err.println("The element with xpath "+xpathVal+" is not present in DOM");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			System.err.println("The element with xpath "+xpathVal+" is not visible in application");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			System.err.println("The element with xpath "+xpathVal+" is not interactable in application");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			System.err.println("The element wiht xpath "+xpathVal+" is not stable in application");
		} catch (WebDriverException e) {
			// TODO: handle exception
			System.err.println("The element with xpath "+xpathVal+" is not clicked due to unknown error");
		} finally {
			takeSnap();
		}

	}

	public void clickByXpathNoSnap(String xpathVal) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByXPath(xpathVal).click();


			System.out.println("The element with xpath "+xpathVal+"is clicked");
		}  catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.err.println("The element with xpath "+xpathVal+" is not present in DOM");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			System.err.println("The element with xpath "+xpathVal+" is not visible in application");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			System.err.println("The element with xpath "+xpathVal+" is not interactable in application");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			System.err.println("The element wiht xpath "+xpathVal+" is not stable in application");
		} catch (WebDriverException e) {
			// TODO: handle exception
			System.err.println("The element with xpath "+xpathVal+" is not clicked due to unknown error");
		}
	}

	public String getTextById(String idVal) {

		// TODO Auto-generated method stub
		String str=null;
		try {
			str=driver.findElementById(idVal).getText();
			System.out.println("The element with"+idVal+"is printed");


		}  catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.err.println("The element with id "+idVal+" is not present in DOM");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			System.err.println("The element with id "+idVal+" is not visible in application");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			System.err.println("The element with id "+idVal+" is not interactable in application");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			System.err.println("The element wiht id "+idVal+" is not stable in application");
		} catch (WebDriverException e) {
			// TODO: handle exception
			System.err.println("The element with id "+idVal+" is not clicked due to unknown error");
		} finally {
			takeSnap();
		}
		return str;
	}

	public String getTextByXpath(String xpathVal) {
		// TODO Auto-generated method stub
		String str=null;
		try {
			str=driver.findElementByXPath(xpathVal).getText();
			System.out.println("The element with"+xpathVal+"is printed");
			System.out.println(str);

		}  catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.err.println("The element with xpath "+xpathVal+" is not present in DOM");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			System.err.println("The element with xpath "+xpathVal+" is not visible in application");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			System.err.println("The element with xpath "+xpathVal+" is not interactable in application");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			System.err.println("The element wiht xpath "+xpathVal+" is not stable in application");
		} catch (WebDriverException e) {
			// TODO: handle exception
			System.err.println("The element with xpath"+xpathVal+" is not clicked due to unknown error");
		} finally {
			takeSnap();
		}
		return str;

	}


	public void selectVisibileTextById(String id, String value) {
		// TODO Auto-generated method stub

		try {
			WebElement drop=driver.findElementById(id);
			Select select=new Select(drop);
			select.selectByVisibleText(value);
			System.out.println("The element with id "+id+" is selected with visible text is "+value);
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.err.println("The element with id "+id+" is not present in DOM");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			System.err.println("The element with id "+id+" is not visible in application");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			System.err.println("The element with id "+id+" is not interactable in application");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			System.err.println("The element wiht id "+id+" is not stable in application");
		}catch(ElementNotSelectableException e)
		{
			System.err.println("the element with id "+id+"is not selectable in the application");
		} catch (WebDriverException e) {
			// TODO: handle exception
			System.err.println("The element with xpath"+id+" is not selected due to unknown error");
		} finally {
			takeSnap();
		}

	}
	public void selectVisibileTextByName(String name, String value) {
		// TODO Auto-generated method stub

		try {
			WebElement drop=driver.findElementByName(name);
			Select select=new Select(drop);
			select.selectByVisibleText(value);
			System.out.println("The element with name "+name+" is selected with visible text is "+value);
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.err.println("The element with name "+name+" is not present in DOM");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			System.err.println("The element with name "+name+" is not visible in application");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			System.err.println("The element with name "+name+" is not interactable in application");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			System.err.println("The element wiht name "+name+" is not stable in application");
		}catch(ElementNotSelectableException e)
		{
			System.err.println("the element with name "+name+"is not selectable in the application");
		} catch (WebDriverException e) {
			// TODO: handle exception
			System.err.println("The element with name"+name+" is not selected due to unknown error");
		} finally {
			takeSnap();
		}

	}

	public void selectIndexById(String id, int value) {
		// TODO Auto-generated method stub
		try {
			WebElement drop1 = driver.findElementById(id);
			Select select = new Select(drop1);
			select.selectByIndex(value);
			System.out.println("The element with id "+id+" is selected and index value  is "+value);
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.err.println("The dropdown value "+id+" is not present in DOM");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			System.err.println("The dropdown value "+id+" is not present in application");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			System.err.println("The dropdown value "+id+" is not interactable in application");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			System.err.println("The dropdown value "+id+" is not stable in application");
		}catch (ElementNotSelectableException e) {
			// TODO: handle exception		
			System.err.println("The dropdown value "+id+" is not selected in application");
		}
		catch (WebDriverException e) {
			// TODO: handle exception
			System.err.println("The dropdown value "+id+" is not entered due to unknown error");
		}

		finally {
			takeSnap();
		}

	}

	public void selectIndexByName(String name, int val) {
		// TODO Auto-generated method stub
		try {
			WebElement drop1 = driver.findElementByName(name);
			Select select = new Select(drop1);
			select.selectByIndex(val);
			System.out.println("The element with name "+name+" is selected and index value  is "+val);
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.err.println("The dropdown value "+name+" is not present in DOM");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			System.err.println("The dropdown value "+name+" is not present in application");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			System.err.println("The dropdown value "+name+" is not interactable in application");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			System.err.println("The dropdown value "+name+" is not stable in application");
		}catch (ElementNotSelectableException e) {
			// TODO: handle exception		
			System.err.println("The dropdown value "+name+" is not selected in application");
		}
		catch (WebDriverException e) {
			// TODO: handle exception
			System.err.println("The dropdown value "+name+" is not entered due to unknown error");
		}

		finally {
			takeSnap();
		}

	}

	public void switchToParentWindow() {
		// TODO Auto-generated method stub

		try {
			Set<String> list=driver.getWindowHandles();
			for(String each:list){
				driver.switchTo().window(each);
				break;
			}
			System.out.println("switched to parent window");
		}
		catch(NoSuchWindowException e)
		{
			System.err.println("there is no such window found");
		}catch (WebDriverException e) {

			System.err.println("The  window is  not switched to parent window due to unknown error");
		}finally {
			takeSnap();
		}
	}

	public void switchToLastWindow() {
		// TODO Auto-generated method stub
		try {
			
			Set<String> list=driver.getWindowHandles();

			for(String each:list){
				driver.switchTo().window(each);
				

			}
			System.out.println("Switched to Last window");
		}
		catch(NoSuchWindowException e)
		{
			System.err.println("there is no such window found");
		}catch (WebDriverException e) {

			System.err.println("The  window is  not switched to last window due to unknown error");
		}finally {
			takeSnap();
		}
	}

	public void acceptAlert() {
		// TODO Auto-generated method stub
		try {
			driver.switchTo().alert().accept();
			System.out.println("Alert accpeted");
		} catch (UnhandledAlertException e) {
			// TODO Auto-generated catch block
			System.err.println("Alert is not handled");
		}

		catch (NoAlertPresentException e) {

			System.err.println("The  alert  is not presented");
		}
		catch (WebDriverException e) {

			System.err.println("The  alert  is not handled   due to unknown error");
		}finally {
			takeSnap();
		}

	}

	public void dismissAlert() {
		// TODO Auto-generated method stub
		try {
			driver.switchTo().alert().dismiss();
			System.out.println("Alert gets dismissed");
		} catch (UnhandledAlertException e) {
			// TODO Auto-generated catch block
			System.err.println("Alert is not handled");
		}

		catch (NoAlertPresentException e) {

			System.err.println("The  alert  is not presented");
		}
		catch (WebDriverException e) {

			System.err.println("The  alert  is not handled   due to unknown error");
		}


	}

	public String getAlertText() {
		// TODO Auto-generated method stub
		String alertText=null;
		try {
			alertText = driver.switchTo().alert().getText();
			System.out.println("Alert test is"+alertText);
			driver.switchTo().alert().accept();
		} catch (UnhandledAlertException e) {
			// TODO Auto-generated catch block
			System.err.println("Alert is not handled");
		}

		catch (NoAlertPresentException e) {

			System.err.println("The  alert  is not presented");
		}
		catch (WebDriverException e) {

			System.err.println("The  alert  is not handled   due to unknown error");
		}finally {
			takeSnap();
		}

		return alertText;
	}

	public void takeSnap() {
		// TODO Auto-generated method stub


		File file=driver.getScreenshotAs(OutputType.FILE);
		File dest=new File("./Screenshot/snap"+count+".png");
		try {
			FileUtils.copyFile(file,dest);
			//System.out.println("Screenshot taken");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.err.println("Not able to take screenshot dueto some io exception");
		}catch(ScreenshotException e)
		{
			System.err.println("Not able to take screenshot");
		}
		count++;
	} 


	public void closeBrowser() {
		// TODO Auto-generated method stub
		try {
			driver.close();
			System.out.println(" browser is closed");
		} 
		catch(WebDriverException e)
		{	System.err.println("browser is not closed due to unknow error");
		}
	}

	public void closeAllBrowsers() {
		// TODO Auto-generated method stub
		try {
			driver.quit();
			System.out.println("all browsers are closed");
		} catch (UnreachableBrowserException e) {
			// TODO Auto-generated catch block
		System.err.println("all browsers are not reachable");
		}
		catch(WebDriverException e)
		{
			System.err.println("all browsers are not closed due to unknow error");
		}
	}

	public void clickByClassName(String classVal) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByClassName(classVal).click();
			System.out.println("The element with class name "+classVal+"is clicked");
		}  catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.err.println("The element with class name "+classVal+" is not present in DOM");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			System.err.println("The element with class name "+classVal+" is not visible in application");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			System.err.println("The element with class name "+classVal+" is not interactable in application");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			System.err.println("The element wiht class name "+classVal+" is not stable in application");
		} catch (WebDriverException e) {
			// TODO: handle exception
			System.err.println("The element with class name "+classVal+" is not clicked due to unknown error");
		} finally {
			takeSnap();
		}

	}

	public void waitProperty(long time) {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void clearByXPath(String xpathval)
	{
		try {
			driver.findElementByXPath(xpathval).clear();
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.err.println("The element with xpath value "+xpathval+" is not present in DOM");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			System.err.println("The element with xpath value "+xpathval+" is not visible in application");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			System.err.println("The element with xpath  value "+xpathval+" is not interactable in application");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			System.err.println("The element wiht xpath value"+xpathval+" is not stable in application");
		} catch (WebDriverException e) {
			// TODO: handle exception
			System.err.println("The element with xpath value "+xpathval+" is not clicked due to unknown error");
		} finally {
			takeSnap();
		}
	}
	
	
}
