package SOLID;

// Class responsible only for employee data
public class SRP_02 {

    public static class Employee {
        private int employeeID;
        private String name;

        public Employee(int employeeID, String name) {
            this.employeeID = employeeID;
            this.name = name;
        }

        public int getEmployeeID() {
            return employeeID;
        }

        public String getName() {
            return name;
        }
    }

    // Handles designation and salary logic
    public static class EmployeeService {
        public String getDesignation(int employeeID) {
            // logic to get designation
            return "Software Engineer";
        }

        public void updateSalary(int employeeID) {
            // logic to update salary
        }
    }

    // Handles email communication
    public static class EmailService {
        public void sendMail(String to, String subject, String body) {
            // logic to send email
        }
    }
}
