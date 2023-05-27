package ru.sanctio.spring.rest;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.sanctio.spring.rest.configuration.MyConfig;
import ru.sanctio.spring.rest.entity.Employee;

import java.util.List;

public class App {
    public static void main( String[] args ) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        Communication communication = context.getBean("communication", Communication.class);
//        List<Employee> allEmployees = communication.getAllEmployees();
//        System.out.println(allEmployees);

//        Employee empById = communication.getEmployee(2);
//        System.out.println(empById);

//        Employee employee = new Employee("Sveta", "Sokolova", "IT", 1900);
//        employee.setId(13);
//        communication.saveEmployee(employee);

        communication.deleteEmployee(13);
    }
}
