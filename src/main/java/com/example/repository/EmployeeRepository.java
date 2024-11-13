package com.example.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;
/**
 * @author nakaryunosuke
 */

import com.example.domain.Employee;
@Repository
public class EmployeeRepository {
    @Autowired
    private NamedParameterJdbcTemplate template;

    private static final RowMapper<Employee> EMPLOYEE_ROW_MAPPER = (rs, i) -> {
        Employee employee = new Employee();
        employee.setId(rs.getInt("id"));
        employee.setName(rs.getString("name"));
        employee.setImage(rs.getString("image"));
        employee.setGender(rs.getString("gender"));
        employee.setHireDate(rs.getDate("hire_date"));
        employee.setMailAddress(rs.getString("mail_address"));
        employee.setZopCode(rs.getString("zip_code"));
        employee.setAddress(rs.getString("address"));
        employee.setTelephone(rs.getString("telephone"));
        employee.setSalary(rs.getInt("salary"));
        employee.setCharacteristics(rs.getString("characteristics"));
        employee.setDependentsCount(rs.getInt("dependents_count"));
        return employee;
    };

    /**
     * 従業員の一覧を調べる。
     * @return 従業員の一覧を返す。
     */
    public List<Employee> findAll(){
        String sql = "SELECT id,name,image,gender,hire_date,mail_address,zip_code,address,telephone,salary,characteristics,dependents_count FROM employees ORDER BY hire_date ASC";
        List<Employee> list = template.query(sql, EMPLOYEE_ROW_MAPPER);
        return list;
    }

    /**
     * 主キーから従業員情報を取得する。
     * @param 数値を受け取る主キーとして検索する。
     * @return 主キー検索より存在した従業員を返す。
     */
    public Employee load(Integer id){
        try {
            String sql = "SELECT id,name,image,gender,hire_date,mail_address,zip_code,address,telephone,salary,characteristics,dependents_count FROM employees WHERE id=:id";
            SqlParameterSource param = new MapSqlParameterSource().addValue("id", id);
            return template.queryForObject(sql, param, EMPLOYEE_ROW_MAPPER);
        } catch (Exception e) {
            // TODO: handle exception
            return null;
        }
    }

    /**
     * 従業員情報を更新する。
     * @param 従業員の更新情報を受け取る。
     */
    public void update(Employee employee){
        SqlParameterSource param = new BeanPropertySqlParameterSource(employee);
        String sql = "UPDATE employees SET dependents_count=:dependentsCount WHERE id=:id";
        template.update(sql, param);
    }
}

