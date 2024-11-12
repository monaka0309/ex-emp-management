package com.example.form;
/**
 * @author nakaryunosuke
 */
public class LoginForm {
    // メールアドレスフィールド
    private String mailAddress;
    // パスワードフィールド
    private String password;

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
        return "LoginForm [mailAddress=" + mailAddress + ", password=" + password + "]";
    }
}
