package com.translantik.pages;

import com.translantik.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class FleetVehiclesPage extends BasePage{

   @FindBy(xpath = "//a[text()='Manage filters']")
   public WebElement manageFilters;

   @FindBy(xpath = "//a[@title='Filters']")
   public WebElement filterButton;

   @FindBy(xpath = "//li/label/input")
   public List<WebElement> checkBoxes;

   @FindBy(xpath = "//a[@class='action btn reset-action mode-text-only']")
   public WebElement resetButton;

   @FindBy(xpath = "(//div[@class='btn filter-criteria-selector oro-drop-opener oro-dropdown-toggle filter-default-value'])[1]")
   public WebElement firstElement;

   @FindBy(xpath = "//input[@type='search']")
   public WebElement filterSearchBox;

   @FindBy(xpath = "//div[@class='value-field-frame']/input[@name='value']")
   public WebElement containsSearchBox;

   @FindBy(xpath = "//tbody[@class='grid-body']/tr[1]/td[3]")
   public WebElement driverColumnName;

   @FindBy(xpath = "//td[@data-column-label='Driver']")
   public  WebElement actualDriverName;

   public WebElement getdataColumns(String dataColumns){
      String xpath = "//input[@title='"+ dataColumns +"']";
      return Driver.get().findElement(By.xpath(xpath));
   }

   public WebElement getColumnsFilterAll(String dataColumns){
      String xpath = "//div[contains(text(),'"+ dataColumns +"')]";
      return Driver.get().findElement(By.xpath(xpath));
   }
}
