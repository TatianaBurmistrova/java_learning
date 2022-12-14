package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

import java.util.Comparator;
import java.util.List;

public class GroupCreationTests extends TestBase {

  @Test
  public void testGroupCreation() {
    app.goTo().groupPage();
    List<GroupData> before = app.group().list();
    //int before = app.getGroupHelper().getGroupCount();
    GroupData group = new GroupData().withName("test2");
    app.group().create(group);
    //int after = app.getGroupHelper().getGroupCount();
    List<GroupData> after = app.group().list();
    //Assert.assertEquals(after, before + 1);
    Assert.assertEquals(after.size(), before.size() + 1);


    /*int max = 0;
    for (GroupData g: after){
      if (g.getId() > max){
        max = g.getId();
      }
    }*/

    //Comparator<? super GroupData> byId= (Comparator<GroupData>) (o1, o2) -> Integer.compare(o1.getId(),o2.getId());
    //int max1 = after.stream().max((o1, o2) -> Integer.compare(o1.getId(),o2.getId())).get().getId();

    //group.setId(after.stream().max((o1, o2) -> Integer.compare(o1.getId(),o2.getId())).get().getId());
    before.add(group);

    Comparator<? super GroupData> byId = (g1, g2)-> Integer.compare(g1.getId(),g2.getId());
    before.sort(byId);
    after.sort(byId);

    //Assert.assertEquals(new HashSet<Object>(before), new HashSet<Object>(after));
    Assert.assertEquals(before, after);

  }


}

