package com.gupaoedu;

import com.gupaoedu.datasource.DynamicDataSourceConfig;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Import;

/**
 *
 */
@MapperScan("com.gupaoedu.mapper")
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@Import({DynamicDataSourceConfig.class})
public class DynamicDSApp {

    public static void main(String[] args) {
        SpringApplication.run(DynamicDSApp.class, args);
    }

}
