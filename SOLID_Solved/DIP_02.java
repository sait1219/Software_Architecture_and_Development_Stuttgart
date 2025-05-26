package SOLID;

public class DIP_02 {

    
    public static interface Notification {
        void doNotify();
    }

    
    public static class EmailNotification implements Notification {
        @Override
        public void doNotify() {
            System.out.println("Sending notification via email!");
        }
    }

    
    public static class SmsNotification implements Notification {
        @Override
        public void doNotify() {
            System.out.println("Sending notification via SMS!");
        }
    }

   
    public static class Employee {
        private Notification notification;

        public Employee(Notification notification) {
            this.notification = notification;
        }

        public void notifyEmployee() {
            notification.doNotify();
        }
    }

    public static void main(String[] args) {
        Notification email = new EmailNotification();
        Notification sms = new SmsNotification();

        Employee employee1 = new Employee(email);
        Employee employee2 = new Employee(sms);

        employee1.notifyEmployee(); 
        employee2.notifyEmployee(); 
    }
}
