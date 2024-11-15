package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.domain.Employee;
import com.example.repository.EmployeeRepository;
/**
 * 従業員サービスクラスの作成。
 * @author nakaryunosuke
 */
@Service
@Transactional
public class EmployeeService {
    @Autowired
    private EmployeeRepository repository;

    /**
     * 従業員一覧の作成。
     * @return Employeeリストを返す。
     */
    public List<Employee> showList(){
        return repository.findAll();
    }
    /**
     * 従業員詳細ページを作る。
     * @param idを取得する。
     * @return 従業員情報を返す。
     */
    public Employee showDetail(Integer id){
        return repository.load(id);
    }
    /**
     * 従業員の人数を更新する。
     * @param 
     */
    public void update(Employee employee){
        repository.update(employee);
    }
}
