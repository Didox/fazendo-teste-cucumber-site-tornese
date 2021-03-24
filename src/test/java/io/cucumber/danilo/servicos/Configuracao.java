package io.cucumber.danilo.servicos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Configuracao {
  
  public static WebDriver browser;
  
  public static void abrir(String url){
    
    if(browser == null){
      System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
      browser = new ChromeDriver();
    }

    browser.get(url);
  }

  public static void fechar(){
    browser.close();
    browser = null;
  }
}
