package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        CustomerDao customerDao = context.getBean(CustomerDao.class);

        Customer customer = new Customer("Анастасия Бондаренко", "anastasiiabond@example.com", "123-45-6789");

        customerDao.addCustomer(customer);

        System.out.println("Клиент добавлен: " + customer.getFullName());
    }
}
