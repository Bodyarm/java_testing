package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;
import ru.stqa.pft.addressbook.model.GroupData;

public class ContactCreationTests extends TestBase{

  @Test
  public void testContactCreation() {
    app.getNavigationHelper().gotoGroupPage();
    if (! app.getGroupHelper().isThereAGroup()){
      app.getGroupHelper().createGroup(new GroupData("test1",null,null));
    }
    app.getNavigationHelper().gotoHomePage();
    app.getContactHelper().createContact(new ContactData(
            "test",
            "Test Middlename",
            "Test LastName",
            "Test NickName",
            "Test Title",
            "Test Company",
            "Test address",
            "999",
            "921",
            "812",
            "499",
            "test@test.ru",
            "test@mail.ru",
            "test@yandex.ru",
            "Test address2",
            "test1"
             )
    );
    app.getNavigationHelper().gotoHomePage();
  }

}
