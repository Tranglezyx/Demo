package com.tr.tx;

import com.tr.tx.service.TxService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author trangle
 */
@ComponentScan("com.tr.tx")
@EnableTransactionManagement
public class TxApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(TxApplication.class);
        TxService txService = applicationContext.getBean(TxService.class);
        txService.insertTwoUser();
    }
}
