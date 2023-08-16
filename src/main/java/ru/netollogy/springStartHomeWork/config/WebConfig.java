package ru.netollogy.springStartHomeWork.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.netollogy.springStartHomeWork.service.DevProfile;
import ru.netollogy.springStartHomeWork.service.ProductionProfile;
import ru.netollogy.springStartHomeWork.service.SystemProfile;

@Configuration
@ConfigurationProperties("netology.profile")
public class WebConfig {
    private boolean dev;

    public void setDev(boolean dev) {
        this.dev = dev;
    }

    @ConditionalOnProperty(matchIfMissing = true)
    @Bean
    public SystemProfile devProfile() {
        return new DevProfile();
    }

    @ConditionalOnProperty()
    @Bean
    public SystemProfile prodProfile() {
        return new ProductionProfile();
    }
}
