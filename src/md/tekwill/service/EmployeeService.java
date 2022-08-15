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
    public Employee read(int empId){
        
       return employeeDao.read(empId);
                    
    }
    public Employee update(int empId,Employee updateEmployee){
           
        return employeeDao.update(empId, updateEmployee);
               
    }
    public Employee delete(int empId){
        
      return employeeDao.delete(empId);
                  
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
