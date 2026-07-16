Alert alert = driver.switchTo().alert();
alert.accept();
alert.dismiss();

TakesScreenshot ss = (TakesScreenshot) driver;
File f = ss.getScreenshotAs(OutputType.FILE);