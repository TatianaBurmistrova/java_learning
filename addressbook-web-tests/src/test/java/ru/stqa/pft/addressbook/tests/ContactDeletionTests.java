package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;


public class ContactDeletionTests extends TestBase{


  @Test
  public void testContactDeletion() {
    app.getNavigationHelper().goToHomePage();
    int before = app.getContactHelper().getContactCount();
    if (! app.getContactHelper().isThereAContact()){
      app.getContactHelper().createContact(new ContactData("Test User1", "LastName1", "NewUser"
              , "Test Company1", "Russia, Moscow", "222222222"
              , "test@test.com", "13", "February", "1991"
              , "test1"));
          }
    app.getContactHelper().selectContact(before - 1);
    app.getContactHelper().deleteSelectedContacts();
    app.getContactHelper().switchToAlert();
    app.getNavigationHelper().goToHomePage();
    int after = app.getContactHelper().getContactCount();
    Assert.assertEquals(after, before - 1);

  }


}
