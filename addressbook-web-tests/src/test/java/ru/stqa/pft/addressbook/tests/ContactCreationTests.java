package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;


public class ContactCreationTests extends TestBase {


  @Test
  public void testContactCreation() throws Exception {
    app.getNavigationHelper().goToHomePage();
    app. getContactHelper().initContactCreation();
    app. getContactHelper().fillContactForm(new ContactData("Test User1", "LastName1", "NewUser"
            , "Test Company1", "Russia, Moscow", "222222222"
            , "test@test.com", "13", "February", "1991"
            , "test1"), true);
    //app. getContactHelper().addingContactToGroup("test1");
    app. getContactHelper().submitContactCreation();
    app.getNavigationHelper().returnToHomePage();
  }



}
