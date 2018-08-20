package ru.stqa.pft.addressbook.model;

import java.util.Objects;

public class ContactData {
  private int id;
  private String firstname;
  private String middlename;
  private String lastname;
  private String nickname;
  private String title;
  private String company;
  private String address1;
  private String phome;
  private String pmobile;
  private String pwork;
  private String pfax;
  private String email1;
  private String emial2;
  private String email3;
  private String address2;
  private String group;

  public ContactData(int id,
                     String firstname,
                     String middlename,
                     String lastname,
                     String nickname,
                     String title,
                     String company,
                     String address1,
                     String phome,
                     String pmobile,
                     String pwork,
                     String pfax,
                     String email1,
                     String email2,
                     String email3,
                     String address2,
                     String group) {
    this.id = id;
    this.firstname = firstname;
    this.middlename = middlename;
    this.lastname = lastname;
    this.nickname = nickname;
    this.title = title;
    this.company = company;
    this.address1 = address1;
    this.phome = phome;
    this.pmobile = pmobile;
    this.pwork = pwork;
    this.pfax = pfax;
    this.email1 = email1;
    this.emial2 = email2;
    this.email3 = email3;
    this.address2 = address2;
    this.group = group;
  }

  public ContactData(
                     String firstname,
                     String middlename,
                     String lastname,
                     String nickname,
                     String title,
                     String company,
                     String address1,
                     String phome,
                     String pmobile,
                     String pwork,
                     String pfax,
                     String email1,
                     String email2,
                     String email3,
                     String address2,
                     String group) {
    this.id = id;
    this.firstname = firstname;
    this.middlename = middlename;
    this.lastname = lastname;
    this.nickname = nickname;
    this.title = title;
    this.company = company;
    this.address1 = address1;
    this.phome = phome;
    this.pmobile = pmobile;
    this.pwork = pwork;
    this.pfax = pfax;
    this.email1 = email1;
    this.emial2 = email2;
    this.email3 = email3;
    this.address2 = address2;
    this.group = group;
  }


  public int getId() {return  id;}

  public void setId(int id) {
    this.id =id;
  }

  public String getFirstname() {
    return firstname;
  }

  public String getMiddlename() {
    return middlename;
  }

  public String getLastname() {
    return lastname;
  }

  public String getNickname() {
    return nickname;
  }

  public String getTitle() {
    return title;
  }

  public String getCompany() {
    return company;
  }

  public String getAddress1() {
    return address1;
  }

  public String getPhome() {
    return phome;
  }

  public String getPmobile() {
    return pmobile;
  }

  public String getPwork() {
    return pwork;
  }

  public String getPfax() {
    return pfax;
  }

  public String getEmail1() {
    return email1;
  }

  public String getEmail2() {
    return emial2;
  }

  public String getEmail3() {
    return email3;
  }

  public String getAddress2() {
    return address2;
  }

  public String getGroup() {
    return group;
  }

  @Override
  public String toString() {
    return "ContactData{" +
            "id=" + id +
            ", firstname='" + firstname + '\'' +
            ", lastname='" + lastname + '\'' +
            ", address1='" + address1 + '\'' +
            '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ContactData that = (ContactData) o;
    return id == that.id &&
            Objects.equals(firstname, that.firstname) &&
            Objects.equals(lastname, that.lastname) &&
            Objects.equals(address1, that.address1);
  }

  @Override
  public int hashCode() {

    return Objects.hash(id, firstname, lastname, address1);
  }
}
