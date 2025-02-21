package com.luv2code.springcoredeme.config;

import com.luv2code.springcoredeme.common.Coach;
import com.luv2code.springcoredeme.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean("aquatic")
    public Coach swimCoach() {
        return new SwimCoach();
    }
}
