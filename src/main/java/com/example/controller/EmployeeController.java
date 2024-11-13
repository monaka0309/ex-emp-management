package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.Employee;
import com.example.form.UpdateEmployeeForm;
import com.example.service.EmployeeService;

/**
 * @author nakaryunosuke
 * 従業員のコントローラークラス
 */
@Controller
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    /**
     * 従業員一覧を出力する。
     * @param リクエストスコープを受け取る。
     * @return viewファイルを返す。
     */
    @GetMapping("/showList")
    public String showList(Model model){
        List<Employee> employeeList = employeeService.showList();
        model.addAttribute("employeeList", employeeList);
        return "employee/list";
    }
    /**
     * 従業員詳細を開く。
     * @param id,form,modelを取得する。
     * @return viewファイルを返す。
     */
    @RequestMapping("/showDetail")
    public String showDetail(String id, Model model, UpdateEmployeeForm form){
        Integer num = Integer.parseInt(id);
        Employee employee = employeeService.showDetail(num);
        model.addAttribute("employee", employee);
        return "employee/detail";
    }
}
