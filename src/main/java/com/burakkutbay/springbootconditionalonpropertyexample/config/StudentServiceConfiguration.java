package com.burakkutbay.springbootconditionalonpropertyexample.config;

import com.burakkutbay.springbootconditionalonpropertyexample.service.DatabaseServiceImpl;
import com.burakkutbay.springbootconditionalonpropertyexample.service.InMemoryServiceImpl;
import com.burakkutbay.springbootconditionalonpropertyexample.service.DataLayerService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentServiceConfiguration {

    @Bean
    @ConditionalOnProperty(prefix = "data.layer", name = "type", havingValue = "database")
    public DataLayerService inMemoryService(){
        return new InMemoryServiceImpl();
    }

    @Bean
    @ConditionalOnProperty(prefix = "data.layer", name = "type", havingValue = "inmemory")
    public DataLayerService databaseService(){
        return new DatabaseServiceImpl();
    }
}
