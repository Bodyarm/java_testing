package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

import java.util.Comparator;
import java.util.List;

public class GroupCreationTests extends TestBase{

  @Test
  public void testGroupCreationLam() {
    app.goTo().groupPage();
    List<GroupData> before = app.group().list();
    GroupData cgroup = new GroupData("test45", null, null);
    app.group().create(cgroup);
    List<GroupData> after = app.group().list();

    cgroup.setId(after.stream().max((o1, o2) -> Integer.compare(o1.getId(),o2.getId())).get().getId());
    before.add(cgroup);

    Comparator<? super GroupData> byId = (c1, c2) -> Integer.compare(c1.getId(), c2.getId());
    before.sort(byId);
    after.sort(byId);

    Assert.assertEquals(before,after);
  }


}
