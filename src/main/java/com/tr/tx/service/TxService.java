package com.tr.tx.service;

import com.tr.tx.dao.TxDao;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author trangle
 */
@Component
@RequiredArgsConstructor
public class TxService {

    private final TxDao txDao;

    @Transactional(rollbackFor = Exception.class)
    public int insertTwoUser() {
        insertUser();
//        int i = 1 / 0;
        insertUser();
        return 2;
    }

    public int insertUser() {
        Long id = System.currentTimeMillis();
        String userName = "tx_user_test";
        return txDao.insertUser(id, userName);
    }
}
