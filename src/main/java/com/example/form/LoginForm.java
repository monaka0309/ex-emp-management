package com.example.form;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

/**
 * @author nakaryunosuke
 */
public class LoginForm {
    // メールアドレスフィールド
    @NotBlank(message = "メールアドレスを入力してください。")
    @Email(message = "メールアドレスを正しい形式で入力してください。")
    private String mailAddress;
    // パスワードフィールド
    @NotBlank(message = "パスワードを入力してください。")
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
