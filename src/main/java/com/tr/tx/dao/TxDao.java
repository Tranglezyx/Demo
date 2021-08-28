package com.tr.tx.dao;

import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * create table demo.tr_user
 * (
 * user_id       bigint       not null
 * primary key,
 * user_name     varchar(50)  not null,
 * password      varchar(200) null,
 * creation_date datetime     null
 * );
 *
 * @author trangle
 */
@Repository
@RequiredArgsConstructor
public class TxDao {

    private final JdbcTemplate jdbcTemplate;

    public int insertUser(Long userId, String userName) {
        String sql = "insert into tr_user(user_id,user_name) values (?,?)";
        return jdbcTemplate.update(sql, userId, userName);
    }
}
