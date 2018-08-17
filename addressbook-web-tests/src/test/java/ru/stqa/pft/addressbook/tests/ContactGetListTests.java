package ru.stqa.pft.addressbook.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;
import ru.stqa.pft.addressbook.model.GroupData;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.List;

public class ContactGetListTests extends TestBase{

  @Test
  public void testGetlist() {
    app.getNavigationHelper().gotoGroupPage();
    if (! app.getGroupHelper().isThereAGroup()){
      app.getGroupHelper().createGroup(new GroupData("test1",null,null));
    }
    app.getNavigationHelper().gotoHomePage();

    // пытаемся вычленить список контактов
    List<ContactData> before = app.getContactHelper().getContactList();
    System.out.println("-------------------------------");
    System.out.println("Количество контактов: "+before.size());
    System.out.println("Первый контакт из теста:");
    System.out.println(before.get(0).getId() + " " + before.get(0).getFirstname());
    app.getNavigationHelper().gotoHomePage();
  }

}
