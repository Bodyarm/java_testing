package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactHelper extends HelperBase {
  public ContactHelper(FirefoxDriver wd) {
    super(wd);
  }

  public void initContactCreation() {
    click(By.linkText("add new") );
  }

  public void fillContactForm(ContactData contactData) {
    type(By.name("firstname")  ,contactData.getFirstname());
    type(By.name("middlename") ,contactData.getMiddlename());
    type(By.name("lastname")   ,contactData.getLastname());
    type(By.name("nickname")   ,contactData.getNickname());
    type(By.name("title")      ,contactData.getTitle());
    type(By.name("company")    ,contactData.getCompany());
    type(By.name("address")    ,contactData.getAddress1());
    type(By.name("home")       ,contactData.getPhome());
    type(By.name("mobile")     ,contactData.getPmobile());
    type(By.name("work")       ,contactData.getPwork());
    type(By.name("fax")        ,contactData.getPfax());
    type(By.name("email")      ,contactData.getEmail1());
    type(By.name("email2")     ,contactData.getEmail2());
    type(By.name("email3")     ,contactData.getEmail3());
    type(By.name("address2")   ,contactData.getAddress2());
  }

  public void submitContactCreation() {
    click(By.xpath("//div[@id='content']/form/input[21]"));
  }



}
