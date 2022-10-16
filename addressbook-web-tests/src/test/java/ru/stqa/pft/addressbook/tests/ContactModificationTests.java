package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.*;
import ru.stqa.pft.addressbook.model.ContactData;

import java.util.Comparator;
import java.util.List;

public class ContactModificationTests extends TestBase{

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

  public void testContactModification(){

    //int before = app.getContactHelper().getContactCount();
    List<ContactData> before = app.contact().list();
    int index = before.size() - 1;
    ContactData contact = new ContactData().withId(before.get(index).getId())
            .withUserfirstname("Test User1").withUserlastname("LastName1");
    app.contact().modify(index, contact);
    //int after = app.getContactHelper().getContactCount();
    //Assert.assertEquals(after, before);
    List<ContactData> after = app.contact().list();
    Assert.assertEquals(after.size(), before.size());

    before.remove(index);
    before.add(contact);

    Comparator<? super ContactData> byId = (c1,c2)-> Integer.compare(c1.getId(),c2.getId());;
    before.sort(byId);
    after.sort(byId);
    Assert.assertEquals(before, after);
    //Assert.assertEquals(new HashSet<Object>(before), new HashSet<Object>(after));

  }




}
