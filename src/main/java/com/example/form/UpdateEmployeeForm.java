package com.example.form;
/**
 * @author nakaryunosuke
 * 従業員情報を保持するためのフォーム作成。
 */
public class UpdateEmployeeForm {
    // 従業員ID
    private Integer id;
    // 扶養人数
    private String dependentsCount;
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getDependentsCount() {
        return dependentsCount;
    }
    public void setDependentsCount(String dependentsCount) {
        this.dependentsCount = dependentsCount;
    }
    @Override
    public String toString() {
        return "UpdateEmployeeForm [id=" + id + ", dependentsCount=" + dependentsCount + "]";
    }
}
