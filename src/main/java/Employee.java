public class Employee {

    private String name;
    private String employeeId;
    private String department;
    private double payRate;
    private double hoursWorked;

    public Employee(String name, String employeeId, String department, double payRate, double hoursWorked) {
        this.name = name;
        this.employeeId = employeeId;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    public double getRegularHours(){
        return hoursWorked - getOvertimeHours();
    }

    public double getOvertimeHours(){
        if(hoursWorked>40){
            return hoursWorked-40;
        }
        return 0;
    }

    public double getTotalPay(){
        double total = payRate * getRegularHours();

        if(hoursWorked>40){
            total+= getOvertimeHours() * (1.5*payRate);
        }

        return total;
    }
}
