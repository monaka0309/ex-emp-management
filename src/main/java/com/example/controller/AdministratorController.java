package com.example.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.Administrator;
// import com.example.domain.Administrator;
import com.example.form.InsertAdministratorForm;
import com.example.form.LoginForm;
import com.example.service.AdministratorService;

@Controller
@RequestMapping("/")
public class AdministratorController {
    @Autowired
    private AdministratorService service;

    /**
     * toInsertメソッドの実行。
     * @param InsertAdministratorFormの受け取り。
     * @return insert.htmlファイル名を返す。
     */
    @GetMapping("/toInsert")
    public String toInsert(InsertAdministratorForm form){
        return "administrator/insert";
    }

    /**
     * ユーザー情報を登録する。
     * @param InsertAdministratorForm情報を取得する。
     * @return viewファイルを返す。
     */
    @PostMapping("/insert")
    public String insert(InsertAdministratorForm form) {
        Administrator administrator = new Administrator();
        BeanUtils.copyProperties(form, administrator);
        service.insert(administrator);
        return "redirect:/";
    }
    /**
     * ログインページへフォワードする。
     * @param フォームで従業員登録をするリクエストパラメータを受け取る・
     * @return ログイン画面に遷移する。
     */
    @GetMapping("/")
    public String toLogin(LoginForm form) {
        return "administrator/login";
    }
}


