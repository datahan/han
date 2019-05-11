package com.datawisher.highlight.spring5.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.datawisher.highlight.spring5.aop")
@EnableAspectJAutoProxy
public class AopConfig {
}
