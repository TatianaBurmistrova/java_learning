package ru.stqa.pft.addressbook.model;

public class ContactData {
  private final String userfirstname;
  private final String userlastname;
  private final String title;
  private final String company;
  private final String address;
  private final String mobile;
  private final String email;
  private final String bday;
  private final String bmonth;
  private final String byear;
  private final String group;

  public ContactData(String userfirstname, String userlastname, String title,
                     String company, String address, String mobile, String email,
                     String bday, String bmonth, String byear, String group) {
    this.userfirstname = userfirstname;
    this.userlastname = userlastname;
    this.title = title;
    this.company = company;
    this.address = address;
    this.mobile = mobile;
    this.email = email;
    this.bday = bday;
    this.bmonth = bmonth;
    this.byear = byear;
    this.group = group;
  }

  public String getUserfirstname() {
    return userfirstname;
  }

  public String getUserlastname() {
    return userlastname;
  }

  public String getTitle() {
    return title;
  }

  public String getCompany() {
    return company;
  }

  public String getAddress() {
    return address;
  }

  public String getMobile() {
    return mobile;
  }

  public String getEmail() {
    return email;
  }

  public String getBday() {
    return bday;
  }

  public String getBmonth() {
    return bmonth;
  }

  public String getByear() {
    return byear;
  }

  public String getGroup() {
    return group;
  }
}
