package com.huawei.cse.porter.website;

import org.apache.servicecomb.springboot.starter.provider.EnableServiceComb;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(value="com.huawei.cse.porter.website.dao")
@EnableServiceComb
public class WebsiteMain {
    public static void main(final String[] args) {
        SpringApplication.run(WebsiteMain.class, args);
    }
}
