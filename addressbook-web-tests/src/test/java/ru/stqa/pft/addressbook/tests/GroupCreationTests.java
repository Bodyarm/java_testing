package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;
import java.util.Set;

public class GroupCreationTests extends TestBase{

  @Test
  public void testGroupCreationLam() {
    app.goTo().groupPage();
    Set<GroupData> before = app.group().all();
    GroupData cgroup = new GroupData().withName("test45");
    app.group().create(cgroup);

    Set<GroupData> after = app.group().all();

    cgroup.withId(after.stream().mapToInt((g) -> g.getId()).max().getAsInt());
    before.add(cgroup);

    Assert.assertEquals(before,after);
  }

}
