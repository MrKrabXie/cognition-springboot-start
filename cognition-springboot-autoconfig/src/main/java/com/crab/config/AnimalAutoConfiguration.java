package com.crab.config;

import com.crab.annotation.Conditional;
import com.crab.annotation.impl.BirdEnvironmentCondition;
import com.crab.service.AnimalService;
import com.crab.service.BirdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(AnimalProperties.class)
@ConditionalOnClass(AnimalProperties.class)
public class AnimalAutoConfiguration {
    @Autowired
    private AnimalProperties animalProperties;

    @Bean
    @ConditionalOnMissingBean(AnimalService.class)
    public AnimalService animalService() {
        return new AnimalService(animalProperties);
    }

    /**
     * 只有满足当BirdEnvironmentCondition.matches 返回true时才实例化BirdService
     */
    @Bean
    @Conditional(BirdEnvironmentCondition.class)
    @ConditionalOnMissingBean(BirdService.class)
    public BirdService birdService() {
        return new BirdService(animalProperties);
    }

}
