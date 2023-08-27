package net.lavedrine.homestock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class HomeStockApplication {

    public static void main(String[] args) {
        SpringApplication.run(HomeStockApplication.class, args);
    }

}
