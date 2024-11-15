package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.domain.Administrator;
import com.example.repository.AdministratorRepository;
/**
 * @author nakaryunosuke
 */
@Service
@Transactional
public class AdministratorService {
    @Autowired
    private AdministratorRepository repository;

    /**
     * AdministratorRepositoryクラスのinsertメソッドを実行する。
     * @param administrator
     */
    public void insert(Administrator administrator){
        repository.insert(administrator);
    }
    /**
     * administratorRepositoryクラスのfindByMailAddressAndPasswordメソッドを実行する。
     * @param メールアドレスとパスワードを受け取る。
     * @return 結果を返す。
     */
    public Administrator findByMailAddressAndPassword(String mailAddress, String password){
        return repository.findByMailAddressAndPassword(mailAddress, password);
    }
    /**
     * ログイン機能の作成。
     * @param メールアドレスとパスワードを受け取る。
     * @return 管理者情報を返す。
     */
    public Administrator login(String mailAddress, String password){
        return repository.findByMailAddressAndPassword(mailAddress, password);
    }
}
