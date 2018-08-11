package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactModificationTests extends TestBase{

  @Test
  public void testContactModification() {
    app.getNavigationHelper().gotoHomePage();
    app.getContactHelper().initContactModification();
    app.getContactHelper().fillContactForm(new ContactData("Mod", "Mod Middlename", "Mod LastName", "Mod NickName", "Mod Title", "Mod Company", "Mod address", "9990", "9210", "8120", "4990", "Mod@Mod.ru", "Mod@mail.ru", "Mod@yandex.ru", "Mod address2",null),false);
    app.getContactHelper().submitContactModification();
    app.getNavigationHelper().gotoHomePage();
  }
}
