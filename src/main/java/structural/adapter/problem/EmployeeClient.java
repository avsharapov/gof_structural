package structural.adapter.problem;

import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {

  public List<EmployeeDB> getEmployeeDBList() {
    List<EmployeeDB> employees      = new ArrayList<>();
    EmployeeDB       employeeFromDB = new EmployeeDB("1234", "John", "Tomson", "john@tomoson.com");
    employees.add(employeeFromDB);

    return employees;
  }

  public List<EmployeeLdap> getEmployeeLDAPList() {
    List<EmployeeLdap> employees      = new ArrayList<>();
    EmployeeLdap employeeFromLdap = new EmployeeLdap("5432", "Alex", "Johnson", "alex@johnson.com");
    employees.add(employeeFromLdap);

    return employees;
  }

  public List<EmployeeCSV> getEmployeeCSVList() {
    List<EmployeeCSV> employees      = new ArrayList<>();
    EmployeeCSV employeeFromCSV = new EmployeeCSV("999,Tom,Piterson,tom@piterson.com");
    employees.add(employeeFromCSV);

    return employees;
  }




}
