package com.example.form;
/*
 * @auther nakaryunosuke
 * InsertAdministratorFormクラスの作成。
 */
public class InsertAdministratorForm {
    // 名前フィールド
    private String name;
    // メールアドレスフィールド
    private String mailAddress;
    // パスワードフィールド
    private String password;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getMailAddress() {
        return mailAddress;
    }
    public void setMailAddress(String mailAddress) {
        this.mailAddress = mailAddress;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    @Override
    public String toString() {
        return "InsertAdministratorForm [name=" + name + ", mailAddress=" + mailAddress + ", password=" + password
                + "]";
    }
}
