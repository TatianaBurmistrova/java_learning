package ru.stqa.pft.addressbook.model;

import java.util.Objects;

public class ContactData {
  private int id = Integer.MAX_VALUE;
  private String userfirstname;
  private String userlastname;
  private String title;
  private String company;
  private String address;
  private String mobile;
  private String email;
  private String bday;
  private String bmonth;
  private String byear;
  private String group;

 /* public ContactData(String userfirstname, String userlastname, String title,
                     String company, String address, String mobile, String email,
                     String bday, String bmonth, String byear, String group) {
    this.id = Integer.MAX_VALUE;//this.id = 0;
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
  public ContactData(int id, String userfirstname, String userlastname, String title,
                     String company, String address, String mobile, String email,
                     String bday, String bmonth, String byear, String group) {
    this.id = id;
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
  }*/

  public int getId() {return id;}

  public ContactData withId(int id) {
    this.id = id;
    return this;
  }

  public ContactData withUserfirstname(String userfirstname) {
    this.userfirstname = userfirstname;
    return this;
  }

  public ContactData withUserlastname(String userlastname) {
    this.userlastname = userlastname;
    return this;
  }

  public ContactData withTitle(String title) {
    this.title = title;
    return this;
  }

  public ContactData withCompany(String company) {
    this.company = company;
    return this;
  }

  public ContactData withAddress(String address) {
    this.address = address;
    return this;
  }

  public ContactData withMobile(String mobile) {
    this.mobile = mobile;
    return this;
  }

  public ContactData withEmail(String email) {
    this.email = email;
    return this;
  }

  public ContactData withBday(String bday) {
    this.bday = bday;
    return this;
  }

  public ContactData withBmonth(String bmonth) {
    this.bmonth = bmonth;
    return this;
  }

  public ContactData withByear(String byear) {
    this.byear = byear;
    return this;
  }

  public ContactData withGroup(String group) {
    this.group = group;
    return this;
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

  public String getGroup() { return group;  }

  @Override
  public String toString() {
    return "ContactData{" +
            "id='" + id + '\'' +
            ", userfirstname='" + userfirstname + '\'' +
            ", userlastname='" + userlastname + '\'' +
            '}';
  }

 /* @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    ContactData that = (ContactData) o;

    if (id != that.id) return false;
    if (!Objects.equals(userfirstname, that.userfirstname)) return false;
    return Objects.equals(userlastname, that.userlastname);
  }

  @Override
  public int hashCode() {
    int result = id;
    result = 31 * result + (userfirstname != null ? userfirstname.hashCode() : 0);
    result = 31 * result + (userlastname != null ? userlastname.hashCode() : 0);
    return result;
  }*/

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    ContactData that = (ContactData) o;

    if (!Objects.equals(userfirstname, that.userfirstname)) return false;
    return Objects.equals(userlastname, that.userlastname);
  }

  @Override
  public int hashCode() {
    int result = userfirstname != null ? userfirstname.hashCode() : 0;
    result = 31 * result + (userlastname != null ? userlastname.hashCode() : 0);
    return result;
  }
}
