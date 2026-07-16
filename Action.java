WebElement d = findElement(By.id("content_menu")); 
Actions action = new Actions(driver);
action.contextClick(element).perform();