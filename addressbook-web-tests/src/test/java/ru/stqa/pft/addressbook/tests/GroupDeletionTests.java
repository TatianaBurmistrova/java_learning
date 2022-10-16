package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

import java.util.List;


public class GroupDeletionTests extends TestBase {
  @BeforeMethod
  public void ensurePreconditions() {
    app.goTo().groupPage();
    if (app.group().list().size() == 0){
      app.group().create(new GroupData().withName("test1"));
    }
  }

  @Test
  public void testGroupDeletion() {
    //int before = app.getGroupHelper().getGroupCount();
    List<GroupData> before = app.group().list();
    int index = before.size() -1;
    app.group().delete(index);
    List<GroupData> after = app.group().list();
    //int after = app.getGroupHelper().getGroupCount();
    //Assert.assertEquals(after, before - 1);
    Assert.assertEquals(after.size(), before.size() - 1);

    before.remove(index);
    //for (int i = 0; i < after.size(); i++){
      Assert.assertEquals(before, after);

  }




}
