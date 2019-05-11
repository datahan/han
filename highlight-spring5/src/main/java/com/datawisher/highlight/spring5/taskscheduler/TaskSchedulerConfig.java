package com.datawisher.highlight.spring5.taskscheduler;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@ComponentScan("com.datawisher.highlight.spring5.taskscheduler")
@EnableScheduling
public class TaskSchedulerConfig {

}
