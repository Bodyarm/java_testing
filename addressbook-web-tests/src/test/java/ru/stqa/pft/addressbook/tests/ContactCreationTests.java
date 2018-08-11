package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase{

  @Test
  public void testContactCreation() {
    app.getNavigationHelper().gotoHomePage();
    app.getContactHelper().initContactCreation();
    app.getContactHelper().fillContactForm(new ContactData("Test", "Test Middlename", "Test LastName", "Test NickName", "Test Title", "Test Company", "Test address", "999", "921", "812", "499", "test@test.ru", "test@mail.ru", "test@yandex.ru", "Test address2","test1"),true);
    app.getContactHelper().submitContactCreation();
    app.getNavigationHelper().gotoHomePage();
  }

}
