package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import ru.stqa.pft.addressbook.model.ContactData;
import ru.stqa.pft.addressbook.model.GroupData;

public class ContactHelper extends BaseHelper {
  public ContactHelper(WebDriver wd) {
    super(wd);
  }

  public void initContactCreation() {
    click(By.linkText("add new") );
  }

  public void fillContactForm(ContactData contactData, boolean creation) {
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

    if (creation){
      new Select(wd.findElement(By.name("new_group"))).selectByVisibleText(contactData.getGroup());
    } else {
      Assert.assertFalse(isElementPresent(By.name("new_group")));
    }
  }

  public void submitContactCreation() {
    click(By.xpath("//div[@id='content']/form/input[21]"));
  }

  public void selectContact() {
    select(By.name("selected[]"));
  }

  public void initContactModification(){
    click(By.xpath("//div/div[4]/form[2]/table/tbody/tr[2]/td[8]/a/img"));
  }

  public void submitContactModification() {
    click(By.name("update"));
  }

  public void deleteContact(){
    click(By.xpath("//div[@id='content']/form[2]/div[2]/input"));
  }

  public void acceptDeleteContact() {
    accept();
  }

  public boolean isThereAContact() {
    return isElementPresent(By.name("selected[]"));
  }

  public void createContact(ContactData contact){
    initContactCreation();
    fillContactForm(contact,true);
    submitContactCreation();
    click(By.linkText("home"));
  }
}
