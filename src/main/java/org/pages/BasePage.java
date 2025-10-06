package org.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {
    BasePage(){
        WebDriver drive = new ChromeDriver();
    }
}
