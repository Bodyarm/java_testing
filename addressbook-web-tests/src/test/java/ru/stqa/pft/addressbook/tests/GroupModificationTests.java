package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;
import java.util.HashSet;
import java.util.Set;

public class GroupModificationTests extends TestBase {

  @BeforeMethod
  public void ensurePreconditions(){
    app.goTo().groupPage();
    if (app.group().all().size() ==0){
      app.group().create(new GroupData().withName("test1"));
    }
  }

  @Test
  public void testGroupModification() {

    Set<GroupData> before = app.group().all();
    GroupData modifiedGroup = before.iterator().next();
    System.out.println("Modified id is "+ modifiedGroup.getId());
    GroupData mgroup = new GroupData()
            .withId(modifiedGroup.getId())
            .withName("mod1")
            .withHeader("mod2")
            .withFooter("mod3");

    app.group().modify(modifiedGroup);

    Set<GroupData> after = app.group().all();

    before.remove(modifiedGroup);
    before.add(mgroup);

    Assert.assertEquals(new HashSet<>(before),new HashSet<>(after));
  }


}
