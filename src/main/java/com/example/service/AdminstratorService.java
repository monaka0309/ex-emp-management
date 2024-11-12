package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.domain.Adminstrator;
import com.example.repository.AdminstratorRepository;
/**
 * @author nakaryunosuke
 */
@Service
@Transactional
public class AdminstratorService {
    @Autowired
    private AdminstratorRepository repository;

    // /**
    //  * AdminstratorRepositoryクラスのinsertメソッドを実行する。
    //  * @param adminstrator
    //  */
    // public void insert(Adminstrator adminstrator){
    //     repository.insert(adminstrator);
    // }
    // /**
    //  * AdminstratorRepositoryクラスのfindByMailAddressAndPasswordメソッドを実行する。
    //  * @param メールアドレスとパスワードを受け取る。
    //  * @return 結果を返す。
    //  */
    // public Adminstrator findByMailAddressAndPassword(String mailAddress, String password){
    //     return repository.findByMailAddressAndPassword(mailAddress, password);
    // }
}
