package com.example.springcore.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.concurrent.ForkJoinPoolFactoryBean;

@Configuration
public class ForkJoinPoolConfiguration {

  @Bean
  public ForkJoinPoolFactoryBean forkJoinPoolFactoryBean() {
    ForkJoinPoolFactoryBean pool = new ForkJoinPoolFactoryBean();
    int processors = Runtime.getRuntime().availableProcessors();
    pool.setParallelism(processors);
    return pool;
  }
}
