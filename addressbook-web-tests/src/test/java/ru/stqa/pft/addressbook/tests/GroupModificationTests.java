package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

public class GroupModificationTests extends TestBase {

  @BeforeMethod
  public void ensurePreconditions(){
    app.goTo().groupPage();
    if (app.group().list().size() ==0){
      app.group().create(new GroupData("test1",null,null));
    }
  }

  @Test
  public void testGroupModification() {

    List<GroupData> before = app.group().list();
    int index = before.size() -1;
    GroupData mgroup = new GroupData(before.get(index).getId(),"mod1","mod2","mod3");

    app.group().modify(index, mgroup);

    List<GroupData> after = app.group().list();

    before.remove(index);
    before.add(mgroup);

    Comparator<? super GroupData> byId = (c1, c2) -> Integer.compare(c1.getId(), c2.getId());
    before.sort(byId);
    after.sort(byId);

    Assert.assertEquals(new HashSet<>(before),new HashSet<>(after));
  }


}
