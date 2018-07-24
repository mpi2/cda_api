package org.mousephenotype.cda.loader;

import org.mousephenotype.cda.loader.migrators.AlleleMigratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LoaderApplication implements CommandLineRunner {

    @Autowired
    AlleleMigratorService alleleMigratorService;

    public static void main(String[] args) {
        SpringApplication.run(LoaderApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        alleleMigratorService.migrate(0, 10);
    }
}
