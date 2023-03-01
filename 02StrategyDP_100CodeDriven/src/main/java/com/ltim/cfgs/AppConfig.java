package com.ltim.cfgs;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ComponentScan("com.ltim.beans")
@ImportResource("com/ltim/cfgs/applicationContext.xml")
public class AppConfig {

}
