package md.tekwill.service;

import md.tekwill.dao.EmployeeDao;
import md.tekwill.model.Departament;
import md.tekwill.model.Employee;

public class EmployeeService {

    private EmployeeDao employeeDao = new EmployeeDao();

    public boolean create(Employee employee ) {
        if (employee.getName().length() > 0
                && employee.getLastName().length() > 0) {

            employeeDao.create(employee);
            return true;

        }
        System.out.println("Employee validation failed!");
        return false;
    }

    public Employee search(int id) {
        return employeeDao.read(id);
    }

    public void update(int employeeId, Employee updatedEmployee) {
        employeeDao.update(employeeId, updatedEmployee);

    }
    public void delete(int employeeId) {
        employeeDao.delete(employeeId);

    }

    public void listEmployees() {
        for (Employee employee : employeeDao.getAll()) {
            if (employee != null) {
                System.out.println("ID: " + employee.getId());
                System.out.println("Name: " + employee.getName());
                System.out.println("Last name: " + employee.getLastName());
            }

        }
    }
    //TODO
    // add similar methods as in DAO and call them here

    
}
