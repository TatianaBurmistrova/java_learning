package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import ru.stqa.pft.addressbook.model.ContactData;

import java.util.ArrayList;
import java.util.List;

public class ContactHelper extends HelperBase {

    public ContactHelper(WebDriver wd) {
    super(wd);
  }

  public void switchToAlert() {
    wd.switchTo().alert().accept();
  }

  public void fillContactForm(ContactData contactData, boolean creation) {
    type(By.name("firstname"),contactData.getUserfirstname());
    type(By.name("lastname"),contactData.getUserlastname());
    type(By.name("title"),contactData.getTitle());
    type(By.name("company"),contactData.getCompany());
    type(By.name("address"),contactData.getAddress());
    type(By.name("mobile"),contactData.getMobile());
    type(By.name("email"),contactData.getEmail());
    type(By.name("bday"), contactData.getBday());
    type(By.name("bmonth"), contactData.getBmonth());
    type(By.name("byear"),contactData.getByear());
    if (creation){
      new Select(wd.findElement(By.name("new_group"))).selectByVisibleText(contactData.getGroup());
    } else {
      Assert.assertFalse(isElementPresent(By.name("new_group")));
    }
  }
  public void initContactCreation() {
    click(By.linkText("add new"));
  }
  public void submitContactCreation() {
    click(By.name("submit"));
  }
  public void selectContact(int index) {
      wd.findElements(By.name("selected[]")).get(index).click();
  }
  public void deleteSelectedContacts() {
    click(By.xpath("//input[@value='Delete']"));
  }
  public void initContactModification() {
    click(By.xpath("//img[@alt='Edit']"));
  }
  public void submitContactModification() {
    click(By.xpath("//input[22]"));
  }
  public void returnToHomePage() {
    if (isElementPresent(By.id("maintable"))){
      return;
    }
    click(By.linkText("home page"));
  }
  public void create(ContactData contact) {
    initContactCreation();
    fillContactForm(contact, true);
    submitContactCreation();
    returnToHomePage();
  }
  public void modify(int index, ContactData contact) {
    selectContact(index);
    initContactModification();
    fillContactForm(contact, false);
    submitContactModification();
    returnToHomePage();
  }
  public void delete(int index) {
    selectContact(index);
    deleteSelectedContacts();
    switchToAlert();
  }

  public boolean isThereAContact() {
      return isElementPresent(By.name("selected[]"));
  }

  public int getContactCount() {
      return wd.findElements(By.name("selected[]")).size();
  }

  public List<ContactData> list() {
      List<ContactData> contacts = new ArrayList<ContactData>();
    List<WebElement> elements = wd.findElements(By.name("entry"));
    for (WebElement element: elements){
      List<WebElement> cells = element.findElements(By.tagName("td"));
      int id = Integer.parseInt(element.findElement(By.tagName("input")).getAttribute("value"));
      String userfirstname = cells.get(2).getText();
      String userlastname = cells.get(1).getText();
      ContactData contact = new ContactData(id, userfirstname, userlastname,null, null, null
              , null, null, null, null, null, null);
      contacts.add(contact);
    }
    return contacts;
  }
}
