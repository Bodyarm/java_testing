package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;
import ru.stqa.pft.addressbook.model.GroupData;

import java.util.Comparator;
import java.util.List;

public class ContactDeletionTests extends TestBase{

  @Test
  public void testContactDeletion() {
    app.getNavigationHelper().gotoGroupPage();
    if (! app.getGroupHelper().isThereAGroup()){
      app.getGroupHelper().createGroup(new GroupData("test1",null,null));
    }
    app.getNavigationHelper().gotoHomePage();
    if(! app.getContactHelper().isThereAContact()) {
      app.getContactHelper().createContact(new ContactData(
              "Test",
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
    }
    app.getNavigationHelper().gotoHomePage();

    List<ContactData> before = app.getContactHelper().getContactList();

    app.getContactHelper().selectContact(before.size()-1);
    app.getContactHelper().deleteContact();
    app.getContactHelper().acceptDeleteContact();
    app.getNavigationHelper().gotoHomePage();


    List<ContactData> after = app.getContactHelper().getContactList();

    before.remove(before.remove(before.size()-1));

    Comparator<? super ContactData> byId = (c1, c2) -> Integer.compare(c1.getId(), c2.getId());
    before.sort(byId);
    after.sort(byId);


    Assert.assertEquals(before.size(),after.size());
    Assert.assertEquals(before,after);

  }
}
