package md.tekwill.ui;

import md.tekwill.dao.EmployeeDao;
import md.tekwill.model.Employee;
import md.tekwill.service.EmployeeService;

import java.util.Arrays;

public class TestEmployee {
    public static void main(String[] args) {
        Employee employee = new Employee("Ion", "Bostan");
        Employee employee2 = new Employee("Vasile", "Josan");
        Employee employee3 = new Employee("Ana", "Dicusar");
        int id=4;

        EmployeeService employeeService = new EmployeeService();
        EmployeeDao emp=new EmployeeDao();
        boolean isEmployeeSaved = employeeService.create(employee);
        System.out.println("--------Create--------");
        employeeService.create(employee2);
        employeeService.create(employee3);
        employeeService.listEmployees();
        System.out.println();
        System.out.println("Select employee where id = " +id);
        employeeService.read(id);
        System.out.println();
        System.out.println("Update employee where id = " +id);
        employee2.setName("Cristian");
        employee2.setLastName("Rosu");
        employeeService.update(id,employee2);
        System.out.println();
        System.out.println("Delete employee where id = " +id);
        employeeService.delete(id);
        System.out.println();
        employeeService.listEmployees();

    }
}
