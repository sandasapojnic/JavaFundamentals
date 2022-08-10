package md.tekwill.service;

import md.tekwill.dao.EmployeeDao;
import md.tekwill.model.Employee;

public class EmployeeService {
    private EmployeeDao employeeDao = new EmployeeDao();

    public boolean create(Employee employee) {
        if (employee.getName().length() > 0 &&
                employee.getLastName().length() > 0) {
            employeeDao.create(employee);
            return true;

        }
        System.out.println("Employee validation failed!");
        return false;
    }
    public boolean read(int empId){
        for (Employee employee : employeeDao.getAll()) {
            if (employee != null) {
                if (employee.getId() == empId) {
                    employeeDao.read(empId);
                    return true;
                }
            }
        }
        System.out.println("This id was not found!");
       return false;
    }
    public boolean update(int empId,Employee updateEmployee){
            if (updateEmployee.getName().length() > 0
                    && updateEmployee.getLastName().length() > 0
            && updateEmployee.getId()==empId) {
                employeeDao.update(empId, updateEmployee);
                return true;
            }

        return false;
    }
    public boolean delete(int empId){
        for (Employee employee : employeeDao.getAll()) {
            if (employee != null) {
                if (employee.getId() == empId) {
                    employeeDao.delete(empId);
                    return true;
                }
            }
        }
        System.out.println("This id was not found!");
        return false;
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
