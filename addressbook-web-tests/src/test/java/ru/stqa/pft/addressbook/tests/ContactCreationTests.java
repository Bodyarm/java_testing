package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;
import ru.stqa.pft.addressbook.model.GroupData;

import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

public class ContactCreationTests extends TestBase{

  @Test
  public void testContactCreation() {
    app.goTo().groupPage();
    if (! app.group().isThereAGroup()){
      app.group().create(new GroupData("test1",null,null));
    }
    app.goTo().gotoHomePage();

    List<ContactData> before= app.getContactHelper().getContactList();

    ContactData newcontact = new ContactData(
            "LLLLtest",
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
    );

    app.getContactHelper().createContact(newcontact);

    app.goTo().gotoHomePage();

    List<ContactData> after= app.getContactHelper().getContactList();

    newcontact.setId(after.stream().max((o1, o2) -> Integer.compare(o1.getId(),o2.getId())).get().getId());
    before.add(newcontact);

    Comparator<? super ContactData> byId = (c1,c2) -> Integer.compare(c1.getId(), c2.getId());
    before.sort(byId);
    after.sort(byId);

    Assert.assertEquals(before.size(), after.size());
    Assert.assertEquals(new HashSet<Object>(before),new HashSet<Object>(after));
    Assert.assertEquals(before,after);
}

}
