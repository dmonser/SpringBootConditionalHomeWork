package ru.netollogy.springStartHomeWork.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.netollogy.springStartHomeWork.service.DevProfile;
import ru.netollogy.springStartHomeWork.service.ProductionProfile;
import ru.netollogy.springStartHomeWork.service.SystemProfile;

@Configuration
public class WebConfig {

    @Bean
    @ConditionalOnProperty(prefix = "netology.profile", name = "dev", havingValue = "true")
    public SystemProfile devProfile() {
        return new DevProfile();
    }

    @Bean
    @ConditionalOnProperty(prefix = "netology.profile", name = "dev", havingValue = "false")
    public SystemProfile prodProfile() {
        return new ProductionProfile();
    }

}
