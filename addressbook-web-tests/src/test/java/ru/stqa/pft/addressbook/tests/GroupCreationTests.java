package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

import java.util.HashSet;
import java.util.List;

public class GroupCreationTests extends TestBase{

  @Test(enabled = false)
  public void testGroupCreation() {
    app.getNavigationHelper().gotoGroupPage();
    List<GroupData> before = app.getGroupHelper().getGroupList();
    GroupData cgroup = new GroupData("test1", null, null);
    app.getGroupHelper().createGroup(cgroup);
    List<GroupData> after = app.getGroupHelper().getGroupList();
    Assert.assertEquals(before.size(),after.size() - 1);



    int max = 0;
    for (GroupData g: after){
      if (g.getId()>max) { max = g.getId();}
    }
    cgroup.setId(max);
    before.add(cgroup);
    Assert.assertEquals(new HashSet<>(before),new HashSet<>(after));
  }

  @Test
  public void testGroupCreationLam() {
    app.getNavigationHelper().gotoGroupPage();
    List<GroupData> before = app.getGroupHelper().getGroupList();
    GroupData cgroup = new GroupData("test45", null, null);
    app.getGroupHelper().createGroup(cgroup);
    List<GroupData> after = app.getGroupHelper().getGroupList();
    Assert.assertEquals(before.size(),after.size() - 1);


    cgroup.setId(after.stream().max((o1, o2) -> Integer.compare(o1.getId(),o2.getId())).get().getId());
    before.add(cgroup);
    Assert.assertEquals(new HashSet<>(before),new HashSet<>(after));
  }


}
