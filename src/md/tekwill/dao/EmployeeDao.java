package md.tekwill.dao;

import md.tekwill.model.Employee;
import md.tekwill.service.EmployeeService;

public class EmployeeDao {
    private static Employee[] employeesArr = new Employee[10];

    public void create(Employee employee) {
        for (int i = 0; i < employeesArr.length; i++) {
            Employee existingEmployee = employeesArr[i];
            if (existingEmployee == null) {
                employeesArr[i] = employee;
                break;
            }
        }
    }

    public Employee read(int employeeId) {
       for (Employee employee : employeesArr) {
              if(employee.getId()==employeeId){
                  return employee;
              }
          }
        return null;
    }

    public Employee update(int employeeId, Employee updatedEmployee) {
        for (Employee employee : employeesArr) {
              if(employee.getId()==employeeId){
                  return updatedEmployee;
              }
          }
        return null; 
    }

    public Employee delete(int employeeId) {
        for (Employee employee : employeesArr) {
              if(employee.getId()==employeeId){
                  return null;
              }
          }
        return null;
        
    }

    public Employee[] getAll() {
        return employeesArr;
    }
    

}
