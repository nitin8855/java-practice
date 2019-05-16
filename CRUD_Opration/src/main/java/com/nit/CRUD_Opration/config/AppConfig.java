package com.nit.CRUD_Opration.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(value = { HibernateConfiguration.class, ServiceConfig.class })
public class AppConfig {

}
