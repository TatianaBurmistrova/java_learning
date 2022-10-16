package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.*;
import ru.stqa.pft.addressbook.model.ContactData;

import java.util.Comparator;
import java.util.List;


public class ContactCreationTests extends TestBase {


  @Test
  public void testContactCreation()  {
    app.goTo().homePage();
    //int before = app.getContactHelper().getContactCount();
    List<ContactData> before = app.contact().list();
    ContactData contact = new ContactData("Test User1", "LastName1", null
            , null, null, null
            , null, null, null, null
            , "test1");
    app.contact().create(contact);
    //int after = app.getContactHelper().getContactCount();
    //Assert.assertEquals(after, before + 1);
    List<ContactData> after = app.contact().list();
    Assert.assertEquals(after.size(), before.size() + 1);


    //contact.setId(after.stream().max((o1, o2) -> Integer.compare(o1.getId(),o2.getId())).get().getId());
    before.add(contact);
    //Assert.assertEquals(new HashSet<Object>(before), new HashSet<Object>(after));
    Comparator<? super ContactData> byId = (c1, c2)-> Integer.compare(c1.getId(),c2.getId());;
    before.sort(byId);
    after.sort(byId);
    Assert.assertEquals(before, after);

  }

}
