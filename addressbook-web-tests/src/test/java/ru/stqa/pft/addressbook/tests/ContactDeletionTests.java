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
      app.contact().create(new ContactData().withUserfirstname("Test User1").withUserlastname("LastName1").withTitle("NewUser")
              .withCompany("Test Company1").withAddress("Russia, Moscow").withMobile("222222222")
              .withEmail("test@test.com").withBday("13").withBmonth("February"). withByear("1991")
              .withGroup("test1"));
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
