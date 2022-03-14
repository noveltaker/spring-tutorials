package com.example.springweb;

import com.example.common.config.db.LocalDBConstants;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.springweb", LocalDBConstants.LOCAL_DB_SCAN_PATH})
public class SpringWebApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringWebApplication.class, args);
  }
}
