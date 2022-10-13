package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

import java.util.List;


public class GroupDeletionTests extends TestBase {

  @Test
  public void testGroupDeletion() {
    app.getNavigationHelper().goToGroupPage();
        if (! app.getGroupHelper().isThereAGroup()){
     app.getGroupHelper().createGroup(new GroupData("test1", null, null));
    }
    //int before = app.getGroupHelper().getGroupCount();
    List<GroupData> before = app.getGroupHelper().getGroupList();
    app.getGroupHelper().selectGroup(before.size() - 1);
    app.getGroupHelper().deleteSelectedGroups();
    app.getGroupHelper().returnToGroupPage();
    List<GroupData> after = app.getGroupHelper().getGroupList();
    //int after = app.getGroupHelper().getGroupCount();
    //Assert.assertEquals(after, before - 1);
    Assert.assertEquals(after.size(), before.size() - 1);

    before.remove(before.size()-1);
    //for (int i = 0; i < after.size(); i++){
      Assert.assertEquals(before, after);

  }


}
