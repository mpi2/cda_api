package org.mousephenotype.cda.loader;

import org.mousephenotype.cda.loader.migrators.AlleleMigratorService;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
public class LoaderConfig {

    @Bean
    public AlleleMigratorService alleleMigratorService() {
        return new AlleleMigratorService();
    }
}
