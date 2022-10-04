package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.*;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactModificationTests extends TestBase{

  @Test

  public void testContactModification(){
    app.getNavigationHelper().goToHomePage();
    app.getContactHelper().selectContact();
    app.getContactHelper().initContactModification();
    app. getContactHelper().fillContactForm(new ContactData("Test User1", "LastName1", "NewUser", "Test Company1", "Russia, Moscow", "222222222", "test@test.com", "13", "February", "1991"));
    app.getContactHelper().submitContactModification();
    app.getNavigationHelper().returnToHomePage();
  }


}
