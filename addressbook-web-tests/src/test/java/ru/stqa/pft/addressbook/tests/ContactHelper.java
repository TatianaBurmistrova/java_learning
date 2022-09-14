package ru.stqa.pft.addressbook.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.stqa.pft.addressbook.appmanager.HelperBase;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactHelper extends HelperBase {

  public ContactHelper(WebDriver wd) {
    super(wd);
  }

  public void addingContactToGroup(String groupname) {
    selectionType(By.name("new_group"), groupname);
   }

  public void fillContactForm(ContactData contactData) {
    type(By.name("firstname"),contactData.getUserfirstname());
    type(By.name("lastname"),contactData.getUserlastname());
    type(By.name("title"),contactData.getTitle());
    type(By.name("company"),contactData.getCompany());
    type(By.name("address"),contactData.getAddress());
    type(By.name("mobile"),contactData.getMobile());
    type(By.name("email"),contactData.getEmail());
    selectionType(By.name("bday"), contactData.getBday());
    selectionType(By.name("bmonth"), contactData.getBmonth());
    type(By.name("byear"),contactData.getByear());

  }

  public void initContactCreation() {
    click(By.linkText("add new"));
  }

  public void submitContactCreation() {
    click(By.name("submit"));
  }

  public void selectContact() {
    click(By.id("23"));
  }

  public void deleteSelectedContacts() {
    click(By.xpath("//input[@value='Delete']"));
  }
}
