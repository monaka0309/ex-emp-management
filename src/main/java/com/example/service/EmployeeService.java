package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.domain.Employee;
import com.example.repository.EmployeeRepository;
/**
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

    // /**
    //  * 従業員情報を全件取り出し、入社日順で並べる。
    //  * @return 全ての従業員情報を返す。
    //  */
    // public List<Employee> findAll(){
    //     return repository.findAll();
    // }
    // /**
    //  * 主キーに当てはまる従業員情報を検索する。
    //  * @param idを受け取る。
    //  */
    // public Employee load(Integer id){
    //     return repository.load(id);
    // }
    // /**
    //  * 従業員情報を更新する。
    //  * @param 従業員情報を受け取る。
    //  */
    // public void update(Employee employee){
    //     repository.update(employee);
    // }

}
