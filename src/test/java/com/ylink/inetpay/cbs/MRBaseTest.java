package com.ylink.inetpay.cbs;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath*:spring/spring-core.xml"})
@TransactionConfiguration(transactionManager="mrTxManager")
public class MRBaseTest {

@Autowired

	protected ApplicationContext applicationContext;
}
