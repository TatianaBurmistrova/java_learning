package ru.stqa.pft.addressbook.model;

import java.util.Objects;

public class ContactData {
  private int id;
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
  }

  public int getId() {return id;}

  public void setId(int id) {this.id = id;}

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
