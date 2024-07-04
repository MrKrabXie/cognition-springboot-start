package com.crab.annotation.impl;

import com.crab.annotation.inter.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class BirdEnvironmentCondition implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        Environment env = context.getEnvironment();
        String[] envs = env.getActiveProfiles();
        for (String e : envs) {
            System.out.println(e);
        }
        return env.containsProperty("animal.bird.doing");
    }
}
