package com

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;/example.demo;

@Configuration
@EnableAutoConfiguration
@EnableTransactionManagement
@EnableJPARepositories({"com.example.demo"})
@ComponentScan({"pl.infinite.edinet", "pl.infinite.b2b"})

public class AppCongig{

}