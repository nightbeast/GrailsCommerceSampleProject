import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.firefox.FirefoxProfile

driver = { 
    	//set the firefox locale to 'en-us' since the tests expect english
    	//see http://stackoverflow.com/questions/9822717 for more details
    	FirefoxProfile profile = new FirefoxProfile()
    	profile.setPreference("intl.accept_languages", "en-us")
	def driverInstance = new FirefoxDriver(profile) 
	driverInstance.manage().window().maximize() 
	driverInstance
}

baseNavigatorWaiting = true
atCheckWaiting = true
baseUrl = 'http://localhost:8090/ShoppingSolutionProject/'

if (!System.getProperty("grails.env")) {
	reportsDir = new File("target/geb-reports")
}