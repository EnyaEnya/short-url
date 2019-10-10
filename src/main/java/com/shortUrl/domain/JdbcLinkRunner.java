package com.shortUrl.domain;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class JdbcLinkRunner {


    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("jdbctemplate-link-config.xml");

        JdbcTemplateLinkDaoImpl jdbcTemplateLinkDao =
                (JdbcTemplateLinkDaoImpl) context.getBean("jdbcTemplateLinkDao");

        System.out.println("========Creating new records to DB========");
        jdbcTemplateLinkDao.createItem(1, "this_is_test_long_link1", "short_link1");
        jdbcTemplateLinkDao.createItem(2, "this_is_test_long_link2", "short_link2");
        jdbcTemplateLinkDao.createItem(3, "this_is_test_long_link3", "short_link3");

        System.out.println("========Links List========");
        List items = jdbcTemplateLinkDao.listItems();
        for (Object object : items) {
            System.out.println(object);
        }

        System.out.println("========Some changes to DB========");
        jdbcTemplateLinkDao.updateItem(3, "this_is_another_test_long_link", "short_link");
        //jdbcTemplateLinkDao.removeItem(6);

        System.out.println("========Final Links List========");
        List finalItems = jdbcTemplateLinkDao.listItems();
        for (Object object : finalItems) {
            System.out.println(object);
        }
    }

}
