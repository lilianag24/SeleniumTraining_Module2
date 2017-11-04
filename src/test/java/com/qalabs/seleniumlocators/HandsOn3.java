package com.qalabs.seleniumlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class HandsOn3 {
    public static void main(String[] args) throws InterruptedException {
        String browser = "Chrome";

        WebDriver driver = WebDriverFactory.getDriver(browser);

        driver.get("https://www.inaturalist.org/");

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //Find menu places
        WebElement menuPlaces = driver.findElement(By.linkText("Places"));
        menuPlaces.click();

        //Find textbox
        WebElement textBox = driver.findElement(By.xpath("//form[@class='clear buttonrow']/input[@name='q']"));
        textBox.click();
        textBox.sendKeys("Colomos, Guadalajara");

        //Find search button
        WebElement searchButton = driver.findElement(By.xpath("//input[@class='last default button']"));
        searchButton.click();

        Thread.sleep(3000);

        //Find Arachnids
        WebElement arachnids = driver.findElement(By.linkText("Arachnids"));
        arachnids.click();

        Thread.sleep(3000);

        //print names
        System.out.println("------Arachnids------");
        List<WebElement> names = driver.findElements(By.xpath("//span[@class='comname ']"));
        for(WebElement na: names){
            System.out.println("Nombre: " +na.getText());
        }

        //Find Insects
        WebElement insects = driver.findElement(By.linkText("Insects"));
        insects.click();

        Thread.sleep(3000);

        //print names
        System.out.println("------Insects------");
        List<WebElement> nameIns= driver.findElements(By.xpath("//span[@class='comname ']"));
        for(WebElement na: nameIns){
            System.out.println("Nombre: " +na.getText());
        }

        //Find Ray-finned fished
        WebElement fishes = driver.findElement(By.linkText("Ray-finned fishes"));
        fishes.click();

        Thread.sleep(3000);

        //print names
        System.out.println("------Ray-finned fishes------");
        List<WebElement> nameFish= driver.findElements(By.xpath("//span[@class='comname ']"));
        for(WebElement na: nameFish){
            System.out.println("Nombre: " +na.getText());
        }

        //Find Amphibians
        WebElement amphibians = driver.findElement(By.linkText("Amphibians"));
        amphibians.click();

        Thread.sleep(3000);

        //print names
        System.out.println("------Amphibians------");
        List<WebElement> nameAmph= driver.findElements(By.xpath("//span[@class='comname ']"));
        if(nameAmph.isEmpty()){
            System.out.println("No matching species..");
        }else{
            for(WebElement na: nameAmph){
                System.out.println("Nombre: " + na.getText());
            }
        }

        //Find Birds
        WebElement birds = driver.findElement(By.linkText("Birds"));
        birds.click();

        Thread.sleep(3000);

        //print names
        System.out.println("------Birds------");
        List<WebElement> nameBirds= driver.findElements(By.xpath("//span[@class='comname ']"));
        for(WebElement na: nameBirds){
            System.out.println("Nombre: " + na.getText());
        }

        //Find Mammals
        WebElement mammals = driver.findElement(By.linkText("Mammals"));
        mammals.click();

        Thread.sleep(3000);

        //print names
        System.out.println("------Mammals------");
        List<WebElement> nameMam= driver.findElements(By.xpath("//span[@class='comname ']"));
        for(WebElement na: nameMam){
            System.out.println("Nombre: " + na.getText());
        }

        driver.quit();
    }
}
