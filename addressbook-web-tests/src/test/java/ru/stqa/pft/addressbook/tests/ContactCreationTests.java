package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.*;
import ru.stqa.pft.addressbook.model.ContactData;


public class ContactCreationTests extends TestBase {


  @Test
  public void testContactCreation()  {
    app.getNavigationHelper().goToHomePage();
    int before = app.getContactHelper().getContactCount();
    app. getContactHelper().createContact(new ContactData("Test User1", "LastName1", "NewUser"
            , "Test Company1", "Russia, Moscow", "222222222"
            , "test@test.com", "13", "February", "1991"
            , "test1"));
    int after = app.getContactHelper().getContactCount();
    Assert.assertEquals(after, before + 1);
  }



}
