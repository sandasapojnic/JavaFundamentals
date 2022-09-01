package md.tekwill.dao;

import md.tekwill.model.Employee;
import md.tekwill.model.Departament;

public class EmployeeDao {

    private static Employee[] employeesArr = new Employee[10];

    public void create(Employee employee ) {
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
            if (employee != null && employeeId == employee.getId()) {
                return employee;
            }
        }
        return null;
    }

    public void update(int employeeId, Employee updatedEmployee) {
        Employee foundEmployee = read(employeeId);
        
      if(foundEmployee!=null){
          foundEmployee.setName(updatedEmployee.getName());
          foundEmployee.setLastName(updatedEmployee.getLastName());
      }
    }

    public void delete(int employeeId) {
       Employee foundEmployee = read(employeeId);
        
      if(foundEmployee!=null){
          foundEmployee.setName(null);
          foundEmployee.setLastName(null);
      }
    }

    public Employee[] getAll() {
        return employeesArr;
    }

}
