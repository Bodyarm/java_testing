package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;
import ru.stqa.pft.addressbook.model.GroupData;

import java.util.List;

public class ContactGetListTests extends TestBase{

  @Test
  public void testGetlist() {
    app.goTo().groupPage();
    if (! app.group().isThereAGroup()){
      app.group().create(new GroupData().withName("test1"));
    }
    app.goTo().gotoHomePage();

    // пытаемся вычленить список контактов
    List<ContactData> before = app.getContactHelper().getContactList();
    System.out.println("-------------------------------");
    System.out.println("Количество контактов: "+before.size());



    for( ContactData element: before){
      System.out.println(element.getId() + " "+ element.getFirstname());
    }

    app.goTo().gotoHomePage();

  }

}
