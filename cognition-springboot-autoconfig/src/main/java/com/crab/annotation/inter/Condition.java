package com.crab.annotation.inter;

import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public interface Condition {
    /**
     * 重写方法，只有当该方法返回true时才实例化Beab
     */
    boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata);
}
