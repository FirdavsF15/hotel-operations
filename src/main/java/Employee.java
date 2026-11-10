import java.time.LocalTime;

public class Employee {

    private String name;
    private String employeeId;
    private String department;
    private double payRate;
    private double hoursWorked;
    private int time;

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

    public void punchIn(int time){
        this.time = time;
    }

    public void punchIn(){
        LocalTime now = LocalTime.now();
        int hour = now.getHour();
        int minutes =

        this.time = hour;
    }

    public void punchOut(int time){
        hoursWorked+= time - this.time;
        this.time = 0;
    }

    public void punchOut(){
        LocalTime now = LocalTime.now();
        int hour = now.getHour();

        hoursWorked+=hour - this.time;
    }


}
