package com.example.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.AbstractSqlParameterSource;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import com.example.domain.Adminstrator;

/**
* @author nakaryunosuke
*/

@Repository
public class AdminstratorRepository {
    @Autowired
    private NamedParameterJdbcTemplate template;

    private static final RowMapper<Adminstrator> ADMINSTRATOR_ROW_MAPPER = (rs, i) -> {
        Adminstrator adminstrator = new Adminstrator();
        adminstrator.setId(rs.getInt("id"));
        adminstrator.setName(rs.getString("name"));
        adminstrator.setMailAddress(rs.getString("mailAddress"));
        adminstrator.setPassword(rs.getString("password"));
        return adminstrator;
    };

/**
 * Adminstratorにデータを追加します。
 * @param Adminstratorのデータを受け取ります。
 */
    public void insert(Adminstrator adminstrator){
        String sql = "INSERT INTO adminstrator(id,name,mailAddress,password) VALUES(:id,:name,:mailAddress,:password)";
        AbstractSqlParameterSource param = new BeanPropertySqlParameterSource(adminstrator);
        template.update(sql, param);
    }

/**
 * Adminstratorのデータを検索します。
 * @param メールアドレスとパスワードを受け取ります。
 * @return 検索結果を返します。検索結果が0の時はnullを返します。
 */
    public Adminstrator findByMailAddressAndPassword(String mailAddress, String password){
        String sql = "SELECT id,name,mailAddress FROM adminstrator WHERE mailAddress=:mailAddress AND password=:password";
        SqlParameterSource param = new MapSqlParameterSource().addValue("mailAddress", mailAddress).addValue("password", password);
        List<Adminstrator> adminstratorList = template.query(sql, param, ADMINSTRATOR_ROW_MAPPER);
        if(adminstratorList.size()==0){
            return null;
        }
        return adminstratorList.get(0);
    };


}
