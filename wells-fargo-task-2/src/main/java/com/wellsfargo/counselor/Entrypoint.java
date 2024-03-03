//package com.wellsfargo.counselor;
//
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
//
//@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
//public class Entrypoint {
//
//    public static void main(String[] args) {
//        SpringApplication.run(Entrypoint.class, args);
//    }
//
//}
package com.wellsfargo.counselor;

import com.wellsfargo.counselor.entity.Client;
import com.wellsfargo.counselor.entity.FinancialAdvisor;
import com.wellsfargo.counselor.entity.Portfolio;
import com.wellsfargo.counselor.entity.Security;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ApplicationContext;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class Entrypoint {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Entrypoint.class, args);

        // Retrieve beans for entities
        FinancialAdvisor financialAdvisor = context.getBean(FinancialAdvisor.class);
        Client client = context.getBean(Client.class);
        Portfolio portfolio = context.getBean(Portfolio.class);
        Security security = context.getBean(Security.class);

        // Print out some information
        System.out.println("Financial Advisor: " + financialAdvisor.getName());
        System.out.println("Client: " + client.getName());
        System.out.println("Portfolio ID: " + portfolio.getId());
        System.out.println("Security Name: " + security.getName());
    }
}
