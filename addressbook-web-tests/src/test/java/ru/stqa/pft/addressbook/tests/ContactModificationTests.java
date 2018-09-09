package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;
import ru.stqa.pft.addressbook.model.GroupData;

import java.util.Comparator;
import java.util.List;

public class ContactModificationTests extends TestBase{

  @BeforeMethod
  public void ensurePreconditions(){
    app.goTo().groupPage();
    if (! app.group().isThereAGroup()){
      app.group().create(new GroupData().withName("test1"));
    }
    app.goTo().gotoHomePage();
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
  }

  @Test
  public void testContactModification() {
    List<ContactData> before = app.getContactHelper().getContactList();


    app.getContactHelper().initContactModification();
    ContactData modcontact =new  ContactData(
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
            null);
    app.getContactHelper().fillContactForm(modcontact ,false);
    app.getContactHelper().submitContactModification();
    app.goTo().gotoHomePage();

    before.add(modcontact);
    before.get(before.size()-1).setId(before.get(0).getId());
    before.remove(0);

    List<ContactData> after = app.getContactHelper().getContactList();

    Comparator<? super ContactData> byId = (c1, c2) -> Integer.compare(c1.getId(), c2.getId());
    before.sort(byId);
    after.sort(byId);

    Assert.assertEquals(before.size(),after.size());
    Assert.assertEquals(before,after);


  }
}
