package org.mousephenotype.cda.loader;

import org.mousephenotype.cda.loader.migrators.AlleleMigratorService;
import org.mousephenotype.cda.loader.migrators.GeneMigratorService;
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

    @Bean
    public GeneMigratorService geneMigratorService() {
        return new GeneMigratorService();
    }
}
