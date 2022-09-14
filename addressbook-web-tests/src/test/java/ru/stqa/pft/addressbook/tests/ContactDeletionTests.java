package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;


public class ContactDeletionTests extends TestBase{


  @Test
  public void testContactDeletion() throws Exception {

    acceptNextAlert = true;
    app.getNavigationHelper().goToHomePage();
    app.getContactHelper().selectContact();
    app.getContactHelper().deleteSelectedContacts();
    assertTrue(closeAlertAndGetItsText().matches("Delete 1 addresses?"));
    app.getNavigationHelper().returnToHomePage();
  }


}
