package ru.stqa.pft.addressbook.tests;

import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase{

  @Test
  public void testContactCreation() {
    initContactCreation();
    fillContactForm(new ContactData("Test", "Test Middlename", "Test LastName", "Test NickName", "Test Title", "Test Company", "Test address", "999", "921", "812", "499", "test@test.ru", "test@mail.ru", "test@yandex.ru", "Test address2"));
    submitContactCreation();
    gotoHomePage();
  }

}
