package ru.stqa.pft.addressbook.model;

public class ContactData {
  private final String firstname;
  private final String middlename;
  private final String lastname;
  private final String nickname;
  private final String title;
  private final String company;
  private final String address1;
  private final String phome;
  private final String pmobile;
  private final String pwork;
  private final String pfax;
  private final String email1;
  private final String emial2;
  private final String email3;
  private final String address2;

  public ContactData(String firstname, String middlename, String lastname, String nickname, String title, String company, String address1, String phome, String pmobile, String pwork, String pfax, String email1, String emial2, String email3, String address2) {
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
    this.emial2 = emial2;
    this.email3 = email3;
    this.address2 = address2;
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

  public String getEmial2() {
    return emial2;
  }

  public String getEmail3() {
    return email3;
  }

  public String getAddress2() {
    return address2;
  }
}
