package com.eazybytes.ex6.Config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan(basePackages ={"com.eazybytes.ex6.beans"})
public class ProjectConfig {
}
