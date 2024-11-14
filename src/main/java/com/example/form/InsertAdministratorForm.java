package com.example.form;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

/*
 * InsertAdministratorFormクラスの作成。
 * @auther nakaryunosuke
 */
public class InsertAdministratorForm {
    // 名前フィールド
    @NotBlank(message = "名前を入力してください。")
    private String name;
    // メールアドレスフィールド
    @NotBlank(message = "メールアドレスを入力してください。")
    @Email(message = "メールアドレスを正しい形式で入力してください。")
    private String mailAddress;
    // パスワードフィールド
    @NotBlank(message = "パスワードを入力してください。")
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
