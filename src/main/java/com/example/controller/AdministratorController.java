package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.form.InsertAdministratorForm;
import com.example.service.AdminstratorService;

/**
 * AdministratorControllerクラスの作成。
 * @author nakaryunosuke
 */
@Controller
@RequestMapping("/")
public class AdministratorController {
    @Autowired
    private AdminstratorService service;

    /**
     * toInsertメソッドの実行。
     * @param InsertAdministratorFormの受け取り。
     * @return insert.htmlファイル名を返す。
     */
    @GetMapping("/toInsert")
    public String toInsert(InsertAdministratorForm form){
        return "administrator/insert";
    }
}
