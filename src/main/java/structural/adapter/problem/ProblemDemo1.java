package structural.adapter.problem;

import java.util.List;

public class ProblemDemo1 {

  public static void main(String[] args) {
    EmployeeClient client    = new EmployeeClient();
      List<EmployeeDB> employeeDBList = client.getEmployeeDBList();
      for (EmployeeDB e : employeeDBList) {
          System.out.println("(" + e.getId() + ") " + e.getFirstName() + " " + e.getLastName());
          System.out.println("Email " + e.getEmail());
      }

      List<EmployeeLdap> employeeLDAPList = client.getEmployeeLDAPList();
      for (EmployeeLdap e : employeeLDAPList) {
          System.out.println("(" + e.getCn() + ") " + e.getGivenName() + " " + e.getSurname());
          System.out.println("Email " + e.getMail());
      }

      List<EmployeeCSV> employeeCSVList = client.getEmployeeCSVList();
      for (EmployeeCSV e : employeeCSVList) {
          System.out.println("(" + e.getId() + ") " + e.getName() + " " + e.getFamilyName());
          System.out.println("Email " + e.getEmailAddress());
      }
  }

}
