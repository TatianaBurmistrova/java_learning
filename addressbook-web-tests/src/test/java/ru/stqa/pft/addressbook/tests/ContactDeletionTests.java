package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.*;
import ru.stqa.pft.addressbook.model.ContactData;

import java.util.List;


public class ContactDeletionTests extends TestBase{
  @BeforeMethod
  public void ensurePreconditions() {
    app.goTo().homePage();
    if (app.contact().list().size() == 0){
      app.contact().create(new ContactData("Test User1", "LastName1", "NewUser"
              , "Test Company1", "Russia, Moscow", "222222222"
              , "test@test.com", "13", "February", "1991"
              , "test1"));
    }
  }

  @Test
  public void testContactDeletion() {

    //int before = app.getContactHelper().getContactCount();
    List<ContactData> before = app.contact().list();
    int index = before.size() - 1;
    app.contact().delete(index);
    app.goTo().homePage();
    //int after = app.getContactHelper().getContactCount();
    //Assert.assertEquals(after, before - 1);
    List<ContactData> after = app.contact().list();
    Assert.assertEquals(after.size(), before.size() - 1);

    before.remove(index);
    Assert.assertEquals(before, after);

  }




}
