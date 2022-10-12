package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

import java.util.List;


public class ContactCreationTests extends TestBase {


  @Test
  public void testContactCreation()  {
    app.getNavigationHelper().goToHomePage();
    //int before = app.getContactHelper().getContactCount();
    List<ContactData> before = app.getContactHelper().getContactList();
    app. getContactHelper().createContact(new ContactData("Test User1", "LastName1", "NewUser"
            , "Test Company1", "Russia, Moscow", "222222222"
            , "test@test.com", "13", "February", "1991"
            , "test1"));
    //int after = app.getContactHelper().getContactCount();
    //Assert.assertEquals(after, before + 1);
    List<ContactData> after = app.getContactHelper().getContactList();
    Assert.assertEquals(after.size(), before.size() + 1);
  }



}
