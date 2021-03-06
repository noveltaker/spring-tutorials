package com.example.sse;

import com.example.common.config.db.LocalDBConstants;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.sse", LocalDBConstants.LOCAL_DB_SCAN_PATH})
public class SpringSseApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringSseApplication.class, args);
  }
}
