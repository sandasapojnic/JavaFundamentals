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
        for (int i = 0; i < employeesArr.length; i++) {
            Employee selectEmployee = employeesArr[i];
          if(selectEmployee!=null){
              if(selectEmployee.getId()==employeeId){
                  print(selectEmployee);
             }
          }
        }

        return null;
    }

    public void update(int employeeId, Employee updatedEmployee) {
        for (int i = 0; i < employeesArr.length; i++) {
            Employee employee = employeesArr[i];
            if(employee!=null){
                if(employee.getId()==employeeId){
                    employeesArr[i]=updatedEmployee;
                    print(updatedEmployee);
                }
            }
        }
    }

    public void delete(int employeeId) {
        for (int i = 0; i < employeesArr.length; i++) {
            Employee deleteEmployee = employeesArr[i];
            if(deleteEmployee!=null){
                if(deleteEmployee.getId()==employeeId){
                    employeesArr[i]=null;
                }
            }
        }
    }

    public Employee[] getAll() {
        return employeesArr;
    }
    public void print (Employee employee){
        System.out.println("ID: " + employee.getId());
        System.out.println("Name: " + employee.getName());
        System.out.println("Last name: " + employee.getLastName());
    }

}
