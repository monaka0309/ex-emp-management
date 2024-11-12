package com.example.domain;

import java.util.Date;

// import java.sql.Date;

// Employeeドメインクラスの作成。
public class Employee {
    // idフィールド
    private Integer id;
    // 名前フィールド
    private String name;
    // 画像フィールド
    private String image;
    // 性別フィールド
    private String gender;
    // 入社日フィールド
    private Date hireDate;
    // メールアドレスフィールド
    private String mailAddress;
    // 郵便番号フィールド
    private String zopCode;
    // 住所フィールド
    private String address;
    // 電話番号フィールド
    private Integer telephone;
    // 給料フィールド
    private Integer salary;
    // 特性フィールド
    private String characteristics;
    // 扶養人数フィールド
    private Integer dependentsCount;
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getImage() {
        return image;
    }
    public void setImage(String image) {
        this.image = image;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public Date getHireDate() {
        return hireDate;
    }
    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }
    public String getMailAddress() {
        return mailAddress;
    }
    public void setMailAddress(String mailAddress) {
        this.mailAddress = mailAddress;
    }
    public String getZopCode() {
        return zopCode;
    }
    public void setZopCode(String zopCode) {
        this.zopCode = zopCode;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public Integer getTelephone() {
        return telephone;
    }
    public void setTelephone(Integer telephone) {
        this.telephone = telephone;
    }
    public Integer getSalary() {
        return salary;
    }
    public void setSalary(Integer salary) {
        this.salary = salary;
    }
    public String getCharacteristics() {
        return characteristics;
    }
    public void setCharacteristics(String characteristics) {
        this.characteristics = characteristics;
    }
    public Integer getDependentsCount() {
        return dependentsCount;
    }
    public void setDependentsCount(Integer dependentsCount) {
        this.dependentsCount = dependentsCount;
    }
    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", image=" + image + ", gender=" + gender + ", hireDate="
                + hireDate + ", mailAddress=" + mailAddress + ", zopCode=" + zopCode + ", address=" + address
                + ", telephone=" + telephone + ", salary=" + salary + ", characteristics=" + characteristics
                + ", dependentsCount=" + dependentsCount + "]";
    }
}
