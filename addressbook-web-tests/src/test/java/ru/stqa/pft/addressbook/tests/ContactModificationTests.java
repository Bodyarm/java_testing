package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;
import ru.stqa.pft.addressbook.model.GroupData;

import java.util.List;

public class ContactModificationTests extends TestBase{

  @Test
  public void testContactModification() {
    app.getNavigationHelper().gotoGroupPage();
    if (! app.getGroupHelper().isThereAGroup()){
      app.getGroupHelper().createGroup(new GroupData("test1",null,null));
    }
    app.getNavigationHelper().gotoHomePage();

    List<ContactData> before = app.getContactHelper().getContactList();

    if(! app.getContactHelper().isThereAContact()) {
      app.getContactHelper().createContact(new ContactData(
                      "Test","Test Middlename",
                      "Test LastName","Test NickName",
                      "Test Title","Test Company",
                      "Test address","999","921",
                      "812","499","test@test.ru",
                      "test@mail.ru","test@yandex.ru",
                      "Test address2","test1"
              )
      );
    }
    app.getContactHelper().initContactModification();
    app.getContactHelper().fillContactForm(new ContactData(
            "Mod",
            "Mod Middlename",
            "Mod LastName",
            "Mod NickName",
            "Mod Title",
            "Mod Company",
            "Mod address",
            "9990",
            "9210",
            "8120",
            "4990",
            "Mod@Mod.ru",
            "Mod@mail.ru",
            "Mod@yandex.ru",
            "Mod address2",
            null),
            false
    );
    app.getContactHelper().submitContactModification();
    app.getNavigationHelper().gotoHomePage();

    List<ContactData> after = app.getContactHelper().getContactList();

    Assert.assertEquals(before.size(),after.size());



  }
}
